package fr.eni.javaee.dal;

import fr.eni.javaee.dal.article.ArticleDao;
import fr.eni.javaee.dal.article.ArticleSingleton;
import fr.eni.javaee.dal.enchere.EnchereDAO;
import fr.eni.javaee.dal.enchere.EnchereSingleton;
import fr.eni.javaee.dal.retrait.RetraitDao;
import fr.eni.javaee.dal.retrait.RetraitSingleton;
import fr.eni.javaee.dal.utilisateur.UtilisateurDAO;
import fr.eni.javaee.dal.utilisateur.UtilisateurSingleton;

public abstract class DAOFactory {

	public static UtilisateurDAO getUtilisateurDAO() {
		return UtilisateurSingleton.getInstance();
	}

	public static EnchereDAO getEnchereDAO() {
		return  EnchereSingleton.getInstance();

	}

	public static ArticleDao getArticleDao() {
		return ArticleSingleton.getInstance();

	}
	public static RetraitDao getRetraitDao() {
		return RetraitSingleton.getInstance();
	}
}
