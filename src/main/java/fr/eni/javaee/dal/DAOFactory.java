package fr.eni.javaee.dal;

public class DAOFactory {

	
	public static UtilisateurDAO getInstance() {
		return new UtilisateurImpl();
	}
}
