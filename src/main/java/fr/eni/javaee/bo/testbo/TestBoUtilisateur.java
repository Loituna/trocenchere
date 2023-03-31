package fr.eni.javaee.bo.testbo;

import java.util.ArrayList;
import java.util.List;

import fr.eni.javaee.bo.Article;
import fr.eni.javaee.bo.Utilisateur;

public class TestBoUtilisateur {

	
	public static void main(String[] args) {
		// création de deux utilisateurs
	Utilisateur utilisateur = new Utilisateur(1, "Jackouille", "Line","Jacky","jackouille@gmail.com","456789","Avenue Poland","35000","Rennes","6969");
	Utilisateur utilisateur2 = new Utilisateur(2, "Michou", "Ine","Michel","michou@gmail.com","123456","Avenue Saint Michel","35000","Rennes","1234");
	// set le nombre de crédit en brut a 100
	utilisateur.setCredit(100);
	
	// test getters premier utilisateur
	System.out.println("Numero : " + utilisateur.getNoUtilisateur());
	System.out.println("Pseudo : " + utilisateur.getPseudo());
	System.out.println("Nom : " + utilisateur.getNom());
	System.out.println("Prenom : " + utilisateur.getPrenom());
	System.out.println("Email : " + utilisateur.getEmail());
	System.out.println("Telephone : " + utilisateur.getTelephone());
	System.out.println("Rue : " + utilisateur.getRue());
	System.out.println("Code Postal : " + utilisateur.getCP());
	System.out.println("Ville : " + utilisateur.getVille());
	System.out.println("Mot de passe : " + utilisateur.getMdp());
	
	System.out.println();
	
	// test getters deuxieme utilisateur
	System.out.println("Pseudo : " + utilisateur2.getPseudo());
	System.out.println("Nom : " + utilisateur2.getNom());
	System.out.println("Prenom : " + utilisateur2.getPrenom());
	System.out.println("Email : " + utilisateur2.getEmail());
	System.out.println("Telephone : " + utilisateur2.getTelephone());
	System.out.println("Rue : " + utilisateur2.getRue());
	System.out.println("Code Postal : " + utilisateur2.getCP());
	System.out.println("Ville : " + utilisateur2.getVille());
	System.out.println("Mot de passe : " + utilisateur2.getMdp());
	
	System.out.println();
	
	
	//test getter et setter de la List<Article>
	
	List<Article> listeArticle = new ArrayList<Article>();	
	Article article = new Article("GTX 3070");
	Article article2 = new Article("GTX 2999");
	
	listeArticle.add(article);
	listeArticle.add(article2);
	
	utilisateur.setListArticleUser(listeArticle);
	List<Article> resultat = utilisateur.getListArticleUser();
	
	System.out.println(listeArticle);
	
	System.out.println();
	
	if(resultat.equals(listeArticle)) {
		System.out.println("les getter et setter de la listeArticle fonctionnent");
	}else {
		System.out.println("les getter et setter de la listeArticle ne fonctionnent pas");
	}

	System.out.println();
	
	//test setter pseudo
	Utilisateur utilisateur3 = new Utilisateur();
	utilisateur3.setPseudo("Beber");
		// sysout de debogage
	System.out.println("Pseudo utilisateur : " + utilisateur3.getPseudo());
	if(!utilisateur3.getPseudo().equals("Beber")) {
		System.out.println("le setter ne fonctionne pas bien");
	}else {
		System.out.println("le setter fonctionne parfaitement");
	}
	
	System.out.println();
	
	// test methode toString
	System.out.println(utilisateur.toString());
	
	System.out.println();
	
	// test equals
	if(utilisateur.equals(utilisateur2)) {
		System.out.println("les deux utilisateurs sont identiques");
	}else {
		System.out.println("les deux utilisateurs ne sont pas identiques");
	}
	
	System.out.println();

	// test hashcode
	if(utilisateur.hashCode()== utilisateur2.hashCode()) {
		System.out.println("test hashcode réussi");
	}else {
		System.out.println("test hashcode échoué");
	}
	}


}
