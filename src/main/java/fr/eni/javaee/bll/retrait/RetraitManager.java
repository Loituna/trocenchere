package fr.eni.javaee.bll.retrait;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bo.Retrait;

public interface RetraitManager {

	public void insert(Retrait retrait) throws BusinessException;

	public Retrait GetRetraitByID (Retrait retrait) throws BusinessException;
}
