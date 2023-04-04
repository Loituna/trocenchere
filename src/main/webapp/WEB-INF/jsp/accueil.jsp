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

<input type = "submit" value="Rechercher">

 </form>

<br>
<br>


<select id="maListe" onchange="afficherOption()">
		<option value="option">Selection</option>
		<option value="option1">Toutes les enchères</option>
		<option value="option2">Informatique</option>
		<option value="option3">Ameublement</option>
		<option value="option4">Vetement</option>
		<option value="option5">Sport & Loisir</option>
</select>
	
	<div>
		<p id="resultat"></p>
		<p id="article-nom"></p>
		
	</div>
	<script>
	
		function afficherOption() {
			// récupérer la liste déroulante
			var liste = document.getElementById("maListe");
			
			// récupérer la valeur sélectionnée
			var option = liste.options[liste.selectedIndex].value;
			
			// afficher le résultat
			var resultat = document.getElementById("resultat");
			var articleNomElement = document.getElementById('article-nom');
			
			if (option === "option1") {
				resultat.innerHTML = "Option 1";
				articleNomElement.innerHTML = "Intitulé : " + '${article.nomArticle}' 
												+ ". Prix : " + '${article.prixVente}' + "crédits. "
												+ "Fin de l'enchère : " + '${article.dateFinEnchere}';
			} else if (option === "option2") {
				resultat.innerHTML = "Option 2 sélectionnée.";
			} else if (option === "option3") {
				resultat.innerHTML = "Option 3";
			}	else if (option === "option4") {
				resultat.innerHTML = "Option 4";
			}	else if (option === "option5") {
				resultat.innerHTML = "Option 5";
			}
		}
</script>



</body>
</html>