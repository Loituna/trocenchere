package fr.eni.javaee.bll;

import fr.eni.javaee.bo.Utilisateur;
import fr.eni.javaee.dal.DAOFactory;
import fr.eni.javaee.dal.UtilisateurDAO;
	

public interface UserManager {
	
	
	
	public void creationUtilisateur(Utilisateur utilisateur) throws BusinessException;

	public void modificationUtilisateur(Utilisateur utilisateur) throws BusinessException;

	public void suppressionUtilisateur(Utilisateur utilisateur) throws BusinessException;
		
	

	public void authentificationUtilisateur(String pseudo, String mdp) throws BusinessException;

	public void deconnexionUtilisateur(Utilisateur utilisateur);

	public void afficherUtilisateur(Utilisateur utilisateur);

}
