<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="fr.eni.javaee.bo.Utilisateur" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profil utilisateur</title>
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
          <a class="nav-link active" aria-current="page" href="ServletAccueilCoo">Accueil</a>
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
<h3>Site d'enchere en ligne le plus beau de la promo</h3>
<body>
	
	<form action="<%=request.getContextPath()%>/ServletAffichageUtilisateur" method="post">
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
		
</form>

<div class ="boutton modifier">
	<a href="ServletModifProfil"><button class = "modifier">Modifier</button></a>
	<a href="ServletSuppProfil"> <button>Supprimer mon compte</button> </a>
</div>


</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</html>