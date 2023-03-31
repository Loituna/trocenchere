package fr.eni.javaee.dal.enchere;

public class EnchereSingleton {
	private static EnchereDAOJdbcImpl instance;
	
	public static EnchereDAOJdbcImpl getInstance() {
		if (instance == null) {
			instance = new EnchereDAOJdbcImpl();
		}
		return instance;
	}
}
