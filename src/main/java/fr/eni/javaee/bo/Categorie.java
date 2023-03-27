package fr.eni.javaee.bo;

import java.util.List;
import java.util.Objects;

public class Categorie {

	private Integer noCategorie;
	private String libelle;
	private List<Article> ListCategorieArticle;

	public Categorie() {
		super();
	}

	public Categorie(Integer noCategorie, String libelle) {
		super();
		this.noCategorie = noCategorie;
		this.libelle = libelle;

	}

	public Categorie(String libelle) {
		super();
		this.libelle = libelle;
	}

	public Integer getNoCategorie() {
		return noCategorie;
	}

	public void setNoCategorie(Integer noCategorie) {
		this.noCategorie = noCategorie;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Article> getListCategorieArticle() {
		return ListCategorieArticle;
	}

	public void setListCategorieArticle(List<Article> listCategorieArticle) {
		ListCategorieArticle = listCategorieArticle;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ListCategorieArticle, libelle, noCategorie);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categorie other = (Categorie) obj;
		return Objects.equals(ListCategorieArticle, other.ListCategorieArticle)
				&& Objects.equals(libelle, other.libelle) && Objects.equals(noCategorie, other.noCategorie);
	}

	@Override
	public String toString() {
		return "Categorie [noCategorie=" + noCategorie + ", libelle=" + libelle + ", ListCategorieArticle="
				+ ListCategorieArticle + "]";
	}

}
