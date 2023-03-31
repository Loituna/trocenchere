<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Supprimer Profil</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/ServletSuppProfil" method="post">


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
		
</form>


</body>
</html>