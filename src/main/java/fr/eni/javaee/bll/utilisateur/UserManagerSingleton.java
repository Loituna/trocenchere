package fr.eni.javaee.bll.utilisateur;

public class UserManagerSingleton {
	
	private static UserManager instance ;
	
	public static UserManager getInstance() {
		if (instance == null) {
			instance = new UserManagerImpl();	
		}
		return instance ;
	}
	  
}
