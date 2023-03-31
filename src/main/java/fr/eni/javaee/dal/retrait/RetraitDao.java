package fr.eni.javaee.dal.retrait;

import java.sql.SQLException;

import fr.eni.javaee.bll.BusinessException;
import fr.eni.javaee.bo.Retrait;

public interface RetraitDao {
	
	public void insert(Retrait retrait) throws BusinessException;
	
	public Retrait selectByIdRetrait(Integer noUtilisateur) throws SQLException;


}
