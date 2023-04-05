<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="./fragments/head.jsp">
	<jsp:param name="title" value="Enchère" />
</jsp:include>

<<<<<<< HEAD
<!-- RESTER CONNECTE -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="fr.eni.javaee.bo.Utilisateur"%>
<%
List<String> listeMessagesErreur = (List<String>) request.getAttribute("listeMessagesErreur");
%>
=======
<a href="ServletEnchere">Enchères</a>
>>>>>>> branch 'master' of https://github.com/Loituna/trocenchere

<div class="article">
	<p>Filtres :</p>
	<br>
	<form action="<%=request.getContextPath()%>/ServletAcceuil"
		method="post">
		<input type="texte" id="searchart" name="barrearticle"
			value="Le nom de l'article contient">
	</form>
	<form class="Formcate"
		action="<%=request.getContextPath()%>/ServletInscription"
		method="post">
		<select name="Liste Categorie" id="listcate">
			<option value="Informatique">Informatique</option>
			<option value="Ameublement">Ameublement</option>
			<option value="Vetement">Vetement</option>
			<option value="Sport">Sport</option>
			<option value="Loisir">Loisir</option>
		</select> <input type="submit" value="Rechercher">
	</form>
	<br>
	<form action="">
		<div>
			<input type="radio" name="achat" value="achats" id="achats-radio">
			<label for="achats-radio">Achats</label> <input type="radio"
				name="achat" value="mesVentes" id="ventes-radio"> <label
				for="ventes-radio">Mes Ventes</label>
		</div>
	</form>

	<div id="achats-section" style="display: none;">
		<br> <input type="radio" name="achat-item" value="item1"
			id="achatItem1-radio"> <label for="item1-radio">Enchères
			ouvertes</label> <br> <input type="radio" name="achat-item"
			value="item2" id="achatItem2-radio"> <label for="item2-radio">Mes
			enchères</label> <br> <input type="radio" name="achat-item"
			value="item3" id="achatItem3-radio"> <label for="item3-radio">Mes
			enchères remportées</label>
	</div>

	<div id="ventes-section" style="display: none;">
		<br> <input type="radio" name="vente-item" value="vente1"
			id="venteItem1-radio"> <label for="item4-radio">Mes
			ventes en cours</label> <br> <input type="radio" name="vente-item"
			value="vente2" id="venteItem2-radio"> <label
			for="item5-radio">Ventes non débutées</label> <br> <input
			type="radio" name="vente-item" value="vente3" id="venteItem3-radio">
		<label for="item6-radio">Ventes terminées</label>
	</div>

	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script>
		$(document).ready(function() {
			$('input[type=radio][name=achat]').change(function() {
				if (this.value == 'achats') {
					$('#achats-section').show();
					$('#ventes-section').hide();
				} else if (this.value == 'mesVentes') {
					$('#achats-section').hide();
					$('#ventes-section').show();
				}
			});
		});
	</script>
</div>

<jsp:include page="./fragments/foot.jsp"></jsp:include>