package fr.eni.javaee.bll.enchere;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bo.Enchere;
import fr.eni.javaee.dal.DAOFactory;
import fr.eni.javaee.dal.tools.DalException;

class EnchereManagerImpl implements EnchereManager {

	@Override
	public void creationEnchere(Enchere enchere) throws BusinessException {
		System.out.println(enchere+"creation Enchere Manager ");
		try {
			DAOFactory.getEnchereDAO().creerEnchere(enchere);
		} catch (DalException e) {
			System.out.println("Erreur Insert Enchere Manager");
			e.printStackTrace();
		}
	}

	@Override
	public void updateEnchere (Enchere enchere) throws BusinessException{
		
		System.out.println(enchere+"Update Enchere Manager ");
			try {
				DAOFactory.getEnchereDAO().updateEnchere(enchere);
			} catch (DalException e) {
				System.out.println("Erreur Update Enchere Manager");
				e.printStackTrace();
			}
		 
	}

	@Override
	public Enchere selectByIdEnchere(Enchere enchere) throws BusinessException {
		System.out.println(enchere+"SelectById Enchere Manager ");
		try {
			DAOFactory.getEnchereDAO().selectByIdEnchere(enchere);
		} catch (DalException e) {
			System.out.println("Erreur Select By Id Manager");
			e.printStackTrace();
		}
		return enchere;
		
	}
}
