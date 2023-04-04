<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="./fragments/head.jsp">
	<jsp:param name="title" value="Accueil" />
</jsp:include>

	<h1>Détails de la vente</h1>
	
	<div class="article" >
	<div>
	
		
		${article.nomArticle} 
		<br>
		<img src="./images/RTX-SD.jpg" alt="Ma superbe image">
		<br>
		<br>
			
			<br> Description : ${article.description}<br>
			
			Meilleur offre :<br>
			Mise à prix : ${article.prixInitial} points<br>
			Retrait : ${utilisateur.rue} ${utilisateur.CP} ${utilisateur.ville}
			<br>
			Vendeur : <br>
			Tel : 
			<br>
			<br>
			<a href="ServletAccueilCoo"><button class="bouton">Back</button></a>
		</div>
	</div>




<jsp:include page="./fragments/foot.jsp"></jsp:include>


