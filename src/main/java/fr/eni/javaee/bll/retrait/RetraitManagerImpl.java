package fr.eni.javaee.bll.retrait;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bo.Retrait;
import fr.eni.javaee.dal.DAOFactory;
import fr.eni.javaee.dal.tools.DalException;

class RetraitManagerImpl implements RetraitManager {
	
	
	
	
	@Override
	public void insert(Retrait retrait) throws BusinessException {		
		
		try {
			DAOFactory.getRetraitDao().insert(retrait);
		} catch (DalException e) {		
			e.printStackTrace();
		System.out.println("Echec Insert Retrait Manager");;
		}
		
	}


	
}
