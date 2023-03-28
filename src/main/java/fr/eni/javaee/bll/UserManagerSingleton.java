package fr.eni.javaee.bll;

public class UserManagerSingleton {
	
	private static UserManager instance ;
	
	public static UserManager getInstance() {
		if (instance == null) {
			instance = new UserManagerImpl();
			
		}
		return instance ;
	}
	
}
