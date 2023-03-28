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

	public void authentificationUtilisateur(String pseudo, String mdp) {

		// Utilisateur instance = new Utilisateur(pseudo,mdp);

		Utilisateur instance = new Utilisateur();
		instance.setMdp(mdp);
		instance.setPseudo(pseudo);
		try {
			dao.authentificationUtilisateur(instance);
		} catch (BusinessException e) {
			e.printStackTrace();
			System.out.println("Erreur coo depuis servlet");
		}
	}

	@Override
	public void deconnexionUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afficherUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub

	}
}
