package fr.eni.javaee.dal;

import fr.eni.javaee.bo.Enchere;
import fr.eni.javaee.bo.Utilisateur;

public interface EnchereDAO {

	public void venteAricle (Enchere enchere);
	
	public void listerEnchereDeco ();
	
	//Utilisateur en parametre ?
	public void listerEnchereCo (Utilisateur utilisateur);
	
	public void creerEnchere (Enchere enchere);
	
	public void enchereGagnee (Enchere enchere);
	
	public void encherePerdue (Enchere enchere);
	
	public void afficherDetail (Enchere enchere);
}
