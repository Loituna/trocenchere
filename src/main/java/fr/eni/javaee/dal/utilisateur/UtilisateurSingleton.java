package fr.eni.javaee.dal.utilisateur;

public class UtilisateurSingleton {

	
private static UtilisateurDAOJdbcImpl instance ;
	
	public static UtilisateurDAOJdbcImpl getInstance() {
		if (instance == null) {
			instance = new UtilisateurDAOJdbcImpl();
		}
		return instance ;
	}
}
