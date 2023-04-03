package fr.eni.javaee.test.bo;

import java.time.LocalDateTime;

import fr.eni.javaee.bo.Article;

public class TestBoArticle {

	public static void main(String[] args) {
		
	
	// dateDebutEnchere initialisée à la date actuelle
	LocalDateTime dateDebutEnchere = LocalDateTime.now();
	// dateFinEnchere initialisée à la date actuelle + 9 heures
	LocalDateTime dateFinEnchere = LocalDateTime.now().plusHours(9);
	
	// Création d'un nouvel article
	Article article = new Article();
	
	article.setNoArticle(1);
	article.setNomArticle("3070");
	article.setDescription("carte de ouf");
	article.setDateDebutEnchere(dateDebutEnchere);
	article.setDateFinEnchere(dateFinEnchere);
	article.setPrixInitial(100);
	article.setPrixVente(222);
	article.setEtatVente(true);
	article.setNoCategorie(null);
	article.setNoUtilisateur(null);
	
	Article article2 = new Article();
	
	article2.setNoArticle(1);
	article2.setNomArticle("3070");
	article2.setDescription("carte de ouf");
	article2.setDateDebutEnchere(dateDebutEnchere);
	article2.setDateFinEnchere(dateFinEnchere);
	article2.setPrixInitial(100);
	article2.setPrixVente(222);
	article2.setEtatVente(true);
	article2.setNoCategorie(null);
	article2.setNoUtilisateur(null);
	
	// test methode toString
	System.out.println(article.toString());
	
	System.out.println();
	
	System.out.println(article2.toString());
	
	System.out.println();
	
	//test des getters
	System.out.println("Numero " + article.getNoArticle());
	System.out.println("Nom " + article.getNomArticle());
	System.out.println("Description " + article.getDescription());
	System.out.println("Date de début de l'enchère " + article.getDateDebutEnchere());
	System.out.println("Date de fin de l'enchère " + article.getDateFinEnchere());
	System.out.println("Prix initial " + article.getPrixInitial());
	System.out.println("Prix de vente " + article.getPrixVente());
	System.out.println("Etat de la vente " + article.getEtatVente());
	System.out.println("Numero Categorie " + article.getNoCategorie());
	System.out.println("Numero Utilisateur " + article.getNoUtilisateur());
	
	System.out.println();
	
	// test setter NomArticle
	Article article3 = new Article();
	article3.setNomArticle("4090");
	
		//sysout de debogage
	System.out.println("Nom de l'article = " + article3.getNomArticle());
	if (!article3.getNomArticle().equals("4090")) {
		System.out.println("le setNomArticle ne fonctionne pas");
	} else {
		System.out.println("le setNomArticle fonctionne bien");
	}
	
	System.out.println();
	
	
	// test equals
	if(article.equals(article2)) {
		System.out.println("les deux articles sont identiques");
	}else {
		System.out.println("les deux articles sont différents");
	}
	
	System.out.println();
	
	// test hashcode
	if(article.hashCode()==article2.hashCode()) {
		System.out.println("test hashcode réussie");
	}else {
		System.out.println("test hashcode échoué");
	}
	
	}
	
}
