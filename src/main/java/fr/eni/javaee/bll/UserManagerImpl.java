package fr.eni.javaee.bll;

import fr.eni.javaee.bo.Utilisateur;
import fr.eni.javaee.dal.DAOFactory;
import fr.eni.javaee.dal.UtilisateurDAO;

public class UserManagerImpl implements UserManager {
	private UtilisateurDAO dao = DAOFactory.getUtilisateurDAO();

	@Override
	public void creationUtilisateur(Utilisateur utilisateur) throws BusinessException {
		dao.creationUtilisateur(utilisateur);

	}

	@Override
	public void modificationUtilisateur(Utilisateur utilisateur) throws BusinessException {
		dao.modificationUtilisateur(utilisateur);

	}

	@Override
	public void suppressionUtilisateur(Utilisateur utilisateur) throws BusinessException {
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
			System.out.println("Erreur coo depuis manager");
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

	@Override
	public Utilisateur getUserByNometPassWord(String nom, String password) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur getUserById(int id) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}
}
