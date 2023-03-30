<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
</head>
<body>

<h3>Site d'enchere en ligne le plus beau de la promo</h3>



<h1>Liste des enchères</h1>




<a href="ServletConnexion">Se connecter</a>
<a href="ServletInscription">S'inscrire</a>

<p>Filtres : </p> <br>
<form action="<%=request.getContextPath()%>/ServletAcceuil"method="post">
<input type="texte" id="searchart" name="barre de recherche article" value = "Le nom de l'article contient">

 </form>

<form class="Formcate" action="<%=request.getContextPath()%>/ServletInscription"method="post">
	<select name="Liste Categorie" id="listcate">
	<option value="Informatique">Informatique</option>
	<option value="Ameublement">Ameublement</option>
	<option value="Vetement">Vetement</option>
	<option value="Sport">Sport</option>
	<option value="Loisir">Loisir</option>
	
	</select>
	
	<input type = "submit" value"Rechercher">
</form>

</body>
</html>