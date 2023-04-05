package fr.eni.javaee.bll.enchere;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bo.Enchere;


public interface EnchereManager {

	public void creationEnchere(Enchere enchere) throws BusinessException;

	
	public void updateEnchere (Enchere enchere) throws BusinessException;
	
	public void selectByIdEnchere (Enchere enchere) throws BusinessException;
}
