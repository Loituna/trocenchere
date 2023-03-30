<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="fr.eni.javaee.bo.Utilisateur" %>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modification du profil</title>
</head>
<body>
<%
		List<String> listeMessagesErreur = (List<String>)request.getAttribute("listeMessagesErreur");
	%>


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
		<label for="idMotsPasse">Mots de passe actuel : </label> <input type="text" required="required" value=""/>
		<br>
		<label for="idMDP">Nouveau mots de passe : </label> <input type="text" id="idMDP" name="MDP" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("MDP"):""%>"/>
		<br>
		<label for="idMDPconfirm">Confirmez le mots de passe : </label> <input type="text" id="idMDPconfirm" name="MDPconfirm" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("MDPConfirm"):""%>"/>
		<br>
		<br>
		<label for="credit">Credit : </label>${utilisateur.credit}
		<br>
		<br>
		<button type="button">Enregistrer</button>
		<button type="button">Supprimer mon compte</button>
		
</form>
	<a href="./ServletAccueillCoo"> <button  type="button">Annuler</button> </a>


</body>
</html>