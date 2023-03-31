package fr.eni.javaee.dal.utilisateur;

import java.sql.SQLException;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bo.Utilisateur;
import fr.eni.javaee.dal.tools.DalException;

public interface UtilisateurDAO {

	public void creationUtilisateur(Utilisateur utilisateur) throws DalException;

	public void modificationUtilisateur(Utilisateur utilisateur) throws DalException;

	public void suppressionUtilisateur(Utilisateur utilisateur) throws DalException;

	public Utilisateur authentificationUtilisateur(Utilisateur utilisateur) throws  DalException;

	public void deconnexionUtilisateur(Utilisateur utilisateur)throws DalException ;	
	
	public Utilisateur selectByNoUtilisateur (Integer noUtilisateur)throws DalException ;

}
