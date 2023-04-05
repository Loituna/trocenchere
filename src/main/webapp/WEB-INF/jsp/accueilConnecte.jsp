<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="./fragments/headDesignConnect.jsp">
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
<!-- CONTENU DE LA PAGE -->
<div class="block1">
	<div class="article">
		<div>
			<h4>Ventes en cours</h4>
			<div class="alignement">
				<img class="vignette" src="./images/1.png"
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
					Retrait : ${retrait.rue} ${retrait.codePostal} ${retrait.ville} 
					<br> 
					<br> 
					Vendeur: ${vendeur.pseudo} 
					<br>
				</div>
			</div>
		</div>
	</div>
	<div class="article">
		<div>
			<h4>Ventes en cours</h4>
			<div class="alignement">
				<img class="vignette" src="./images/2.png"
					alt="Ma superbe image">
				<div class="description">
				<br>
					Nom de l'article : ${article2.nomArticle}
					<br> 
					Description : ${article2.description}
					
					<br> 
					Meilleur offre actuellement : ${enchere2.montant} points
					<br>
					Mise à prix : ${article2.prixInitial} points
					<br> 
					Fin de l'enchère : ${article2.dateFinEnchere}
					<br>
					Retrait : ${retrait2.rue} ${retrait2.codePostal} ${retrait2.ville} 
					<br> 
					<br> 
					Vendeur: ${vendeur2.pseudo} 
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
				<img class="vignette" src="./images/3.png"
					alt="Ma superbe image">
				<div class="description">
					<br>
					Nom de l'article : ${article3.nomArticle}
					<br> 
					Description : ${article3.description}
					
					<br> 
					Meilleur offre actuellement : ${enchere3.montant} points
					<br>
					Mise à prix : ${article3.prixInitial} points
					<br> 
					Fin de l'enchère : ${article3.dateFinEnchere}
					<br>
					Retrait : ${retrait3.rue} ${retrait3.codePostal} ${retrait3.ville} 
					<br> 
					<br> 
					Vendeur: ${vendeur3.pseudo} 
					<br>
				</div>
			</div>
		</div>
	</div>
	<div class="article">
		<div>
			<h4>Ventes en cours</h4>
			<div class="alignement">
				<img class="vignette" src="./images/4.png"
					alt="Ma superbe image">
				<div class="description">
					<br>
					Nom de l'article : ${article4.nomArticle}
					<br> 
					Description : ${article4.description}
					
					<br> 
					Meilleur offre actuellement : ${enchere4.montant} points
					<br>
					Mise à prix : ${article4.prixInitial} points
					<br> 
					Fin de l'enchère : ${article4.dateFinEnchere}
					<br>
					Retrait : ${retrait4.rue} ${retrait4.codePostal} ${retrait4.ville} 
					<br> 
					<br> 
					Vendeur: ${vendeur4.pseudo} 
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
				<img class="vignette" src="./images/5.png"
					alt="Ma superbe image">
				<div class="description">
					<br>
					Nom de l'article : ${article5.nomArticle}
					<br> 
					Description : ${article5.description}
					
					<br> 
					Meilleur offre actuellement : ${enchere5.montant} points
					<br>
					Mise à prix : ${article5.prixInitial} points
					<br> 
					Fin de l'enchère : ${article5.dateFinEnchere}
					<br>
					Retrait : ${retrait5.rue} ${retrait5.codePostal} ${retrait5.ville} 
					<br> 
					<br> 
					Vendeur: ${vendeur5.pseudo} 
					<br>
				</div>
			</div>
		</div>
	</div>
	<div class="article">
		<div>
			<h4>Ventes en cours</h4>
			<div class="alignement">
				<img class="vignette" src="./images/6.png"
					alt="Ma superbe image">
				<div class="description">
				<br>
					Nom de l'article : ${article6.nomArticle}
					<br> 
					Description : ${article6.description}
					
					<br> 
					Meilleur offre actuellement : ${enchere6.montant} points
					<br>
					Mise à prix : ${article6.prixInitial} points
					<br> 
					Fin de l'enchère : ${article6.dateFinEnchere}
					<br>
					Retrait : ${retrait6.rue} ${retrait6.codePostal} ${retrait6.ville} 
					<br> 
					<br> 
					Vendeur: ${vendeur6.pseudo} 
					<br>
				</div>
			</div>
		</div>
	</div>
</div>


<jsp:include page="./fragments/foot.jsp"></jsp:include>