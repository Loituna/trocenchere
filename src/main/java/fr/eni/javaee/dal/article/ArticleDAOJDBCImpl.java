package fr.eni.javaee.dal.article;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bo.Article;
import fr.eni.javaee.bo.Retrait;
import fr.eni.javaee.dal.DAOFactory;
import fr.eni.javaee.dal.tools.CodesResultatDAL;
import fr.eni.javaee.dal.tools.ConnectionProvider;

class ArticleDAOJDBCImpl implements ArticleDao {

	private static final String INSERT_ARTICLE = "INSERT INTO `article_vendu` "
			+ "(`nom_article`, `description`, `date_debut`, `date_fin`, `prix_initial`, `prix_vente`, `etat_vente`, `no_utilisateur`, `no_categorie`)"
			+ " VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	@Override
	public void insertArticle(Article article,Retrait retrait) throws SQLException {
		
		if (article == null) {
			SQLException SQLException = new SQLException();
			SQLException.addSuppressed(SQLException);
			throw SQLException;

		}
		System.out.println(article.toString()+"Avant Insert DAL");
		PreparedStatement pstmt = null;
		try (Connection cnx = ConnectionProvider.getConnection()) {
			pstmt = cnx.prepareStatement(INSERT_ARTICLE, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, article.getNomArticle());
			pstmt.setString(2, article.getDescription());
			pstmt.setDate(3, Date.valueOf(article.getDateDebutEnchere().toLocalDate()));
			pstmt.setDate(4, Date.valueOf(article.getDateFinEnchere().toLocalDate()));
			pstmt.setInt(5, article.getPrixInitial());
			pstmt.setInt(6, article.getPrixInitial());
			pstmt.setBoolean(7,article.getEtatVente());
			pstmt.setInt(8, article.getNoUtilisateur());			
			pstmt.setInt(9, article.getNoCategorie());
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			
			
			System.out.println("Ca passe peut etre la");
			if (rs.next()) {
				System.out.println("Ici on sais que ça passe pas !");
				article.setNoArticle(rs.getInt(1));
				
				System.out.println(article.toString()+"Aprés Insert DAL");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Echec insert catch");
			SQLException SQLException = new SQLException();
			throw SQLException;
		}
			
		retrait.setNoArticle(article.getNoArticle());
		
		
		try {
			DAOFactory.getRetraitDao().insert(retrait);
		} catch (BusinessException e) {
		System.out.println("Echec Insert Retrait Depuis Insert Article DAO");
			e.printStackTrace();
		}
			
			

		
	}
}
