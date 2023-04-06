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

<!-- FONCTION DE LA PAGE, CODE A CHANGER -->
<div class="block1">
<div class="article2">	
	<br>
	<h4>Mon profil</h4>
	<br>
	<form action="<%=request.getContextPath()%>/ServletInscription"method="post">
		
		<div class="container">
			<div class="div1"> <label for="idPseudo">Pseudo : </label></div>
			<div class="div2"> <input type="text" id="idPseudo" name="pseudo"  required="required" value="<%=listeMessagesErreur!=null?request.getParameter("pseudo"):""%>"/></div>
		</div>
		
		<div class="container">
			<div class="div1"> <label for="idNom">Nom : </label></div>
			<div class="div2"> <input type="text" id="idNom" name="Nom" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("Nom"):""%>"/></div>
		</div>
		
		<div class="container">
			<div class="div1"> <label for="idPrenom">Prenom : </label></div>
			<div class="div2"> <input type="text" id="idPrenom" name="Prenom" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("Prenom"):""%>"/></div>
		</div>
		
		<div class="container">
			<div class="div1"> <label for="idEmail">Email : </label></div>
			<div class="div2"> <input type="email" id="idEmail" name="Email"  required="required" required pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" value="<%=listeMessagesErreur!=null?request.getParameter("Email"):"  "%>"/></div>
		</div>
		
		<div class="container">
			<div class="div1"> <label for="idTelephone">Téléphone : </label></div>
			<div class="div2"> <input type="tel" id="idTelephone" name="Telephone" required="required" pattern="[0-9][0-9] [0-9][0-9] [0-9][0-9] [0-9][0-9] [0-9][0-9]" title="Veuillez entrer un numéro de téléphone valide de type 01 23 45 67 89." value="<%=listeMessagesErreur!=null?request.getParameter("Telephone"):""%>"/></div>
		</div>
		
		<div class="container">
			<div class="div1"> <label for="idRue">Rue : </label></div>
			<div class="div2"> <input type="text" id="idRue" name="Rue" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("Rue"):""%>"/></div>
		</div>
		
		<div class="container">
			<div class="div1"> <label for="idCodePostal">Code Postal : </label></div>
			<div class="div2"> <input type="text" id="idCodePostal" name="CodePostal" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("CodePostal"):""%>"/></div>
		</div>
		
		<div class="container">
			<div class="div1"> <label for="idVille">Ville : </label></div>
			<div class="div2"> <input type="text" id="idVille" name="Ville" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("Ville"):""%>"/></div>
		</div>
		
		<div class="container">
			<div class="div1"> <label for="idMDP">Mot de passe : </label></div>
			<div class="div2"> <input type="password" id="idMDP" name="MDP" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("MDP"):""%>"/></div>
		</div>
		
		<div class="container">
			<div class="div1"> <label for="idMDPconfirm">Confirmation Mot de Passe : </label></div>
			<div class="div2"> <input type="password" id="idMDPconfirm" name="MDPconfirm" required="required" value="<%=listeMessagesErreur!=null?request.getParameter("MDPConfirm"):""%>"/> </div>
		</div>
		<br>
		<input type="submit" value="Validation Inscription"/>

	</form>
		<a href="ServletAccueil">
			<input type="submit" value="Annulation"/>
		</a>
</div>		
</div>	
		
<jsp:include page="./fragments/foot.jsp"></jsp:include>