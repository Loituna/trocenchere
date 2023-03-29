<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page de connexion</title>
</head>
<body>


	<form action="<%=request.getContextPath()%>/ServletConnexion" method="post">
		<label for="idPseudo">Pseudo : </label><input type="text" id="idPseudo" name="pseudo" value="<%=request.getParameter("pseudo")%>"/>
		<br/>
		<label for="idPass">Mot de passe : </label><input type="password" id="idPass" name="pass" value="<%=request.getParameter("mdp")%>"/>
		<br/>
		<input type="submit" value="Connexion"/>
	</form>
</body>
</html>