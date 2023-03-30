<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire d'inscription</title>
<h3>Site d'enchere en ligne le plus beau de la promo</h3>
<link href="./css/style.css" rel="stylesheet">
</head>
<body>
<%
		List<String> listeMessagesErreur = (List<String>)request.getAttribute("listeMessagesErreur");
	%>
	
	<h1>Mon profil</h1>
	
	<form action="<%=request.getContextPath()%>/ServletInscription"method="post">
		<label for="idPseudo">Pseudo : </label><input type="text" id="idPseudo" name="pseudo"  required="required" value="<%=listeMessagesErreur!=null?request.getParameter("pseudo"):""%>"/>
		<br>
		<label for="idNom">Nom : </label><input type="text" id="idNom" name="Nom" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("Nom"):""%>"/>
		<br>
		<label for="idPrenom">Prenom : </label><input type="text" id="idPrenom" name="Prenom" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("Prenom"):""%>"/>
		<br>
		<label for="idEmail">Email : </label><input type="text" id="idEmail" name="Email"  required="required" value="<%=listeMessagesErreur!=null?request.getParameter("Email"):""%>"/>
		<br>
		<label for="idTelephone">Téléphone : </label><input type="text" id="idTelephone" name="Telephone" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("Telephone"):""%>"/>
		<br>
		<label for="idRue">Rue : </label><input type="text" id="idRue" name="Rue" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("Rue"):""%>"/>
		<br>
		<label for="idCodePostal">Code Postal : </label><input type="text" id="idCodePostal" name="CodePostal" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("CodePostal"):""%>"/>
		<br>
		<label for="idVille">Ville : </label><input type="text" id="idVille" name="Ville" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("Ville"):""%>"/>
		<br>
		<label for="idMDP">Mot de passe : </label><input type="text" id="idMDP" name="MDP" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("MDP"):""%>"/>
		<br>
		<label for="idMDPconfirm">Confirmation Mot de Passe : </label><input type="text" id="idMDPconfirm" name="MDPconfirm" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("MDPConfirm"):""%>"/>
		<br>
		<input type="submit" value="Validation Inscription"/>
		
			
	
	</form>
		<a href="ServletAccueil">
			<input type="submit" value="Annulation"/>
		</a>
</body>
</html>