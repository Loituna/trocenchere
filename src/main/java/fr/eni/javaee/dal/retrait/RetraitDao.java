package fr.eni.javaee.dal.retrait;

import fr.eni.javaee.bo.Retrait;
import fr.eni.javaee.dal.tools.DalException;

public interface RetraitDao {
	
	public void insert(Retrait retrait) throws DalException;
	
	public Retrait selectByIdRetrait(Integer noUtilisateur) throws DalException;

	public void updateArticleByUser()throws DalException;


}
