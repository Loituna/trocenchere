<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/VenteRemportee.css">
<title>Remporter l'enchère</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<!--BARRE DE NAVIGATION BOOSTRAP-->
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand">Navigation</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.html">Accueil</a>
        </li>
        
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
           Article
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="test.html">Informatique</a></li>
            <li><a class="dropdown-item" href="index.html">Ameublement</a></li>
            <li><a class="dropdown-item" href="index.html">Vetement</a></li>
            <li><a class="dropdown-item" href="index.html">Sport</a></li>
            <li><a class="dropdown-item" href="index.html">Loisir</a></li>
          </ul>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
           Enchère
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="test.html">Vendre</a></li>
            <li><a class="dropdown-item" href="index.html">Acheter</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>



</head>
<body>
	<h4>${utilisateur.pseudo} à remporté l'enchère</h4>
	<div class="article">
		<div>
		<img src="./images/RTX-SD.jpg" alt="Ma superbe image">
		<form action="<%=request.getContextPath()%>/ServletVenteRemportee method="post">
			${article_vendu.nom_article} <br> Description : Carte graphique nouvelle
			génération.<br>
			<br>
			Meilleur offre : 210 pts pat Pseudo<br>
			Mise à prix : 185 pts<br>
			Fin de l'enchère : 09/03/2023<br>
			Retrait : 5 rue Saint-Louis 35000 Rennes<br>
			<br>
			
			Vendeur : pseudo<br>
			<br>
			
			<a href="ServletAccueilCoo"><button class="bouton">Retrait</button></a>

		</div>



	</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</html>