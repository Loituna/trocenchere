<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="./fragments/head.jsp">
	<jsp:param name="title" value="Inscription" />
</jsp:include>


	<!-- RESTER CONNECTE -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="fr.eni.javaee.bo.Utilisateur"%>
<%
List<String> listeMessagesErreur = (List<String>) request.getAttribute("listeMessagesErreur");
%>
	
	<h1>Mon profil</h1>
	
	<form action="<%=request.getContextPath()%>/ServletInscription"method="post">
		<label for="idPseudo">Pseudo : </label><input type="text" id="idPseudo" name="pseudo"  required="required" value="<%=listeMessagesErreur!=null?request.getParameter("pseudo"):""%>"/>
		<br>
		<label for="idNom">Nom : </label><input type="text" id="idNom" name="Nom" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("Nom"):""%>"/>
		<br>
		<label for="idPrenom">Prenom : </label><input type="text" id="idPrenom" name="Prenom" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("Prenom"):""%>"/>
		<br>
		<label for="idEmail">Email : </label><input type="email" id="idEmail" name="Email"  required="required" required pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" value="<%=listeMessagesErreur!=null?request.getParameter("Email"):"  "%>"/>
		<br>
		<label for="idTelephone">Téléphone : </label><input type="tel" id="idTelephone" name="Telephone" required="required" pattern="[0-9][0-9] [0-9][0-9] [0-9][0-9] [0-9][0-9] [0-9][0-9]" title="Veuillez entrer un numéro de téléphone valide de type 01 23 45 67 89." value="<%=listeMessagesErreur!=null?request.getParameter("Telephone"):""%>"/>
		<br>
		<label for="idRue">Rue : </label><input type="text" id="idRue" name="Rue" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("Rue"):""%>"/>
		<br>
		<label for="idCodePostal">Code Postal : </label><input type="text" id="idCodePostal" name="CodePostal" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("CodePostal"):""%>"/>
		<br>
		<label for="idVille">Ville : </label><input type="text" id="idVille" name="Ville" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("Ville"):""%>"/>
		<br>
		<label for="idMDP">Mot de passe : </label><input type="password" id="idMDP" name="MDP" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("MDP"):""%>"/>
		<br>
		<label for="idMDPconfirm">Confirmation Mot de Passe : </label><input type="password" id="idMDPconfirm" name="MDPconfirm" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("MDPConfirm"):""%>"/>
		<br>
		<input type="submit" value="Validation Inscription"/>
		
			
	
	</form>
		<a href="ServletAccueil">
			<input type="submit" value="Annulation"/>
		</a>
<jsp:include page="./fragments/foot.jsp"></jsp:include>