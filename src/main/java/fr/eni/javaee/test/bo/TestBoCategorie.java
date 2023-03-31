package fr.eni.javaee.test.bo;

import java.util.ArrayList;
import java.util.List;

import fr.eni.javaee.bo.Article;
import fr.eni.javaee.bo.Categorie;

public class TestBoCategorie {

	public static void main(String[] args) {
		//creation d'une categorie
		 Categorie informatique = new Categorie(1, "Informatique");
		 Categorie sport = new Categorie(2,"Sport");
		 
		 //test getters premiere categorie
		 System.out.println("Numero : " + informatique.getNoCategorie());
		 System.out.println("Libelle : " + informatique.getLibelle());
		 
		 System.out.println();
		 
		 //test getters deuxieme categorie
		 System.out.println("Numero : " + sport.getNoCategorie());
		 System.out.println("Libelle : " + sport.getLibelle());
		 
		 System.out.println();
		 
		 //test getter et setter de la List<Article>
		 List<Article> listeArticleCategorie = new ArrayList<Article>();	
			Article article = new Article();
			Article article2 = new Article();
			article.setNomArticle("gtx 2080");
			article.setNoCategorie(1);
			article2.setNomArticle("gtw 740");
			article2.setNoCategorie(1);
			
		
			
			listeArticleCategorie.add(article);
			listeArticleCategorie.add(article2);
			
			informatique.setListCategorieArticle(listeArticleCategorie);
			List<Article> resultat = informatique.getListCategorieArticle();
			
			System.out.println(listeArticleCategorie);
			
			System.out.println();
			
			if(resultat.equals(listeArticleCategorie)) {
				System.out.println("les getter et setter de la listeArticleCategorie fonctionnent");
			}else {
				System.out.println("les getter et setter de la listeArticleCategorie ne fonctionnent pas");
			}

			System.out.println();
	}
}
