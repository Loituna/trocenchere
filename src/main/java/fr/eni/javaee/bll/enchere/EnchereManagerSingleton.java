package fr.eni.javaee.bll.enchere;

public class EnchereManagerSingleton {

private static EnchereManager instance ;
	
	public static EnchereManager getInstance() {
		if (instance == null) {
			instance = new EnchereManagerImpl();	
		}
		return instance ;
	}
}
