package fr.eni.javaee.bll.article;



public class ArticleManagerSingleton {

	
private static ArticleManager instance ;
	
	public static ArticleManager getInstance() {
		if (instance == null) {
			instance = new ArticleManagerImpl();	
		}
		return instance ;
	}
}
