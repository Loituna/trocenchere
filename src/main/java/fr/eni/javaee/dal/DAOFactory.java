package fr.eni.javaee.dal;

<<<<<<< HEAD
public abstract class DAOFactory {

	public static UtilisateurDAO getUtilisateurDAO () {
		return new UtilisateurDAOJdbcImpl();
	}
	
	public static EnchereDAO getEnchereDAO () {
		return new EnchereDAOJdbcImpl();
=======
public class DAOFactory {

	
	public static UtilisateurDAO getInstance() {
		return new UtilisateurImpl();
>>>>>>> branch 'master' of https://github.com/Loituna/trocenchere.git
	}
}
