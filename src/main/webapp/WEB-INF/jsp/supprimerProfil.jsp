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

		<label for="id">Votre identifiant :</label><input type="text" id="id" name="identifiant" value="${utilisateur.noUtilisateur}">
		<br>
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
		<a href="./ServletAccueilCoo"> <button  type="button">Retourner à l'accueil</button> </a>
</form>


</body>
</html>