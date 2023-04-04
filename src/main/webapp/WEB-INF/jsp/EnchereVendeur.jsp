<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="fr.eni.javaee.bo.Enchere" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/VenteRemportee.css">
<title>Modification de votre article</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<!--BARRE DE NAVIGATION BOOSTRAP-->
<nav class="navbar navbar-expand-lg bg-body-tertiary">
	<div class="container-fluid">
		<a class="navbar-brand">Navigation</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
			aria-expanded="false" aria-label="Toggle navigation">
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
			</ul>
		</div>
	</div>
</nav>



</head>
<body>

	<div class="article">
	<form action="<%request.getContextPath();%>/ServletEnchereVendeur">
		<div>
			<h5>Modification Article</h5><br>
			<label for="idArticle">Article : </label><input name="nomArticle" value="${article.nomArticle}"/>	<br>
			<br>
			<label for="idDescription ">Description : </label><input name="descriptionArticle" value = "${article.description}"style="width: 300px; height: 100px;"/>
			<br>
			<label>Modifié date de fin d'enchere</label>
				<input type="datetime-local" id="FinEnchere"
       name="FinEnchere" value="2023-03-12T6:53"
       min="2023-03-12T6:53" max="2030-06-14T00:00">
			
			
			
			<select name="ListeCategorie" id="listcate">			
			<option value="1">Informatique</option>
			<option value="2">Ameublement</option>
			<option value="3">Vetement</option>
			<option value="4">Sport</option>
			<option value="5">Loisir</option>
	
		</select>
			
			
			<div>
       <h2>Retrait</h2>
       		<label for="rueRetrait">Rue :  </label><input type="text" name="rueRetrait" required="required"
			value="${utilisateur.rue}" />
			<br>
			<label for="CPRetrait">Code Postal :  </label><input type="text" name="CPRetrait" required="required"
			value="${utilisateur.CP}" />
			<br>
			<label for="VilleRetrait">Ville :  </label><input type="text" name="VilleRetrait" required="required"
			value="${utilisateur.ville}" />
			<br>
       
       </div>
			
			<input  type="submit" onclick="alert('Enchere Modifié !')" value="Enregistrer"/>

		</div>
		</form>
	</div>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</html>