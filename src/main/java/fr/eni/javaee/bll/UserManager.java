package fr.eni.javaee.bll;

import fr.eni.javaee.bo.Utilisateur;
import fr.eni.javaee.dal.DAOFactory;
import fr.eni.javaee.dal.UtilisateurDAO;
	

public class UserManager {
	
	private UtilisateurDAO utilisateurDAO;
	public UserManager() {
		this.utilisateurDAO = DAOFactory.getUtilisateurDAO();
	}
	
	public void creationUtilisateur(Utilisateur utilisateur) throws BusinessException {
	}

	public void modificationUtilisateur(Utilisateur utilisateur) throws BusinessException {
	}

	public void suppressionUtilisateur(Integer noUtilisateur) throws BusinessException{
		this.utilisateurDAO.suppressionUtilisateur(noUtilisateur);
	}

	public void authentificationUtilisateur(String pseudo, String mdp) throws BusinessException {
	}

	public void deconnexionUtilisateur(Utilisateur utilisateur) {
	}

	public void afficherUtilisateur(Utilisateur utilisateur) {
	}

}
