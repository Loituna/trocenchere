 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@page import="java.util.List"%>
<link href="./css/style.css" rel="stylesheet">
<html>
<head>
<meta charset="UTF-8">
<title>Vente Article</title>
</head>
<h3>Site d'enchere en ligne le plus beau de la promo</h3>
<%
List<String> listeMessagesErreur = (List<String>) request.getAttribute("listeMessagesErreur");
%>
<body>
	<h1>Nouvelle Vente</h1>
	<form action="<%=request.getContextPath()%>/ServletVenteArticle"
		method="post">
		<label for="nomArticle">Article : </label><input type="text"
			id="nomArticle" name="nomArticle" required="required"
			value="<%=listeMessagesErreur != null ? request.getParameter("nomArticle") : ""%>" />
			<br>
		<label for="descriptionArticle">Description : </label><input
			type="text" id="descriptionArticle" name="descriptionArticle" required="required"
			value="<%=listeMessagesErreur != null ? request.getParameter("descriptionArticle") : ""%>" />
			<br>
			
			
		<select name="ListeCategorie" id="listcate">
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
		<input type="number" id="credit" name ="credit" min ="100" max="1000">
		<br>
		
		<label for="DebutEnchere">Debut de votre enchère</label>

		<input type="datetime-local" id="DebutEnchere"
       name="DebutEnchere" value="2023-03-12T6:53"
       min="2023-03-12T6:53" max="2023-06-14T00:00">
		
		<br>
		
		<label for="FinEnchere">Fin de votre enchère</label>

		<input type="datetime-local" id="FinEnchere"
       name="FinEnchere" value="2023-03-12T6:53"
       min="2023-03-12T6:53" max="2030-06-14T00:00">
       
       <div>
       <h2>Retrait</h2>
       <label for="rueRetrait">Rue :  </label><input type="text"
			id="rueRetrait" name="rueRetrait" required="required"
			value="<%=listeMessagesErreur != null ? request.getParameter("adresseRetrait") : "Adresse"%>" />
			<br>
			<label for="CPRetrait">Rue :  </label><input type="text"
			id="CPRetrait" name="CPRetrait" required="required"
			value="<%=listeMessagesErreur != null ? request.getParameter("CPRetrait") : "CP"%>" />
			<br>
				<label for="VilleRetrait">Rue :  </label><input type="text"
			id="VilleRetrait" name="VilleRetrait" required="required"
			value="<%=listeMessagesErreur != null ? request.getParameter("VilleRetrait") : "Ville"%>" />
			<br>
       
       </div>
       <input type="submit" value="Validation Enchere"/>
       
	</form>
	<a href="ServletAccueilCoo">
			<input type="submit" value="Annulation"/>
		</a>
</body>
</html>