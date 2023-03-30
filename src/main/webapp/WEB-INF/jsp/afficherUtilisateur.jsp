<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profil utilisateur</title>
</head>
<body>

		<label for="idPseudo">Pseudo : </label><label<%=request.getParameter("pseudo")%>> </label>
		<br>
		<label for="idNom">Nom : </label><input type="text" id="idNom" name="Nom" value="<%=request.getParameter("Nom")%>"/>
		<br>
		<label for="idPrenom">Prenom : </label><input type="text" id="idPrenom" name="Prenom" value="<%=request.getParameter("Prenom")%>"/>
		<br>
		<label for="idEmail">Email : </label><input type="text" id="idEmail" name="Email" value="<%=request.getParameter("Email")%>"/>
		<br>
		<label for="idTelephone">Téléphone : </label><input type="text" id="idTelephone" name="Telephone" value="<%=request.getParameter("Telephone")%>"/>
		<br>
		<label for="idRue">Rue : </label><input type="text" id="idRue" name="Rue" value="<%=request.getParameter("Rue")%>"/>
		<br>
		<label for="idCodePostal">Code Postal : </label><input type="text" id="idCodePostal" name="CodePostal" value="<%=request.getParameter("CodePostal")%>"/>
		<br>
		<label for="idVille">Ville : </label><input type="text" id="idVille" name="Ville" value="<%=request.getParameter("Ville")%>"/>
		<br>

</body>
</html>