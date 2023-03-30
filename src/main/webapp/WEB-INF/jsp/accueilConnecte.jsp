<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil connecté</title>
</head>
<body>
<h3>Site d'enchere en ligne le plus beau de la promo</h3>
<h1>JSP connecté</h1>

<ul>
<a href="ServletVenteArticle">Vendre un article</a>
<a href="ServletAccueuilCoo">Enchères</a>
<a href="ServletTestAffichageUtilisateur">Mon profil</a>

<a href="ServletAccueuil">Deconnexion</a>


</ul>



<p>Filtres : </p> <br>
<form action="<%=request.getContextPath()%>/ServletAcueuil"method="post">
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