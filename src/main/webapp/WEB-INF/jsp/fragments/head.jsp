<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/VenteRemportee.css">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">





</head>
<body>

	<!--BARRE DE NAVIGATION BOOSTRAP-->
	<nav class="navbar navbar-expand-lg bg-body-tertiary">
		<div class="container-fluid">
			<a class="navbar-brand">Navigation</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown"
				aria-controls="navbarNavDropdown" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNavDropdown">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="ServletAccueilCoo">Accueil</a></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" role="button"
						data-bs-toggle="dropdown" aria-expanded="false"> Article </a>
						<ul class="dropdown-menu">
							<li><a class="dropdown-item" href="ServletEnchere">Acheter</a></li>
							<li><a class="dropdown-item" href="ServletVenteArticle">Vendre</a></li>
							<li><a class="dropdown-item" href="ServletModifArticle">Modifier</a></li>
						</ul></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="ServletAffichageUtilisateur">Mon
							Profil</a></li>
							<ul></ul>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="ServletInscription">Inscription</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="ServletConnexion">Connexion</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="ServletDeconnexion">Deconnexion</a></li>

				</ul>
			</div>
		</div>
	</nav>