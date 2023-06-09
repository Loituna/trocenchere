<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="./fragments/headDesignConnect.jsp">
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
<link rel="stylesheet" href="./css/style1.css">



<!-- CONTENU DE LA PAGE -->
<div class="block1">

	<div class="article2">
		
		<br>
		<h4>Détails de la vente</h4>
		<br> <img src="./images/4.png" alt="Ma superbe image">
		<br> 
		<br> 
		${article.nomArticle} 
		<br>
		Description : ${article.description}
		<br>
		Catégorie : ${categorie.libelle} 
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

			<div class="container">
				<div class="div1"> <label for="newPrix">Ma proposition : </label> </div>
				<div class="div2"> <input type="number" name="newPrix" min="${enchere.montant}" max="10000" /> </div>
			</div>
		<br>

			<input type="submit" value="Enchérir" />
		</form>
	</div>

</div>



<jsp:include page="./fragments/foot.jsp"></jsp:include>


