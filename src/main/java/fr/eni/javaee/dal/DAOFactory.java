package fr.eni.javaee.dal;

public abstract class DAOFactory {

	public static UtilisateurDAO getUtilisateurDAO() {
		return UtilisateurDAOJdbcImpl.getInstance();
	}

	public static EnchereDAO getEnchereDAO() {
		return  EnchereDAOJdbcImpl.getInstance();

	}

	public static ArticleDao getArticleDao() {
		return ArticleDAOJDBCImpl.getInstance();

	}
}
