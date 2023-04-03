package fr.eni.javaee.bo;

import java.time.LocalDateTime;
import java.util.Objects;

public class Enchere {
	
	private Integer noEnchere;
	private LocalDateTime datedebutEnchere;
	private LocalDateTime datefinEnchere;
	private Integer montant;
	
	
	private Integer noArticle;
	private Integer noUtilisateur;
	
	

	
	public Enchere(Integer noEnchere, LocalDateTime datedebutEnchere, LocalDateTime datefinEnchere, Integer montant,
			Integer noArticle, Integer noUtilisateur) {
		super();
		this.noEnchere = noEnchere;
		this.datedebutEnchere = datedebutEnchere;
		this.datefinEnchere = datefinEnchere;
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
	@Override
	public int hashCode() {
		return Objects.hash(datedebutEnchere, datefinEnchere, montant, noArticle, noEnchere, noUtilisateur);
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
		return Objects.equals(datedebutEnchere, other.datedebutEnchere)
				&& Objects.equals(datefinEnchere, other.datefinEnchere) && Objects.equals(montant, other.montant)
				&& Objects.equals(noArticle, other.noArticle) && Objects.equals(noEnchere, other.noEnchere)
				&& Objects.equals(noUtilisateur, other.noUtilisateur);
	}

	public void setNoEnchere(Integer noEnchere) {
		this.noEnchere = noEnchere;
	}

	public LocalDateTime getDatedebutEnchere() {
		return datedebutEnchere;
	}

	public void setDatedebutEnchere(LocalDateTime datedebutEnchere) {
		this.datedebutEnchere = datedebutEnchere;
	}

	public LocalDateTime getDatefinEnchere() {
		return datefinEnchere;
	}

	public void setDatefinEnchere(LocalDateTime datefinEnchere) {
		this.datefinEnchere = datefinEnchere;
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
	public String toString() {
		return "Enchere [noEnchere=" + noEnchere + ", datedebutEnchere=" + datedebutEnchere + ", datefinEnchere="
				+ datefinEnchere + ", montant=" + montant + ", noArticle=" + noArticle + ", noUtilisateur="
				+ noUtilisateur + "]";
	}

	
}
