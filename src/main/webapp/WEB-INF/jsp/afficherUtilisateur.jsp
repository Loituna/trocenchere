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

<!-- FONCTION DE LA PAGE, CODE A CHANGER -->
<div class="block1">
<div class="article">
	<form
		action="<%=request.getContextPath()%>/ServletAffichageUtilisateur"
		method="post">
		<div class="aligne">
		<label class="gauche" for="idPseudo">Pseudo : </label><label class="droite"> ${utilisateur.pseudo}</label><br>
		<label class="gauche" for="idNom">Nom : </label><label class="droite"> ${utilisateur.nom}</label><br> 
		<label class="gauche" for="idPrenom">Prenom : </label><label class="droite"> ${utilisateur.prenom}</label><br> 
		<label class="gauche" for="idEmail">Email : </label><label class="droite"> ${utilisateur.email}</label> <br> 
		<label class="gauche" for="idTelephone">Téléphone : </label><label class="droite"> ${utilisateur.telephone}</label><br>
		<label class="gauche" for="idRue">Rue : </label><label class="droite"> ${utilisateur.rue}</label><br> 
		<label class="gauche" for="idCodePostal">Code Postal : </label><label class="droite"> ${utilisateur.CP}</label><br>
		<label class="gauche" for="idVille">Ville : </label><label class="droite"> ${utilisateur.ville}</label><br>
		</div>
	</form>

	<div class="boutton modifier">
		<a href="ServletModifProfil"><button class="modifier">Modifier</button></a>
		<a href="ServletSuppProfil">
			<button>Supprimer mon compte</button>
		</a>
	</div>
</div>
</div>


<jsp:include page="./fragments/foot.jsp"></jsp:include>