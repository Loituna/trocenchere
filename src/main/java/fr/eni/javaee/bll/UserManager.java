package fr.eni.javaee.bll;

import fr.eni.javaee.bo.Utilisateur;


public interface UserManager {

	public void creationUtilisateur(Utilisateur utilisateur);

	public void modificationUtilisateur(Utilisateur utilisateur);

	public void suppressionUtilisateur(Utilisateur utilisateur);

	public void authentificationUtilisateur(String pseudo, String mdp);

	public void deconnexionUtilisateur(Utilisateur utilisateur);

	public void afficherUtilisateur(Utilisateur utilisateur);

}
