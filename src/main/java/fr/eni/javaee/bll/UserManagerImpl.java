package fr.eni.javaee.bll;

import fr.eni.javaee.bo.Utilisateur;
import fr.eni.javaee.dal.DAOFactory;
import fr.eni.javaee.dal.UtilisateurDAO;

public class UserManagerImpl implements UserManager {
	private UtilisateurDAO dao = DAOFactory.getUtilisateurDAO();

	@Override
	public void creationUtilisateur(Utilisateur utilisateur) {
		dao.creationUtilisateur(utilisateur);

	}

	@Override
	public void modificationUtilisateur(Utilisateur utilisateur) {
		dao.modificationUtilisateur(utilisateur);

	}

	@Override
	public void suppressionUtilisateur(Utilisateur utilisateur) {
	dao.suppressionUtilisateur(utilisateur);

	}

	@Override
	public void authentificationUtilisateur(Utilisateur utilisateur) {
		try {
			dao.authentificationUtilisateur(utilisateur);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

	@Override
	public void deconnexionUtilisateur(Utilisateur utilisateur) {
		dao.deconnexionUtilisateur(utilisateur);

	}

	@Override
	public void afficherUtilisateur(Utilisateur utilisateur) {
	dao.afficherUtilisateur(utilisateur);

	}

}
