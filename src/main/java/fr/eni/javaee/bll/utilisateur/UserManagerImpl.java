package fr.eni.javaee.bll.utilisateur;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bo.Utilisateur;
import fr.eni.javaee.dal.DAOFactory;
import fr.eni.javaee.dal.utilisateur.UtilisateurDAO;

public class UserManagerImpl implements UserManager {


	@Override
	public void creationUtilisateur(Utilisateur utilisateur) throws BusinessException {
		DAOFactory.getUtilisateurDAO().creationUtilisateur(utilisateur);
	

	}

	@Override
	public void modificationUtilisateur(Utilisateur utilisateur) throws BusinessException {
		DAOFactory.getUtilisateurDAO().modificationUtilisateur(utilisateur);

	}

	@Override
	public void suppressionUtilisateur(Utilisateur utilisateur) throws BusinessException {
		DAOFactory.getUtilisateurDAO().suppressionUtilisateur(utilisateur);

	}

	@Override

	public Utilisateur authentificationUtilisateur(String pseudo, String mdp) {

		// Utilisateur instance = new Utilisateur(pseudo,mdp);

		Utilisateur instance = new Utilisateur();
		instance.setMdp(mdp);
		instance.setPseudo(pseudo);
		try {
			DAOFactory.getUtilisateurDAO().authentificationUtilisateur(instance);
			System.out.println(instance.getMdp());
			System.out.println(instance.getPseudo());
		} catch (BusinessException e) {
			e.printStackTrace();
			System.out.println("Erreur coo depuis manager");
		}
		return instance;
	}

	@Override
	public void deconnexionUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afficherUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub

	}

	@Override
	public Utilisateur getUserByNometPassWord(String nom, String password) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur getUserById(int id) throws BusinessException {
		return DAOFactory.getUtilisateurDAO().selectByNoUtilisateur(id);
	}
}
