/**
 * 
 */
package fr.eni.javaee.dal.categorie;

import fr.eni.javaee.bo.Categorie;
import fr.eni.javaee.dal.tools.DalException;

/**
 * Classe en charge de 
 * @author Megaport
 * @date5 avr. 2023 - 21:24:52
 * @since trocenchere - V0.1
 */
public interface CategorieDao {
	
	public Categorie getCategorieByID (Categorie categorie)throws DalException;

}
