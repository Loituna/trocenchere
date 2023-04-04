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

<div class="article">
	<form
		action="<%=request.getContextPath()%>/ServletAffichageUtilisateur"
		method="post">
		<label for="idPseudo">Pseudo : </label>${utilisateur.pseudo} <br>
		<label for="idNom">Nom : </label>${utilisateur.nom} <br> <label
			for="idPrenom">Prenom : </label>${utilisateur.prenom} <br> <label
			for="idEmail">Email : </label> ${utilisateur.email} <br> <label
			for="idTelephone">Téléphone : </label> ${utilisateur.telephone} <br>
		<label for="idRue">Rue : </label>${utilisateur.rue} <br> <label
			for="idCodePostal">Code Postal : </label>${utilisateur.CP} <br>
		<label for="idVille">Ville : </label> ${utilisateur.ville} <br>

	</form>

	<div class="boutton modifier">
		<a href="ServletModifProfil"><button class="modifier">Modifier</button></a>
		<a href="ServletSuppProfil">
			<button>Supprimer mon compte</button>
		</a>
	</div>
	</div>


<jsp:include page="./fragments/foot.jsp"></jsp:include>