package fr.eni.javaee.dal;

import fr.eni.javaee.bll.BusinessException;
import fr.eni.javaee.bo.Utilisateur;

public interface UtilisateurDAO {

	public void creationUtilisateur(Utilisateur utilisateur) throws BusinessException;

	public void modificationUtilisateur(Utilisateur utilisateur) throws BusinessException;

	public void suppressionUtilisateur(Integer noUtilisateur) throws BusinessException;

	public void authentificationUtilisateur(Utilisateur utilisateur) throws BusinessException;

	public void deconnexionUtilisateur(Utilisateur utilisateur) ;

	public void afficherUtilisateur(Utilisateur utilisateur);

}
