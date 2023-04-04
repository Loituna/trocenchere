package fr.eni.javaee.bll.enchere;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bo.Enchere;
import fr.eni.javaee.dal.DAOFactory;
import fr.eni.javaee.dal.tools.DalException;

class EnchereManagerImpl implements EnchereManager {

	@Override
	public void creationEnchere(Enchere enchere) throws BusinessException {
		
		
		try {
			DAOFactory.getEnchereDAO().creerEnchere(enchere);
		} catch (DalException e) {
			System.out.println("Erreur Enchere Manager");
			e.printStackTrace();
		}
	}

}
