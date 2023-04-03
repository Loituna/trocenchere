package fr.eni.javaee.bll.retrait;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bo.Retrait;
import fr.eni.javaee.dal.DAOFactory;

class RetraitManagerImpl implements RetraitManager {
	
	
	
	
	@Override
	public void insert(Retrait retrait) throws BusinessException {		
		
		try {
			DAOFactory.getRetraitDao().insert(retrait);
		} catch (BusinessException e) {		
			e.printStackTrace();
		System.out.println("Echec Insert Retrait Manager");;
		}
		
	}


	
}
