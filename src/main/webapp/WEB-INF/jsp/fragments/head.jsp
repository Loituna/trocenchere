<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./css/VenteRemporteeUser.css" rel="stylesheet">

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
							<li><a class="dropdown-item" href="test.html">Informatique</a></li>
							<li><a class="dropdown-item" href="index.html">Ameublement</a></li>
							<li><a class="dropdown-item" href="index.html">Vetement</a></li>
							<li><a class="dropdown-item" href="index.html">Sport</a></li>
							<li><a class="dropdown-item" href="index.html">Loisir</a></li>
						</ul></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" role="button"
						data-bs-toggle="dropdown" aria-expanded="false"> Enchère </a>
						<ul class="dropdown-menu">
							<li><a class="dropdown-item" href="test.html">Vendre</a></li>
							<li><a class="dropdown-item" href="index.html">Acheter</a></li>
						</ul></li>
						<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="ServletConnexion">Connexion</a></li>
						<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="ServletAccueil">Deconnexion</a></li>
				</ul>
			</div>
		</div>
	</nav>