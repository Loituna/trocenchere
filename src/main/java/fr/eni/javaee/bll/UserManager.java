package fr.eni.javaee.bll;

import fr.eni.javaee.bo.Utilisateur;
import fr.eni.javaee.dal.DAOFactory;
import fr.eni.javaee.dal.UtilisateurDAO;
	

public interface UserManager {
	
<<<<<<< HEAD
	
	
	public void creationUtilisateur(Utilisateur utilisateur) throws BusinessException;
=======
	public void creationUtilisateur(Utilisateur utilisateur) throws BusinessException;
	public void modificationUtilisateur(Utilisateur utilisateur) throws BusinessException;
	public void suppressionUtilisateur(Utilisateur utilisateur) throws BusinessException;
	public Utilisateur getUserByNometPassWord(String nom, String password) throws BusinessException;
	public Utilisateur getUserById(int id) throws BusinessException;
>>>>>>> branch 'master' of https://github.com/Loituna/trocenchere.git

<<<<<<< HEAD
	public void modificationUtilisateur(Utilisateur utilisateur) throws BusinessException;
=======
	public void authentificationUtilisateur(String pseudo, String mdp) throws BusinessException;
>>>>>>> branch 'master' of https://github.com/Loituna/trocenchere.git

<<<<<<< HEAD
	public void suppressionUtilisateur(Utilisateur utilisateur) throws BusinessException;
		
	
=======
	public void deconnexionUtilisateur(Utilisateur utilisateur);
>>>>>>> branch 'master' of https://github.com/Loituna/trocenchere.git

<<<<<<< HEAD
	public void authentificationUtilisateur(String pseudo, String mdp) throws BusinessException;

	public void deconnexionUtilisateur(Utilisateur utilisateur);

=======
>>>>>>> branch 'master' of https://github.com/Loituna/trocenchere.git
	public void afficherUtilisateur(Utilisateur utilisateur);

}
