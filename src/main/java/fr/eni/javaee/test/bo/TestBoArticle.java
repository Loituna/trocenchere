package fr.eni.javaee.test.bo;

import java.time.LocalDateTime;

import fr.eni.javaee.bo.Article;

public class TestBoArticle {

	public static void main(String[] args) {
		
	// Création des dateDebutEnchere et dateFinEnchere
	
	// dateDebutEnchere initialisée à la date actuelle
	LocalDateTime dateDebutEnchere = LocalDateTime.now();
	// dateFinEnchere initialisée à la date actuelle + 9 heures
	LocalDateTime dateFinEnchere = LocalDateTime.now().plusHours(9);
	
	// Création d'un nouvel article
	Article article = new Article();
	
	article.setNoArticle(1);
	article.setNomArticle("carte graphique");
	article.setDescription("carte de ouf");
	article.setDateDebutEnchere(dateDebutEnchere);
	article.setDateFinEnchere(dateFinEnchere);
	article.setPrixInitial(100);
	article.setPrixVente(222);
	article.setEtatVente(true);
	article.setNoCategorie(null);
	article.setNoUtilisateur(null);
	
	System.out.println(article.toString());
	
	}
}
