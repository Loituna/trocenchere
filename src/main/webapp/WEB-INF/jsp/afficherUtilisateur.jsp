<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="fr.eni.javaee.bo.Utilisateur" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profil utilisateur</title>
</head>
<h3>Site d'enchere en ligne le plus beau de la promo</h3>
<body>
	
	<form action="<%=request.getContextPath()%>/ServletTestAffichageUtilisateur method="post">
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
		
</form>

<div class ="boutton modifier">

	<a href="ServletSuppProfil"><button class = "modifier">Modifier</button></a>
</div>
</body>
</html>