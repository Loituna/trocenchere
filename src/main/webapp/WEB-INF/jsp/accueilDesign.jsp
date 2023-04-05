<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="./fragments/headDesign.jsp">
	<jsp:param name="title" value="Enchère" />
</jsp:include>

<!-- RESTER CONNECTE -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="fr.eni.javaee.bo.Utilisateur"%>
<%
List<String> listeMessagesErreur = (List<String>) request.getAttribute("listeMessagesErreur");
%>

<!-- LIEN CSS -->
<link rel="stylesheet" href="./css/AccueilDesign.css">

<!-- FONCTION DE LA PAGE, CODE A CHANGER -->
<div class="block1">
	<div class="article">
		<div>
			<h4>Ventes en cours</h4>
			<div class="alignement">
				<img class="vignette" src="./images/RTX-SD-ALPHA.png"
					alt="Ma superbe image">
				<div class="description">
					
					<br>
					Nom article : ${article.nomArticle}
					<br> 
					Description : ${article.description}
					
					<br> 
					Meilleur offre actuellement : ${enchere.montant} points
					<br>
					Mise à prix : ${article.prixInitial} points
					<br> 
					Fin de l'enchère : ${article.dateFinEnchere}
					<br>
					Retrait : ${utilisateur.rue} ${utilisateur.CP} ${utilisateur.ville}
					<br> 
					<br> 
					Vendeur: ${utilisateur.nom} 
					<br>
				</div>
			</div>
		</div>
	</div>
	<div class="article">
		<div>
			<h4>${utilisateur.pseudo}à remporté l'enchère</h4>
			<div class="alignement">
				<img class="vignette" src="./images/RTX-SD-ALPHA.png"
					alt="Ma superbe image">
				<div class="description">
					Nvidia 4090 RTX <br> Description : Carte graphique nouvelle
					génération.<br> <br> Meilleur offre : 210 pts pat Pseudo<br>
					Mise à prix : 185 pts<br> Fin de l'enchère : 09/03/2023<br>
					Retrait : 5 rue Saint-Louis 35000 Rennes<br> <br> Vendeur
					: pseudo<br>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="block1">
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
					Retrait : 5 rue Saint-Louis 35000 Rennes<br> <br> Vendeur
					: pseudo<br>
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
					Retrait : 5 rue Saint-Louis 35000 Rennes<br> <br> Vendeur
					: pseudo<br>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="block1">
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
					Retrait : 5 rue Saint-Louis 35000 Rennes<br> <br> Vendeur
					: pseudo<br>
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
					Retrait : 5 rue Saint-Louis 35000 Rennes<br> <br> Vendeur
					: pseudo<br>
				</div>
			</div>
		</div>
	</div>
</div>


<jsp:include page="./fragments/foot.jsp"></jsp:include>