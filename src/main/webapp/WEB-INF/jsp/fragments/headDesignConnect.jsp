<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">


<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">


<!-- BACKGROUND -->
<style class="fond">
body {
	background-image: url('./images/moderne.jpg');
	background-repeat: no-repeat; /* empêche la répétition de l'image */
	background-size: cover;
	/* adapte la taille de l'image pour qu'elle tienne entièrement dans le conteneur, sans déformation */
	background-position: center center;
	/* centre l'image horizontalement et verticalement */
	min-height: 100vh;
}
</style>

</head>
<body>
	<!--LOGO ET ONNECTEION -->
	<header>
		<div class="logo">
			<img src="./images/logo.png" alt="Ma superbe image">
		</div>
		<div class="connection">
			<a href="ServletAffichageUtilisateur">Mon Profil</a>
		</div>
		<div class="deconnection">
			<a href="ServletDeconnexion">Deconnection</a>
		</div>
	</header>

	<!-- NAVIGATION -->

	<nav>
		<ul class="menu">
			<li class="accueil"><a href="ServletAccueilCoo">Accueil</a></li>
			<li><a href="ServletEnchere">Acheter</a></li>
			<li><a href="ServletVenteArticle">Vendre</a></li>
			<li><a href="ServletModifArticle">Modifier</a></li>
			<li class="profil"><a href="ServletAffichageUtilisateur">Mon Profil</a></li>
		</ul>
	</nav>



	<!-- BARRE DE RECHERCHE -->
	<div class="search">
		<input type="text" placeholder="Rechercher...">
		<button>OK</button>
	</div>