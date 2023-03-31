package fr.eni.javaee.bo.testbo;

import fr.eni.javaee.bo.Utilisateur;

public class TestBo {

	
	public static void main(String[] args) {
	Utilisateur utilisateur = new Utilisateur(1, "Popol", "Ine","Paul","popol@gmail.com","456789","Avenue Poland","35000","Rennes","6969");
	Utilisateur utilisateur2 = new Utilisateur(2, "Michou", "Ine","Michel","michou@gmail.com","123456","Avenue Saint Michel","35000","Rennes","1234");
	utilisateur.setCredit(100);
	
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
	
	
	System.out.println(utilisateur.toString());
	}
}
