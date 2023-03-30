<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<link href="./css/style.css" rel="stylesheet">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vente Article</title>
</head>
<%
List<String> listeMessagesErreur = (List<String>) request.getAttribute("listeMessagesErreur");
%>
<body>
	<h1>Nouvelle Vente</h1>
	<form action="<%=request.getContextPath()%>/ServletVenteArticle"
		method="post">
		<label for="nomArticle">Article : </label><input type="text"
			id="nomArtcile" name="nom de l'article" required="required"
			value="<%=listeMessagesErreur != null ? request.getParameter("nomArticle") : ""%>" />
			<br>
		<label for="descriptionArticle">Description : </label><input
			type="text" id="idPseudo" name="pseudo" required="required"
			value="<%=listeMessagesErreur != null ? request.getParameter("descriptionArticle") : ""%>" />
			<br>
		<select name="Liste Categorie" id="listcate">
			<option value="Informatique">Informatique</option>
			<option value="Ameublement">Ameublement</option>
			<option value="Vetement">Vetement</option>
			<option value="Sport">Sport</option>
			<option value="Loisir">Loisir</option>
	
		</select>
		<br>
		
		<label>Photo de l'article </label>
		<input type="file" id="photoArticle" name="Bouton cliquable pour uloader la Photo de votre Article" >
		<br>
		<input type="number" id="credit" name ="Mise de départ" min ="100" max="1000">
		<br>
		
		<label for="DebutEnchere">Debut de votre enchère</label>

		<input type="datetime-local" id="FinEnchere"
       name="Debut de votre enchere" value="2023-03-12T6:53"
       min="2023-03-12T6:53" max="2023-06-14T00:00">
		
		<br>
		
		<label for="FinEnchere">Fin de votre enchère</label>

		<input type="datetime-local" id="FinEnchere"
       name="Fin de votre enchere" value="2023-03-12T6:53"
       min="2023-03-12T6:53" max="2030-06-14T00:00">
       
       <div>
       <h2>Retrait</h2>
       <label for="rueRetrait">Rue :  </label><input type="text"
			id="rueRetrait" name="adresse de retrait de l'article" required="required"
			value="<%=listeMessagesErreur != null ? request.getParameter("adresseRetrait") : "Adresse par default a completer"%>" />
			<br>
			<label for="CPRetrait">Rue :  </label><input type="text"
			id="CPRetrait" name="code postale de retrait de l'article" required="required"
			value="<%=listeMessagesErreur != null ? request.getParameter("CPRetrait") : "CP par default a completer"%>" />
			<br>
				<label for="VilleRetrait">Rue :  </label><input type="text"
			id="VilleRetrait" name="cVille de retrait de l'article" required="required"
			value="<%=listeMessagesErreur != null ? request.getParameter("VilleRetrait") : "Ville par default a completer"%>" />
			<br>
       
       </div>
       <input type="submit" value="Validation Enchere"/>
	</form>
	<a href="ServletAccueilCoo">
			<input type="submit" value="Annulation"/>
		</a>
</body>
</html>