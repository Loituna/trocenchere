package fr.eni.javaee.dal.retrait;

import fr.eni.javaee.bll.BusinessException;
import fr.eni.javaee.bo.Retrait;

public interface RetraitDao {
	
	public void insert(Retrait retrait) throws BusinessException;


}
