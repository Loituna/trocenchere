package fr.eni.javaee.dal.article;

public class ArticleSingleton {
	private static ArticleDAOJDBCImpl instance;

	public static ArticleDAOJDBCImpl getInstance() {
		if (instance == null) {
			instance = new ArticleDAOJDBCImpl();
		}
		return instance;
	}

}
