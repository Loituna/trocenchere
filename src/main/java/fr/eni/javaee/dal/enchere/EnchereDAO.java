package fr.eni.javaee.dal.enchere;

import fr.eni.javaee.bo.Enchere;
import fr.eni.javaee.bo.Utilisateur;
import fr.eni.javaee.dal.tools.DalException;

public interface EnchereDAO {

	public void venteArticle (Enchere enchere)throws DalException;
	
	public void listerEnchereDeco ()throws DalException;
	
	//Utilisateur en parametre ?
	public void listerEnchereCo (Utilisateur utilisateur)throws DalException;
	
	public void creerEnchere (Enchere enchere)throws DalException;
	
	public void enchereGagnee (Enchere enchere)throws DalException;
	
	public void encherePerdue (Enchere enchere)throws DalException;
	
	public void afficherDetail (Enchere enchere)throws DalException;

	public void updateEnchere(Enchere enchere)throws DalException;
}
