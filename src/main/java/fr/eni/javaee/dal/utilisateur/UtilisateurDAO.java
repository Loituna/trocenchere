package fr.eni.javaee.dal.utilisateur;

import fr.eni.javaee.bo.Utilisateur;
import fr.eni.javaee.dal.tools.DalException;

public interface UtilisateurDAO {

	public void creationUtilisateur(Utilisateur utilisateur) throws DalException;

	public void modificationUtilisateur(Utilisateur utilisateur) throws DalException;

	public void suppressionUtilisateur(Utilisateur utilisateur) throws DalException;

	public Utilisateur authentificationUtilisateur(Utilisateur utilisateur) throws  DalException;		
	
	public Utilisateur selectByNoUtilisateur (Utilisateur utilisateur)throws DalException ;

}
