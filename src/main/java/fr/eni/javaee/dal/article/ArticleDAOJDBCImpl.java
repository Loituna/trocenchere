package fr.eni.javaee.dal.article;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import fr.eni.javaee.bll.BusinessException;
import fr.eni.javaee.bo.Article;
import fr.eni.javaee.dal.tools.CodesResultatDAL;
import fr.eni.javaee.dal.tools.ConnectionProvider;

class ArticleDAOJDBCImpl implements ArticleDao {

	private static final String INSERT_ARTICLE = "INSERT INTO `article_vendu` (`nom_article`, `description`, `date_debut`, `date_fin`, `prix_initial`, `prix_vente`, `no_utilisateur`, `retrait_no_article`, `categorie_no_categorie`) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	@Override
	public void insertArticle(Article article) throws BusinessException {
		
		if (article == null) {
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.INSERT_ARTICLE_NULL);
			throw businessException;

		}
		System.out.println(article.toString());
		PreparedStatement pstmt = null;
		try (Connection cnx = ConnectionProvider.getConnection()) {
			pstmt = cnx.prepareStatement(INSERT_ARTICLE, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, article.getNomArticle());
			pstmt.setString(2, article.getDescription());
			pstmt.setDate(3, Date.valueOf(article.getDateDebutEnchere().toLocalDate()));
			pstmt.setDate(4, Date.valueOf(article.getDateFinEnchere().toLocalDate()));
			pstmt.setInt(5, article.getPrixInitial());
			pstmt.setInt(6, article.getPrixInitial());

			ResultSet rs = pstmt.getGeneratedKeys();

			if (rs.next()) {
				article.setNoArticle(rs.getInt(1));
				article.setNomArticle(rs.getNString(2));
				article.setDescription(rs.getNString(3));
				article.setDateDebutEnchere(LocalDateTime.parse(rs.getNString(4)));
				article.setDateFinEnchere(LocalDateTime.parse(rs.getNString(5)));
				article.setPrixInitial(rs.getInt(6));
				article.setPrixVente(rs.getInt(7));

			}
		} catch (Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();

			businessException.ajouterErreur(CodesResultatDAL.INSERT_UTILISATEUR_ECHEC);

			throw businessException;
		} finally {
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();/* , PreparedStatement.RETURN_GENERATED_KEYS */
				}
		}
	}
}
