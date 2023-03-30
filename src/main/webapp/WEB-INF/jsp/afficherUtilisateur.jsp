<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profil utilisateur</title>
</head>
<h3>Site d'enchere en ligne le plus beau de la promo</h3>
<body>

	<%int noUtilisateur = Integer.parseInt(request.getParameter("noUtilisateur"));
	
	
	%>
<form>
		<label for="idPseudo">Pseudo : </label><output<%=request.getParameter("pseudo")%>> </output>
		<br>
		<label for="idNom">Nom : </label><output<%=request.getParameter("Nom")%>></output>
		<br>
		<label for="idPrenom">Prenom : </label><output<%=request.getParameter("Prenom")%>></output>
		<br>
		<label for="idEmail">Email : </label><output<%=request.getParameter("Email")%>></output>
		<br>
		<label for="idTelephone">Téléphone : </label><output"<%=request.getParameter("Telephone")%>></output>
		<br>
		<label for="idRue">Rue : </label><output<%=request.getParameter("Rue")%>></output>
		<br>
		<label for="idCodePostal">Code Postal : </label><output<%=request.getParameter("CodePostal")%>></output>
		<br>
		<label for="idVille">Ville : </label><output<%=request.getParameter("Ville")%>></output>
		<br>
</form>
</body>
</html>