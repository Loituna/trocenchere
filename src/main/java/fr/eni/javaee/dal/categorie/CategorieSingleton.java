/**
 * 
 */
package fr.eni.javaee.dal.categorie;



/**
 * Classe en charge de 
 * @author Megaport
 * @date5 avr. 2023 - 21:30:11
 * @since trocenchere - V0.1
 */
public class CategorieSingleton {
	private static CategorieDAOJDBCImpl instance;
	
	public static CategorieDAOJDBCImpl getInstance() {
		if (instance == null) {
			instance = new CategorieDAOJDBCImpl();
		}
		return instance;
	}

}
