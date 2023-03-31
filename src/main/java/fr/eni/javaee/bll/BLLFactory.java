package fr.eni.javaee.bll;

import fr.eni.javaee.bll.article.ArticleManager;
import fr.eni.javaee.bll.article.ArticleManagerSingleton;
import fr.eni.javaee.bll.enchere.EnchereManager;
import fr.eni.javaee.bll.enchere.EnchereManagerSingleton;
import fr.eni.javaee.bll.retrait.RetraitManager;
import fr.eni.javaee.bll.retrait.RetraitManagerSingleton;
import fr.eni.javaee.bll.utilisateur.UserManager;
import fr.eni.javaee.bll.utilisateur.UserManagerSingleton;

public class BLLFactory {
	
	public static ArticleManager getArticleManager() {
		return ArticleManagerSingleton.getInstance();
	}
	public static EnchereManager getEnchereManager() {
		return EnchereManagerSingleton.getInstance();
	}
	public static RetraitManager getRetraitManager() {
		return RetraitManagerSingleton.getInstance();
	}
	public static UserManager getUserManager() {
		return UserManagerSingleton.getInstance();
	}
}
