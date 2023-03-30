<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="fr.eni.javaee.bo.Utilisateur" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modification du profil</title>
</head>
<body>

<h1>Mon profil</h1>
<br>

<form action="<%=request.getContextPath()%>/ServletSuppProfil method="post">
		<label for="idPseudo">Pseudo : </label><input value="${utilisateur.pseudo}"/>
		<br>
		<label for="idNom">Nom : </label><input value=" ${utilisateur.nom}"/>
		<br>
		<label for="idPrenom">Prenom : </label> <input value="${utilisateur.prenom}"/>
		<br>
		<label for="idEmail">Email : </label> <input value=" ${utilisateur.email}"/>
		<br>
		<label for="idTelephone">Téléphone : </label> <input value="${utilisateur.telephone}"/>
		<br>
		<label for="idRue">Rue : </label> <input value="${utilisateur.rue}"/>
		<br>
		<label for="idCodePostal">Code Postal : </label> <input value="${utilisateur.CP}"/>
		<br>
		<label for="idVille">Ville : </label> <input value="${utilisateur.ville}"/>	
		<br>
		<label for="idMotsPasse">Mots de passe actuel : </label>
		<br>
		<label for="idMDP">Nouveau mots de passe : </label> <input type="text" id="idMDP" name="MDP" required="required" value="" />
		<br>
		<label for="idMDPconfirm">Confirmez le mots de passe : </label>
		<br>
		<br>
		<label for="credit">Credit : </label>
		<br>
		<br>
		<button type="button">Enregistrer
		<button type="button">Supprimer mon compte
		<a href="./ServletAccueillCoo">
		<button  type="button">Annuler
        </a>
        
</button>
</form>

</body>
</html>