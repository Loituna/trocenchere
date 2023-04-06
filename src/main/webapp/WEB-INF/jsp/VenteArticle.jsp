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
<link rel="stylesheet" href="./css/style1.css">


<!-- CONTENU DE LA PAGE -->
<div class="block1">
<div class="article2">
	<br>
	<h4>Nouvelle Vente</h4>
	<br>
	<form action="<%=request.getContextPath()%>/ServletVenteArticle" method="post">
		
		<label for="nomArticle">Article : </label>
		<input class="block2" type="text" id="nomArticle" name="nomArticle" required="required" value="<%=listeMessagesErreur != null ? request.getParameter("nomArticle") : ""%>" />
			
			<br>
			
		<label for="descriptionArticle">Description : </label>
		<input class="block2" type="text" id="descriptionArticle" name="descriptionArticle" required="required" style="width: 300px; height: 100px;" value="<%=listeMessagesErreur != null ? request.getParameter("descriptionArticle") : ""%>" />
			
			<br>
			
			
		<select name="ListeCategorie" id="listcate"required="required">
			<option value="1">Informatique</option>
			<option value="2">Ameublement</option>
			<option value="3">Vetement</option>
			<option value="4">Sport</option>
			<option value="5">Loisir</option>
	
		</select>
		<br>
		
		<label>Photo de l'article </label>
		<input type="file" id="photoArticle" name="photoArticle" >
		<br>
		<label>Prix de l'article </label>
		<input type="number" id="credit" name ="credit" min ="100" max="10000"required="required">
		<br>
		
		<label for="DebutEnchere">Debut de votre enchère</label>

		<input type="datetime-local" id="DebutEnchere"
       name="DebutEnchere" value="2023-03-12T6:53"
       min="2023-03-12T6:53" max="2023-06-14T00:00"required="required">
		
		<br>
		
		<label for="FinEnchere">Fin de votre enchère</label>

		<input type="datetime-local" id="FinEnchere"
       name="FinEnchere" value="2023-03-12T6:53"
       min="2023-03-12T6:53" max="2030-06-14T00:00"required="required">
       
       <div>
       <br>
       <br>

       
       <h4>Retrait</h4>
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
       <br>
       <input type="submit" value="Validation Enchere"/>
       
	</form>
	
	<a href="ServletAccueilCoo">
			<input type="submit" value="Annulation"/>
		</a>
	</div>	
</div>			
<jsp:include page="./fragments/foot.jsp"></jsp:include>