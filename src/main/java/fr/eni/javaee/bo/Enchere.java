package fr.eni.javaee.bo;

import java.time.LocalDate;
import java.util.Objects;

public class Enchere {
	
	private Integer noEnchere;
	private LocalDate dateEnchere;
	private Integer montant;
	
	
	private Integer noArticle;
	private Integer noUtilisateur;
	
	
	public Enchere(LocalDate dateEnchere, Integer montant, Integer noArticle, Integer noUtilisateur) {
		super();
		this.dateEnchere = dateEnchere;
		this.montant = montant;
		this.noArticle = noArticle;
		this.noUtilisateur = noUtilisateur;
	}
	public Enchere(Integer noEnchere, LocalDate dateEnchere, Integer montant, Integer noArticle,
			Integer noUtilisateur) {
		super();
		this.noEnchere = noEnchere;
		this.dateEnchere = dateEnchere;
		this.montant = montant;
		this.noArticle = noArticle;
		this.noUtilisateur = noUtilisateur;
	}
	public Enchere() {
		super();
	}
	public Integer getNoEnchere() {
		return noEnchere;
	}
	public void setNoEnchere(Integer noEnchere) {
		this.noEnchere = noEnchere;
	}
	public LocalDate getDateEnchere() {
		return dateEnchere;
	}
	public void setDateEnchere(LocalDate dateEnchere) {
		this.dateEnchere = dateEnchere;
	}
	public Integer getMontant() {
		return montant;
	}
	public void setMontant(Integer montant) {
		this.montant = montant;
	}
	public Integer getNoArticle() {
		return noArticle;
	}
	public void setNoArticle(Integer noArticle) {
		this.noArticle = noArticle;
	}
	public Integer getNoUtilisateur() {
		return noUtilisateur;
	}
	public void setNoUtilisateur(Integer noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dateEnchere, montant, noArticle, noEnchere, noUtilisateur);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enchere other = (Enchere) obj;
		return Objects.equals(dateEnchere, other.dateEnchere) && Objects.equals(montant, other.montant)
				&& Objects.equals(noArticle, other.noArticle) && Objects.equals(noEnchere, other.noEnchere)
				&& Objects.equals(noUtilisateur, other.noUtilisateur);
	}
	@Override
	public String toString() {
		return "Enchere [noEnchere=" + noEnchere + ", dateEnchere=" + dateEnchere + ", montant=" + montant
				+ ", noArticle=" + noArticle + ", noUtilisateur=" + noUtilisateur + "]";
	}
	
}
