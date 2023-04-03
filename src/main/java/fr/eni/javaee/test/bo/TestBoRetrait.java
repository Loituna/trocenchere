package fr.eni.javaee.test.bo;

import fr.eni.javaee.bo.Retrait;

public class TestBoRetrait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Retrait retrait1 = new Retrait();
		
		retrait1.setRue("Jean Jaures");
		retrait1.setCodePostal("35000");
		retrait1.setVille("Rennes");
		retrait1.setNoArticle(1);
		
		Retrait retrait2 = new Retrait();
		retrait2.setRue("Schmidt");
		retrait2.setCodePostal("35230");
		retrait2.setVille("Combourg");
		retrait2.setNoArticle(2);
		
		// test toString
		System.out.println(retrait1.toString());
		
		System.out.println();
		
		System.out.println(retrait2.toString());
		
		System.out.println();
		
		//test getters
		
		System.out.println("Rue : " + retrait1.getRue());
		System.out.println("Code Postal : " + retrait1.getCodePostal());
		System.out.println("Ville : " + retrait1.getVille() );
		System.out.println("Article : " + retrait1.getNoArticle());
		
		System.out.println();
		
		// test setter Rue
		Retrait retrait3 = new Retrait();
		retrait3.setRue("General De Gaulle");
		
		System.out.println("Rue du retrait : " + retrait3.getRue());
		
		if(!retrait3.getRue().equals("Petain")) {
			System.out.println("le setRue ne fonctionne pas");
		}else {
			System.out.println("le setRue fonctionne");
			
		}
		System.out.println();
		
		// test hashcode
		
		if(retrait1.hashCode()==retrait2.hashCode()) {
			System.out.println("test hashcode success");
		}else {
			System.out.println("test hashcode fail");
		}
		
		System.out.println();
		
		// test equals
		if(retrait1.equals(retrait2)) {
			System.out.println("les deux points de retrait sont identiques");
		}else {
			System.out.println("les deux points de retrait sont différents");
		}
	}

}
