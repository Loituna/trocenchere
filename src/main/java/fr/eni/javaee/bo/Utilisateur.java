package fr.eni.javaee.bo;

import java.util.Objects;

public class Utilisateur {

	
	private Integer noUtilisateur;
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String rue;
	private String CP;
	private String Ville;
	private String mdp;
	private Integer Credit;
	
	
	public Utilisateur() {
		super();
	}
	public Utilisateur(Integer noUtilisateur, String pseudo, String nom, String prenom, String email, String telephone,
			String rue, String cP, String ville, String mdp, Integer credit) {
		super();
		this.noUtilisateur = noUtilisateur;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		CP = cP;
		Ville = ville;
		this.mdp = mdp;
		Credit = credit;
	}
	public Integer getNoUtilisateur() {
		return noUtilisateur;
	}
	public void setNoUtilisateur(Integer noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getCP() {
		return CP;
	}
	public void setCP(String cP) {
		CP = cP;
	}
	public String getVille() {
		return Ville;
	}
	public void setVille(String ville) {
		Ville = ville;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public Integer getCredit() {
		return Credit;
	}
	public void setCredit(Integer credit) {
		Credit = credit;
	}
	@Override
	public int hashCode() {
		return Objects.hash(CP, Credit, Ville, email, mdp, noUtilisateur, nom, prenom, pseudo, rue, telephone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utilisateur other = (Utilisateur) obj;
		return Objects.equals(CP, other.CP) && Objects.equals(Credit, other.Credit)
				&& Objects.equals(Ville, other.Ville) && Objects.equals(email, other.email)
				&& Objects.equals(mdp, other.mdp) && Objects.equals(noUtilisateur, other.noUtilisateur)
				&& Objects.equals(nom, other.nom) && Objects.equals(prenom, other.prenom)
				&& Objects.equals(pseudo, other.pseudo) && Objects.equals(rue, other.rue)
				&& Objects.equals(telephone, other.telephone);
	}
	@Override
	public String toString() {
		return "Utilisateur [noUtilisateur=" + noUtilisateur + ", pseudo=" + pseudo + ", nom=" + nom + ", prenom="
				+ prenom + ", email=" + email + ", telephone=" + telephone + ", rue=" + rue + ", CP=" + CP + ", Ville="
				+ Ville + ", mdp=" + mdp + ", Credit=" + Credit + "]";
	}
	
}
