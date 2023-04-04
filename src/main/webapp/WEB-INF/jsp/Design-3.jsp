<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">

<!-- LIEN css -->
<link rel="stylesheet" href="./css/Design-3.css">

<!-- LE TITRE DANS LE NAVIGATEUR -->
<title>Accueil</title>



<!-- LIEN BOOTSTRAP AU CAS OU -->
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
			<a href="#">Connection</a>
		</div>
		<div class="deconnection">
			<a href="#">Deconnection</a>
		</div>
	</header>

<!-- NAVIGATION -->

	<nav>
		<ul class="menu">
			<li class="accueil"><a href="#">Accueil</a></li>
			<li class="information"><a href="#">Informatique</a></li>
			<li class="vetement"><a href="#">Vêtement</a></li>
			<li class="sport"><a href="#">Sport & Loisir</a></li>
			<li class="enchere"><a href="#">Enchère</a></li>
		</ul>
	</nav>



	<!-- BARRE DE RECHERCHE -->
	<div class="search">
		<input type="text" placeholder="Rechercher...">
		<button>OK</button>
	</div>

	<!-- Code de la page -->
	<div class="block1">
		<div class="article">
			<div>
				<h4>${utilisateur.pseudo}àremportél'enchère</h4>
				<div class="alignement">
					<img class="vignette" src="./images/RTX-SD-ALPHA.png"
						alt="Ma superbe image">
					<div class="description">
						Nvidia 4090 RTX <br> Description : Carte graphique nouvelle
						génération.<br> <br> Meilleur offre : 210 pts pat Pseudo<br>
						Mise à prix : 185 pts<br> Fin de l'enchère : 09/03/2023<br>
						Retrait : 5 rue Saint-Louis 35000 Rennes<br> <br>
						Vendeur : pseudo<br>
					</div>
				</div>
			</div>
		</div>
		<div class="article">
			<div>
				<h4>${utilisateur.pseudo}àremportél'enchère</h4>
				<div class="alignement">
					<img class="vignette" src="./images/RTX-SD-ALPHA.png"
						alt="Ma superbe image">
					<div class="description">
						Nvidia 4090 RTX <br> Description : Carte graphique nouvelle
						génération.<br> <br> Meilleur offre : 210 pts pat Pseudo<br>
						Mise à prix : 185 pts<br> Fin de l'enchère : 09/03/2023<br>
						Retrait : 5 rue Saint-Louis 35000 Rennes<br> <br>
						Vendeur : pseudo<br>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="block1">
		<div class="article">
			<div>
				<h4>${utilisateur.pseudo}àremportél'enchère</h4>
				<div class="alignement">
					<img class="vignette" src="./images/RTX-SD-ALPHA.png"
						alt="Ma superbe image">
					<div class="description">
						Nvidia 4090 RTX <br> Description : Carte graphique nouvelle
						génération.<br> <br> Meilleur offre : 210 pts pat Pseudo<br>
						Mise à prix : 185 pts<br> Fin de l'enchère : 09/03/2023<br>
						Retrait : 5 rue Saint-Louis 35000 Rennes<br> <br>
						Vendeur : pseudo<br>
					</div>
				</div>
			</div>
		</div>
		<div class="article">
			<div>
				<h4>${utilisateur.pseudo}àremportél'enchère</h4>
				<div class="alignement">
					<img class="vignette" src="./images/RTX-SD-ALPHA.png"
						alt="Ma superbe image">
					<div class="description">
						Nvidia 4090 RTX <br> Description : Carte graphique nouvelle
						génération.<br> <br> Meilleur offre : 210 pts pat Pseudo<br>
						Mise à prix : 185 pts<br> Fin de l'enchère : 09/03/2023<br>
						Retrait : 5 rue Saint-Louis 35000 Rennes<br> <br>
						Vendeur : pseudo<br>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="block1">
		<div class="article">
			<div>
				<h4>${utilisateur.pseudo}àremportél'enchère</h4>
				<div class="alignement">
					<img class="vignette" src="./images/RTX-SD-ALPHA.png"
						alt="Ma superbe image">
					<div class="description">
						Nvidia 4090 RTX <br> Description : Carte graphique nouvelle
						génération.<br> <br> Meilleur offre : 210 pts pat Pseudo<br>
						Mise à prix : 185 pts<br> Fin de l'enchère : 09/03/2023<br>
						Retrait : 5 rue Saint-Louis 35000 Rennes<br> <br>
						Vendeur : pseudo<br>
					</div>
				</div>
			</div>
		</div>
		<div class="article">
			<div>
				<h4>${utilisateur.pseudo}àremportél'enchère</h4>
				<div class="alignement">
					<img class="vignette" src="./images/RTX-SD-ALPHA.png"
						alt="Ma superbe image">
					<div class="description">
						Nvidia 4090 RTX <br> Description : Carte graphique nouvelle
						génération.<br> <br> Meilleur offre : 210 pts pat Pseudo<br>
						Mise à prix : 185 pts<br> Fin de l'enchère : 09/03/2023<br>
						Retrait : 5 rue Saint-Louis 35000 Rennes<br> <br>
						Vendeur : pseudo<br>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>

<!-- LIEN BOOTSTRAP AU CAS OU -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</html>