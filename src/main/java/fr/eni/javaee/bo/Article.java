package fr.eni.javaee.bo;

import java.time.LocalDateTime;
import java.util.Objects;

public class Article {
	
	private Integer noArticle;
	private String nomArticle;
	private String description;
	private LocalDateTime dateDebutEnchere;
	private LocalDateTime dateFinEnchere;
	private Integer prixInitial;
	private Integer prixVente;
	private Boolean etatVente;
	
	private Integer noCategorie;
	private Integer noUtilisateur;
	public Article() {
		super();
	}
	public Article(String nomArticle, String description, LocalDateTime dateDebutEnchere, LocalDateTime dateFinEnchere,
			Integer prixInitial, Integer prixVente, Boolean etatVente, Integer noCategorie, Integer noUtilisateur) {
		super();
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEnchere = dateDebutEnchere;
		this.dateFinEnchere = dateFinEnchere;
		this.prixInitial = prixInitial;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
		this.noCategorie = noCategorie;
		this.noUtilisateur = noUtilisateur;
	}
	public Article(Integer noArticle, String nomArticle, String description, LocalDateTime dateDebutEnchere,
			LocalDateTime dateFinEnchere, Integer prixInitial, Integer prixVente, Boolean etatVente,
			Integer noCategorie, Integer noUtilisateur) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEnchere = dateDebutEnchere;
		this.dateFinEnchere = dateFinEnchere;
		this.prixInitial = prixInitial;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
		this.noCategorie = noCategorie;
		this.noUtilisateur = noUtilisateur;
	}
	
	public Integer getNoArticle() {
		return noArticle;
	}
	public void setNoArticle(Integer noArticle) {
		this.noArticle = noArticle;
	}
	public String getNomArticle() {
		return nomArticle;
	}
	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getDateDebutEnchere() {
		return dateDebutEnchere;
	}
	public void setDateDebutEnchere(LocalDateTime dateDebutEnchere) {
		this.dateDebutEnchere = dateDebutEnchere;
	}
	public LocalDateTime getDateFinEnchere() {
		return dateFinEnchere;
	}
	public void setDateFinEnchere(LocalDateTime dateFinEnchere) {
		this.dateFinEnchere = dateFinEnchere;
	}
	public Integer getPrixInitial() {
		return prixInitial;
	}
	public void setPrixInitial(Integer prixInitial) {
		this.prixInitial = prixInitial;
	}
	public Integer getPrixVente() {
		return prixVente;
	}
	public void setPrixVente(Integer prixVente) {
		this.prixVente = prixVente;
	}
	public Boolean getEtatVente() {
		return etatVente;
	}
	public void setEtatVente(Boolean etatVente) {
		this.etatVente = etatVente;
	}
	public Integer getNoCategorie() {
		return noCategorie;
	}
	public void setNoCategorie(Integer noCategorie) {
		this.noCategorie = noCategorie;
	}
	public Integer getNoUtilisateur() {
		return noUtilisateur;
	}
	public void setNoUtilisateur(Integer noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dateDebutEnchere, dateFinEnchere, description, etatVente, noArticle, noCategorie,
				noUtilisateur, nomArticle, prixInitial, prixVente);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		return Objects.equals(dateDebutEnchere, other.dateDebutEnchere)
				&& Objects.equals(dateFinEnchere, other.dateFinEnchere)
				&& Objects.equals(description, other.description) && Objects.equals(etatVente, other.etatVente)
				&& Objects.equals(noArticle, other.noArticle) && Objects.equals(noCategorie, other.noCategorie)
				&& Objects.equals(noUtilisateur, other.noUtilisateur) && Objects.equals(nomArticle, other.nomArticle)
				&& Objects.equals(prixInitial, other.prixInitial) && Objects.equals(prixVente, other.prixVente);
	}
	@Override
	public String toString() {
		return "Article noArticle=" + noArticle 
				+ "\nnomArticle=" + nomArticle 
				+ "\ndescription=" + description
				+ "\ndateDebutEnchere=" + dateDebutEnchere 
				+ "\ndateFinEnchere=" + dateFinEnchere 
				+ "\nprixInitial=" + prixInitial 
				+ "\nprixVente=" + prixVente 
				+ "\netatVente=" + etatVente 
				+ "\nnoCategorie=" + noCategorie
				+ "\nnoUtilisateur=" + noUtilisateur;
	}
	
}
