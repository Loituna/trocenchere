package fr.eni.testgit.trocenchere.bo;

public class Personnel {

	private String nom;
	private String prenom;
	private Integer age;
	private String profession;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public Personnel(String nom, String prenom, Integer age, String profession) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.profession = profession;
	}
	
	
	
}
