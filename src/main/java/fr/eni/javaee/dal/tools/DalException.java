package fr.eni.javaee.dal.tools;

import java.util.ArrayList;
import java.util.List;

public class DalException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private List<Integer> listeCodesErreur = new ArrayList<Integer>();
	
	public void ajouterErreur(int code) {

		if(!this.listeCodesErreur.contains(code))
		{
			this.listeCodesErreur.add(code);
		}
		
	}
	public boolean hasErreurs()
	{
		return this.listeCodesErreur.size()>0;
	}
	
	public List<Integer> getListeCodesErreur()
	{
		return this.listeCodesErreur;
	}
}
