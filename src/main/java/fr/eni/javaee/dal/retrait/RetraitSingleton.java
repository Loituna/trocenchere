package fr.eni.javaee.dal.retrait;

public class RetraitSingleton {
	private static RetraitDAOJDBCImpl instance;

	public static RetraitDao getInstance() {
		if (instance == null) {
			instance = new RetraitDAOJDBCImpl();
		}
		return instance;
	}
}
