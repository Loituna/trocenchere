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

<!-- FONCTION DE LA PAGE, CODE A CHANGER -->
<div class="block1">
<h4>{utilisateur.gagant} a remporté l'enchère</h4>
<div class="article">
	<div>
		<img src="./images/RTX-SD.jpg" alt="Ma superbe image"> <br>
		<br> ${article.nomArticle} <br> Description :
		${article.description}<br> Meilleur offre : 210 pts par
		{utilisateur.gagant}<br> Mise à prix : ${article.prixInitial} pts<br>
		Retrait : ${utilisateur.rue} ${utilisateur.CP} ${utilisateur.ville} <br>
		Vendeur : {vendeur.pseudo}<br> Tel : 0606060606 <br> <br>
		<a href="ServletAccueilCoo"><button class="bouton">Back</button></a>
	</div>
</div>
</div>




<jsp:include page="./fragments/foot.jsp"></jsp:include>


