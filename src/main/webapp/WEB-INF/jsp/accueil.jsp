<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="./fragments/headDesign.jsp">
	<jsp:param name="title" value="Enchère" />
</jsp:include>

<!-- RESTER CONNECTE -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="fr.eni.javaee.bo.Utilisateur"%>
<%
List<String> listeMessagesErreur = (List<String>) request.getAttribute("listeMessagesErreur");
%>

<!-- LIEN CSS -->
<link rel="stylesheet" href="./css/AccueilDesign.css">



<!-- CONTENU DE LA PAGE -->
<div class="block1">
	<div class="article">
		<div>
			<h4>Ventes en cours</h4>
			<div class="alignement">
				<img class="vignette" src="./images/RTX-SD-ALPHA.png"
					alt="Ma superbe image">
				<div class="description">
					
					<br>
					Nom de l'article : ${article.nomArticle}
					<br> 
					Description : ${article.description}
					
					<br> 
					Meilleur offre actuellement : ${enchere.montant} points
					<br>
					Mise à prix : ${article.prixInitial} points
					<br> 
					Fin de l'enchère : ${article.dateFinEnchere}
					<br>
					Retrait : ${utilisateur.rue} ${utilisateur.CP} ${utilisateur.ville}
					<br> 
					<br> 
					Vendeur: ${utilisateur.nom} 
					<br>
				</div>
			</div>
		</div>
	</div>
	<div class="article">
		<div>
			<h4>Ventes en cours</h4>
			<div class="alignement">
				<img class="vignette" src="./images/RTX-SD-ALPHA.png"
					alt="Ma superbe image">
				<div class="description">
					<br>
					Nom de l'article : ${article2.nomArticle}
					<br> 
					Description : ${article.description}
					
					<br> 
					Meilleur offre actuellement : ${enchere.montant} points
					<br>
					Mise à prix : ${article.prixInitial} points
					<br> 
					Fin de l'enchère : ${article.dateFinEnchere}
					<br>
					Retrait : ${utilisateur.rue} ${utilisateur.CP} ${utilisateur.ville}
					<br> 
					<br> 
					Vendeur: ${utilisateur.nom} 
					<br>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="block1">
	<div class="article">
		<div>
			<h4>Ventes en cours</h4>
			<div class="alignement">
				<img class="vignette" src="./images/RTX-SD-ALPHA.png"
					alt="Ma superbe image">
				<div class="description">
					<br>
					Nom de l'article : ${article3.nomArticle}
					<br> 
					Description : ${article.description}
					
					<br> 
					Meilleur offre actuellement : ${enchere.montant} points
					<br>
					Mise à prix : ${article.prixInitial} points
					<br> 
					Fin de l'enchère : ${article.dateFinEnchere}
					<br>
					Retrait : ${utilisateur.rue} ${utilisateur.CP} ${utilisateur.ville}
					<br> 
					<br> 
					Vendeur: ${utilisateur.nom} 
					<br>
				</div>
			</div>
		</div>
	</div>
	<div class="article">
		<div>
			<h4>Ventes en cours</h4>
			<div class="alignement">
				<img class="vignette" src="./images/RTX-SD-ALPHA.png"
					alt="Ma superbe image">
				<div class="description">
					<br>
					Nom de l'article : ${article4.nomArticle}
					<br> 
					Description : ${article.description}
					
					<br> 
					Meilleur offre actuellement : ${enchere.montant} points
					<br>
					Mise à prix : ${article.prixInitial} points
					<br> 
					Fin de l'enchère : ${article.dateFinEnchere}
					<br>
					Retrait : ${utilisateur.rue} ${utilisateur.CP} ${utilisateur.ville}
					<br> 
					<br> 
					Vendeur: ${utilisateur.nom} 
					<br>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="block1">
	<div class="article">
		<div>
			<h4>Ventes en cours</h4>
			<div class="alignement">
				<img class="vignette" src="./images/RTX-SD-ALPHA.png"
					alt="Ma superbe image">
				<div class="description">
					<br>
					Nom de l'article : ${article5.nomArticle}
					<br> 
					Description : ${article.description}
					
					<br> 
					Meilleur offre actuellement : ${enchere.montant} points
					<br>
					Mise à prix : ${article.prixInitial} points
					<br> 
					Fin de l'enchère : ${article.dateFinEnchere}
					<br>
					Retrait : ${utilisateur.rue} ${utilisateur.CP} ${utilisateur.ville}
					<br> 
					<br> 
					Vendeur: ${utilisateur.nom} 
					<br>
				</div>
			</div>
		</div>
	</div>
	<div class="article">
		<div>
			<h4>Ventes en cours</h4>
			<div class="alignement">
				<img class="vignette" src="./images/RTX-SD-ALPHA.png"
					alt="Ma superbe image">
				<div class="description">
				<br>
					Nom de l'article : ${article6.nomArticle}
					<br> 
					Description : ${article.description}
					
					<br> 
					Meilleur offre actuellement : ${enchere.montant} points
					<br>
					Mise à prix : ${article.prixInitial} points
					<br> 
					Fin de l'enchère : ${article.dateFinEnchere}
					<br>
					Retrait : ${utilisateur.rue} ${utilisateur.CP} ${utilisateur.ville}
					<br> 
					<br> 
					Vendeur: ${utilisateur.nom} 
					<br>
				</div>
			</div>
		</div>
	</div>
</div>


<jsp:include page="./fragments/foot.jsp"></jsp:include>