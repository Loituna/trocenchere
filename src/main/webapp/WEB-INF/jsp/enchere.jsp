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



<!-- CONTENU DE LA PAGE -->
<div class="block1">
<div class="article">
	<div>

		<h3>Détails de la vente</h3>
		<br> <img src="./images/RTX-SD.jpg" alt="Ma superbe image">
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
		Retrait : ${retrait.rue} ${retrait.codePostal} ${retrait.ville} 
		<br>
		Vendeur :${vendeur.nom} 
		<br> 
		Tel : ${vendeur.telephone}
		<br>
		<br>

		<form action="<%=request.getContextPath()%>/ServletEnchere" method="post">

			<label for="newPrix">Ma proposition : </label><input type="number"
				name="newPrix" min="${enchere.montant}" max="1000" /> <br>
			<input type="submit" value="Enchérir" />
		</form>
	</div>
</div>
</div>



<jsp:include page="./fragments/foot.jsp"></jsp:include>


