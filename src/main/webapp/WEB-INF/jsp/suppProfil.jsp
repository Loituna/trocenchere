<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modification du profil</title>
</head>
<body>

<h1>Mon profil</h1>
<br>

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
		<label for="idMotsPasse">Mots de passe actuel : </label>
		<br>
		<label for="newMotsPasse">Nouveau mots de passe : </label>
		<br>
		<label for="confirmerNewMotsPasse">Confirmez le mots de passe : </label>
		<br>
</form>

</body>
</html>