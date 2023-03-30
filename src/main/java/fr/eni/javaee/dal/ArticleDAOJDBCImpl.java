package fr.eni.javaee.dal;

import fr.eni.javaee.bll.BusinessException;
import fr.eni.javaee.bo.Article;

public class ArticleDAOJDBCImpl implements ArticleDao {
	private static ArticleDAOJDBCImpl instance;

	public static ArticleDAOJDBCImpl getInstance() {
		if (instance == null) {
			instance = new ArticleDAOJDBCImpl();
		}
		return instance;
	}
	
	
	
	private static final String INSERT_ARTICLE = "INSERT INTO article_vendu(nom_article,description,date_debut,date_fin,prix_initial,prix_vente) VALUES(?,?,?,?,?,?)";
	@Override
	public void insertArticle(Article article) throws BusinessException {
		if (article == null) {
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.INSERT_ARTICLE_NULL);
			throw businessException;
		
		}
		
	}



}
