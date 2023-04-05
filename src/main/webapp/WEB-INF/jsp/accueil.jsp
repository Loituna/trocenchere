<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="./fragments/head.jsp">
	<jsp:param name="title" value="Enchère" />
</jsp:include>

<!-- RESTER CONNECTE -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="fr.eni.javaee.bo.Utilisateur"%>
<%
List<String> listeMessagesErreur = (List<String>) request.getAttribute("listeMessagesErreur");
%>

<!-- CONTENU DE LA PAGE -->
<h3>Liste des enchères</h3>

<div class="article">
	<p>Filtres :</p>
	<br>
	<form action="<%=request.getContextPath()%>/ServletAcceuilDesign"
		method="post">
		<input type="texte" id="searchart" name="barre de recherche article"
			value="Le nom de l'article contient"> <input type="submit"
			value="Rechercher">
	</form>
	<br> <br> <select id="maListe" onchange="afficherOption()">
		<option value="option1">Toutes les enchères</option>
		<option value="option2">Informatique</option>
		<option value="option3">Ameublement</option>
		<option value="option4">Vetement</option>
		<option value="option5">Sport & Loisir</option>
	</select>
	<div>
		<p id="resultat"></p>
		<p id="article-nom"></p>
	</div>
	<script>
		function afficherOption() {
			// récupérer la liste déroulante
			var liste = document.getElementById("maListe");
			// récupérer la valeur sélectionnée
			var option = liste.options[liste.selectedIndex].value;
			// afficher le résultat
			var resultat = document.getElementById("resultat");
			var articleNomElement = document.getElementById('article-nom');
			if (option === "option1") {
				resultat.innerHTML = "Option 1";
				articleNomElement.innerHTML = "Intitulé : "
						+ '${article.nomArticle}' + ". Prix : "
						+ '${article.prixVente}' + "crédits. "
						+ "Fin de l'enchère : " + '${article.dateFinEnchere}';
			} else if (option === "option2") {
				resultat.innerHTML = "Option 2 sélectionnée.";
			} else if (option === "option3") {
				resultat.innerHTML = "Option 3";
			} else if (option === "option4") {
				resultat.innerHTML = "Option 4";
			} else if (option === "option5") {
				resultat.innerHTML = "Option 5";
			}
		}
	</script>
</div>

<div class="article">
			<div>
				<h4>${utilisateur.pseudo}àremportél'enchère</h4>
				<div class="alignement">
					<img class="vignette" src="./images/RTX-SD-ALPHA.png"
						alt="Ma superbe image">
					<div class="description">
						Nvidia 4090 RTX <br> Description : Carte graphique nouvelle
						génération.<br> <br> Meilleur offre : 210 pts pat Pseudo<br>
						Mise à prix : 185 pts<br> Fin de l'enchère : 09/03/2023<br>
						Retrait : 5 rue Saint-Louis 35000 Rennes<br> <br>
						Vendeur : pseudo<br>
					</div>
				</div>
			</div>
		</div>
		<div class="article">
			<div>
				<h4>${utilisateur.pseudo}àremportél'enchère</h4>
				<div class="alignement">
					<img class="vignette" src="./images/RTX-SD-ALPHA.png"
						alt="Ma superbe image">
					<div class="description">
						Nvidia 4090 RTX <br> Description : Carte graphique nouvelle
						génération.<br> <br> Meilleur offre : 210 pts pat Pseudo<br>
						Mise à prix : 185 pts<br> Fin de l'enchère : 09/03/2023<br>
						Retrait : 5 rue Saint-Louis 35000 Rennes<br> <br>
						Vendeur : pseudo<br>
					</div>
				</div>
			</div>
		</div>
	</div>

<jsp:include page="./fragments/foot.jsp"></jsp:include>