<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="./fragments/head.jsp">
	<jsp:param name="title" value="Enchère" />
</jsp:include>

<!-- RESTER CONNECTE -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="fr.eni.javaee.bo.Utilisateur"%>
<%
List<String> listeMessagesErreur = (List<String>) request.getAttribute("listeMessagesErreur");
%>

<div class="article">
	<form action="<%=request.getContextPath()%>/ServletConnexion" method="post">
		<label for="idPseudo">Pseudo : </label><input type="text" id="idPseudo" name="pseudo" value="<%=listeMessagesErreur!=null?request.getParameter("pseudo"):""%>"/>
		<br/>
		<label for="idPass">Mot de passe : </label><input type="password" id="idPass" name="mdp" value="<%=listeMessagesErreur!=null?request.getParameter("mdp"):""%>"/>
		<br/>
		<input type="submit" value="Connexion"/>
	</form>
</div>
	
<jsp:include page="./fragments/foot.jsp"></jsp:include>