<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="UTF-8">
<title>Page de connexion</title>
</head>
<h3>Site d'enchere en ligne le plus beau de la promo</h3>
<body>
<%
		List<String> listeMessagesErreur = (List<String>)request.getAttribute("listeMessagesErreur");
	%>

	<form action="<%=request.getContextPath()%>/ServletConnexion" method="post">
		<label for="idPseudo">Pseudo : </label><input type="text" id="idPseudo" name="pseudo" value="<%=listeMessagesErreur!=null?request.getParameter("pseudo"):""%>"/>
		<br/>
		<label for="idPass">Mot de passe : </label><input type="password" id="idPass" name="mdp" value="<%=listeMessagesErreur!=null?request.getParameter("mdp"):""%>"/>
		<br/>
		<input type="submit" value="Connexion"/>
	</form>
	
	
</body>
</html>