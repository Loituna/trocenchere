package fr.eni.javaee.dal.utilisateur;

import fr.eni.javaee.bll.BusinessException;
import fr.eni.javaee.bo.Utilisateur;

public interface UtilisateurDAO {

	public void creationUtilisateur(Utilisateur utilisateur) throws BusinessException;

	public void modificationUtilisateur(Utilisateur utilisateur) throws BusinessException;

	public void suppressionUtilisateur(Utilisateur utilisateur) throws BusinessException;

	public Utilisateur authentificationUtilisateur(Utilisateur utilisateur) throws BusinessException;

	public void deconnexionUtilisateur(Utilisateur utilisateur) ;	
	
	public Utilisateur selectByNoUtilisateur (Integer noUtilisateur) ;

}
