package fr.eni.javaee.bll.utilisateur;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bo.Utilisateur;
import fr.eni.javaee.dal.DAOFactory;
import fr.eni.javaee.dal.tools.DalException;

class UserManagerImpl implements UserManager {

	@Override
	public void creationUtilisateur(Utilisateur utilisateur) throws BusinessException {
		try {
			DAOFactory.getUtilisateurDAO().creationUtilisateur(utilisateur);
		} catch (DalException  e) {
			System.out.println("Echec Creation UserManager");
			e.printStackTrace();
		}

	}

	@Override
	public void modificationUtilisateur(Utilisateur utilisateur) throws BusinessException {
		try {
			DAOFactory.getUtilisateurDAO().modificationUtilisateur(utilisateur);
		} catch (DalException e) {
			System.out.println("Echec Modification UserManager");
			e.printStackTrace();
		}

	}

	@Override
	public void suppressionUtilisateur(Utilisateur utilisateur) throws BusinessException {
		try {
			DAOFactory.getUtilisateurDAO().suppressionUtilisateur(utilisateur);
		} catch (DalException e) {
			System.out.println("Echec Suppresion UserManager");
			e.printStackTrace();
		}

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
		} catch (DalException e) {
			e.printStackTrace();
			System.out.println("Echec Authentification UserManager");
		}
		return instance;
	}

	@Override
	public void deconnexionUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub

	}

	@Override
	public Utilisateur getUserById(int id)  throws BusinessException {
		Utilisateur User = null;
		try {
			 User =DAOFactory.getUtilisateurDAO().selectByNoUtilisateur(id);
		} catch (DalException e) {
			e.printStackTrace();
			System.out.println("Echec Authentification UserManager");
		}
		return User;
	}
}
