package fr.eni.javaee.test.dal;

import fr.eni.javaee.bo.Retrait;
import fr.eni.javaee.dal.DAOFactory;
import fr.eni.javaee.dal.tools.DalException;

public class TestDAL {
	
	public static void main(String[] args) {
		
		Retrait EssaiInsert = new Retrait();
		EssaiInsert.setCodePostal("35520");
		EssaiInsert.setRue("La rue des patates");
		EssaiInsert.setVille("La ville des patates");
		
		System.out.println(EssaiInsert.toString());
		
		try {
			DAOFactory.getRetraitDao().insert(EssaiInsert);
			System.out.println("Reussite De l'insert dans la classe de test");
		} catch (DalException e) {
			System.out.println("Echec De l'insert dans la classe de test");
			e.printStackTrace();
		}
	}

}
