package fr.eni.javaee.bll.utilisateur;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bo.Utilisateur;

public interface UserManager {

	public void creationUtilisateur(Utilisateur utilisateur) throws BusinessException;

	public void modificationUtilisateur(Utilisateur utilisateur) throws BusinessException;

	public void suppressionUtilisateur(Utilisateur utilisateur) throws BusinessException;

	public Utilisateur getUserByNometPassWord(String nom, String password) throws BusinessException;

	public Utilisateur getUserById(int id) throws BusinessException;

	public Utilisateur authentificationUtilisateur(String pseudo, String mdp) throws BusinessException;

	public void deconnexionUtilisateur(Utilisateur utilisateur);

	public void afficherUtilisateur(Utilisateur utilisateur);

}
