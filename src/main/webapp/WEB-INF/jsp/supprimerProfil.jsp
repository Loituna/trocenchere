<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<jsp:include page="./fragments/head.jsp">
	<jsp:param name="title" value="Supprimer Profil" />
</jsp:include>

	<!-- RESTER CONNECTE -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="fr.eni.javaee.bo.Utilisateur"%>
<%
List<String> listeMessagesErreur = (List<String>) request.getAttribute("listeMessagesErreur");
%>

<form class="article" action="<%=request.getContextPath()%>/ServletSuppProfil" method="post">

		<input type="hidden" id="id" name="identifiant" value="${utilisateur.noUtilisateur}">
		<br>
		<label for="idPseudo">Pseudo : </label>${utilisateur.pseudo}
		<br>
		<label for="idNom">Nom : </label>${utilisateur.nom}
		<br>
		<label for="idPrenom">Prenom : </label>${utilisateur.prenom}
		<br>
		<label for="idEmail">Email : </label> ${utilisateur.email}
		<br>
		<label for="idTelephone">Téléphone : </label> ${utilisateur.telephone}
		<br>
		<label for="idRue">Rue : </label>${utilisateur.rue}
		<br>
		<label for="idCodePostal">Code Postal : </label>${utilisateur.CP}
		<br>
		<label for="idVille">Ville : </label> ${utilisateur.ville}	
		<br>		
		<input type="submit" onclick="alert('Compte supprimé !')" value="Supprimer mon compte"/>
		<a href="./ServletAccueilCoo"> <button  type="button">Retourner à l'accueil</button> </a>
</form>


<jsp:include page="./fragments/foot.jsp"></jsp:include>