<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="./fragments/head.jsp">
	<jsp:param name="title" value="Vente Remportée par l'utilisateur" />
</jsp:include>

<link rel="stylesheet" href="./css/VenteRemportee.css">

	<h4>{utilisateur.gagant} a remporté l'enchère</h4>
	<div class="article" >
		<div>
		<img src="./images/RTX-SD.jpg" alt="Ma superbe image">
		<br>
		<br>
			${article.nomArticle} 
			<br> Description : ${article.description}<br>
			
			Meilleur offre : 210 pts par {utilisateur.gagant}<br>
			Mise à prix : ${article.prixInitial} pts<br>
			Retrait : ${utilisateur.rue} ${utilisateur.CP} ${utilisateur.ville}
			<br>
			Vendeur : {vendeur.pseudo}<br>
			Tel : 0606060606
			<br>
			<br>
			<a href="ServletAccueilCoo"><button class="bouton">Back</button></a>
		</div>
	</div>




<jsp:include page="./fragments/foot.jsp"></jsp:include>


