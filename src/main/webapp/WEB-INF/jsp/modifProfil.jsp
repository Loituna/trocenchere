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
<h4>Mon profil</h4>
<br>
<div class="block1">
<form class="article" action="<%=request.getContextPath()%>/ServletModifProfil"
	method="post">

		<input type="hidden" name="identifiant" value="${utilisateur.noUtilisateur}" /> 
		<br> 
		
		<label for="idPseudo">Pseudo : </label><input name="pseudo"
		value="${utilisateur.pseudo}" /> <br> <label for="idNom">Nom
		: </label><input name="nom" value=" ${utilisateur.nom}" /> <br> <label
		for="idPrenom">Prenom : </label> <input name="prenom"
		value="${utilisateur.prenom}" /> <br> <label for="idEmail">Email
		: </label> <input name="email" value=" ${utilisateur.email}" /> <br> <label
		for="idTelephone">Téléphone : </label> <input name="telephone"
		value="${utilisateur.telephone}" /> <br> <label for="idRue">Rue
		: </label> <input name="rue" value="${utilisateur.rue}" /> <br> <label
		for="idCodePostal">Code Postal : </label> <input name="cp"
		value="${utilisateur.CP}" /> <br> <label for="idVille">Ville
		: </label> <input name="ville" value="${utilisateur.ville}" /> <br> <label
		for="idMotsPasse">Mots de passe actuel : </label> <input type="text"
		required="required" value="" /> <br> <label for="idMDP">Nouveau
		mots de passe : </label> <input type="text" id="idMDP" name="MDP"
		required="required"
		value="<%=listeMessagesErreur != null ? request.getParameter("MDP") : ""%>" />
	<br> <label for="idMDPconfirm">Confirmez le mots de passe
		: </label> <input type="text" id="idMDPconfirm" name="MDPconfirm"
		required="required"
		value="<%=listeMessagesErreur != null ? request.getParameter("MDPConfirm") : ""%>" />
	<br> <br> <label for="credit">Credit : </label>${utilisateur.credit}
	<br> <br> <input type="submit" onclick="alert('Modifié !')"
		value="Enregistrer" />
<a href="./ServletAccueilCoo">
	<button type="button">Retourner à l'accueil</button>
</a>

</form>
</div>



<jsp:include page="./fragments/foot.jsp"></jsp:include>