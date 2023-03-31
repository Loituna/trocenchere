package fr.eni.javaee.bll.retrait;

public class RetraitManagerSingleton {

	 
	
	private static RetraitManager instance ;
	
	public static RetraitManager getInstance() {
		if (instance == null) {
			instance = new RetraitManagerImpl();	
		}
		return instance ;
	}
}
