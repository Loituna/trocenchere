<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="./fragments/head.jsp">
	<jsp:param name="title" value="Accueil" />
</jsp:include>

	<h1>Détails de la vente</h1>
	
	<div class="article" >
	<div>
	
		<br>
		<img src="./images/RTX-SD.jpg" alt="Ma superbe image">
		<br>
		<br>
			${article.nomArticle} 
			<br>
			Description : ${article.description}
			<br>
			Catégorie : ${article.noCategorie}
			<br>
			Meilleur offre : ${enchere.montant}
			<br>
			Mise à prix : ${article.prixInitial} points
			<br>
			Fin de l'enchère : ${article.dateFinEnchere}
			<br>
			Retrait : ${utilisateur.rue} ${utilisateur.CP} ${utilisateur.ville}
			<br>
			Vendeur :${utilisateur.nom} 
			<br>
			Tel : ${utilisateur.telephone} 
			<br>
			<br>
			<a href="ServletAccueilCoo"><button class="bouton">Enchérir</button></a>
		</div>
	</div>




<jsp:include page="./fragments/foot.jsp"></jsp:include>


