package fr.eni.javaee.test.bo;

import java.time.LocalDate;

import fr.eni.javaee.bo.Enchere;

public class TestBoEnchere {

	public static void main(String[] args) {
		
		LocalDate dateEnchere  = LocalDate.now();
		Enchere enchere = new Enchere();
		
		enchere.setNoEnchere(1);
		enchere.setDateEnchere(dateEnchere);
		enchere.setMontant(100);
		enchere.setNoArticle(1);
		enchere.setNoUtilisateur(1);
		
		Enchere enchere2 = new Enchere();
		
		enchere2.setNoEnchere(2);
		enchere2.setDateEnchere(dateEnchere);
		enchere2.setMontant(200);
		enchere2.setNoArticle(2);
		enchere2.setNoUtilisateur(1);
		
		//test toString
		System.out.println(enchere.toString());
		
		System.out.println();
		
		System.out.println(enchere2.toString());
		
		System.out.println();
		
		
		// test getters 
		
		System.out.println("Numero : " + enchere.getNoEnchere());
		System.out.println("Date enchere : " + enchere.getDateEnchere());
		System.out.println("Montant de depart : " + enchere.getMontant());
		System.out.println("Article : " + enchere.getNoArticle());
		System.out.println("Uilisateur : " + enchere.getNoUtilisateur());
		
		System.out.println();
		
		// test setter Montant
		Enchere enchere3 = new Enchere();
		enchere3.setMontant(200);
		//sysout debogage
		System.out.println("Montant enchere : " + enchere3.getMontant());
		
		if (!enchere3.getMontant().equals(200)) {
			System.out.println("le setMontant ne fonctionne pas ");
		}else {
			System.out.println("le setMontant fonctionne");
		}
		
		System.out.println();
		
		// test hashcode
		
		if(enchere.hashCode()==enchere2.hashCode()) {
			System.out.println("test hashcode success");
		}else {
			System.out.println("test hashcode fail");
		}
		
		System.out.println();
		// test equals
		if(enchere.equals(enchere2)) {
			System.out.println("les deux encheres sont similaires");
		}else {
			System.out.println("les deux encheres sont bien differentes");
		}
		
	}
	
	
}
