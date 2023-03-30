<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="fr.eni.javaee.bo.Article;" %>

<%
		List<String> listeMessagesErreur = (List<String>)request.getAttribute("listeMessagesErreur");
	%>
	<% Article instance ; %>
<html>
<head>
<meta charset="UTF-8">
<title>Enchere</title>
</head>
<body>
	<h3>Site d'enchere en ligne le plus beau de la promo</h3>
	<h1>Détails Vente </h1>
	
	<label for="nomArticle">Article</label><input type="text" id="nomArticle" name="Nom de l'article"   value=""/>
	<label for="DescriptionArtcile">Description : </label>
	
</body>
</html>