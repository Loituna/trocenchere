package fr.eni.javaee.bll.enchere;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bo.Enchere;
import fr.eni.javaee.dal.DAOFactory;

class EnchereManagerImpl implements EnchereManager {

	@Override
	public void creationEnchere(Enchere enchere) throws BusinessException {
		DAOFactory.getEnchereDAO().creerEnchere(enchere);
	}

}
