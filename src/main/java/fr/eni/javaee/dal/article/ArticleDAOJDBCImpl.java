package fr.eni.javaee.dal.article;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.javaee.bo.Article;
import fr.eni.javaee.bo.Retrait;
import fr.eni.javaee.dal.DAOFactory;
import fr.eni.javaee.dal.tools.CodesResultatDAL;
import fr.eni.javaee.dal.tools.ConnectionProvider;
import fr.eni.javaee.dal.tools.DalException;

class ArticleDAOJDBCImpl implements ArticleDao {

	private static final String INSERT_ARTICLE = "INSERT "
			+ "INTO `article_vendu` "
			+ "(`nom_article`, `description`, `date_debut`, `date_fin`, `prix_initial`, `prix_vente`, `etat_vente`, `no_utilisateur`, `no_categorie`)"
			+ " VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final String SELECT_BY_ID = "SELECT "
			+ "nom_article, description, date_debut, date_fin, prix_initial, prix_vente, etat_vente, no_utilisateur, no_categorie "
			+ "FROM Article_vendu "
			+ "WHERE no_article=?";
	

	@Override
	public void insertArticle(Article article,Retrait retrait) throws DalException {
		
		if (article == null) {
			DalException DalException = new DalException();
			DalException.addSuppressed(DalException);
			throw DalException;

		}
		System.out.println(article.toString()+"Avant Insert DAL");
		 
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement	pstmt = cnx.prepareStatement(INSERT_ARTICLE, PreparedStatement.RETURN_GENERATED_KEYS);
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
			
			
		
			if (rs.next()) {
	
				article.setNoArticle(rs.getInt(1));
				
				System.out.println(article.toString()+"Aprés Insert DAL");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Echec insert catch");
			DalException DalException = new DalException();
			throw DalException;
		}
			
		retrait.setNoArticle(article.getNoArticle());
		
		
		try {
			DAOFactory.getRetraitDao().insert(retrait);
		} catch (DalException e) {
			System.out.println("Echec Insert Retrait Depuis Insert Article DAO");
			e.printStackTrace();
		}

			

		


	}
	
	public Article selectByNoArticle(Integer noArticle) throws DalException{
		Article article = new Article();
		try (Connection cnx = ConnectionProvider.getConnection()){
			PreparedStatement pstmt = cnx.prepareStatement(SELECT_BY_ID);
			pstmt.setInt(1, noArticle);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				
				article.setNomArticle(rs.getString("nom_Article"));
				article.setDescription(rs.getString("description"));
				article.setDateDebutEnchere(rs.getTimestamp("date_debut").toLocalDateTime());
				article.setDateFinEnchere(rs.getTimestamp("date_fin").toLocalDateTime());
				article.setPrixInitial(rs.getInt("prix_initial"));
				article.setPrixVente(rs.getInt("prix_vente"));
				article.setEtatVente(rs.getBoolean("etat_vente"));
				article.setNoUtilisateur(rs.getInt("no_utilisateur"));
				article.setNoCategorie(rs.getInt("no_categorie"));
				
				
			}
		} catch (SQLException e) {
			System.out.println("Echec Select Article BY ID DAL");
			e.printStackTrace();
		}
		return article;

		
	}

	private static final String UPDATE_ARTICLE_BY_USER = "UPDATE "
			+ "article_vendu "
			+ "set nom_article=?, description=?, date_fin=?, no_categorie=? "
			+ "WHERE no_article=?";
	@Override
	public void updateArticleByUser(Article article, Retrait retrait) throws DalException {
		if ((article== null)||(retrait==null)){
			DalException DalException = new DalException();
			DalException.ajouterErreur(CodesResultatDAL.UPDATE_ARTICLE_NULL);
			System.out.println("Article Update DAL Null");			
		}
		
		retrait.setNoArticle(article.getNoArticle());
		System.out.println(retrait+"retrait DAL article");
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(UPDATE_ARTICLE_BY_USER);
			
			pstmt.setString(1, article.getNomArticle());
			pstmt.setString(2, article.getDescription());
			pstmt.setDate(3, Date.valueOf(article.getDateFinEnchere().toLocalDate()));
			pstmt.setInt(4, article.getNoCategorie());
			pstmt.setInt(5, article.getNoArticle());
			pstmt.executeUpdate();
			
		} 	
		catch (SQLException e) {
			System.out.println("SQL Exception UpdateArticleByUser DAL");
			e.printStackTrace();
			DalException dalException = new DalException();
			dalException.ajouterErreur(CodesResultatDAL.ECHEC_UPDATE_ARTICLE);
		}
		
		System.out.println("patate");
		
		try {
			System.out.println("2 patate");
			DAOFactory.getRetraitDao().updateArticleByUser(retrait);
		} catch (DalException e) {
			System.out.println("Echec Insert Retrait Dans updateArticleByUser");
			e.printStackTrace();
		}
	
	}
}
