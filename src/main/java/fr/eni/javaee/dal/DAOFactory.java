package fr.eni.javaee.dal;

public abstract class DAOFactory {

	public static UtilisateurDAO getUtilisateurDAO () {
		return new UtilisateurDAOJdbcImpl();
	}
	
	public static EnchereDAO getEnchereDAO () {
		return new EnchereDAOJdbcImpl();
	}
}
