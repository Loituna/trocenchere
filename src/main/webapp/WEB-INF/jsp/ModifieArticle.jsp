<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<jsp:include page="./fragments/head.jsp">
	<jsp:param name="title" value="Modifier Article" />
</jsp:include>

	<!-- RESTER CONNECTE -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="fr.eni.javaee.bo.Utilisateur"%>
<%
List<String> listeMessagesErreur = (List<String>) request.getAttribute("listeMessagesErreur");
%>


<div class="article">
	<form action="<%=request.getContextPath()%>/ServletEnchereVendeur"
		method="post">

		<div>
			<h5>Modification Article</h5>
			<br> <label for="idArticle">Article : </label><input
				name="nomArticle" value="${article.nomArticle}" /> <br> <br>
			<label for="idDescription ">Description : </label><input
				name="descriptionArticle" value="${article.description}"
				style="width: 300px; height: 100px;" /> <br> <label>Modifié
				date de fin d'enchere</label> <input type="datetime-local" id="FinEnchere"
				name="FinEnchere" value="2023-03-12T6:53" min="2023-03-12T6:53"
				max="2030-06-14T00:00"> <select name="ListeCategorie"
				id="listcate">
				<option value="1">Informatique</option>
				<option value="2">Ameublement</option>
				<option value="3">Vetement</option>
				<option value="4">Sport</option>
				<option value="5">Loisir</option>
			</select>


			<div>
				<h2>Retrait</h2>
				<label for="rueRetrait">Rue : </label><input type="text"
					name="rueRetrait" required="required" value="${utilisateur.rue}" />
				<br> <label for="CPRetrait">Code Postal : </label><input
					type="text" name="CPRetrait" required="required"
					value="${utilisateur.CP}" /> <br> <label for="VilleRetrait">Ville
					: </label><input type="text" name="VilleRetrait" required="required"
					value="${utilisateur.ville}" /> <br>

			</div>

			<input type="submit" onclick="alert('Enchere Modifié !')"
				value="Enregistrer" />

		</div>
	</form>
</div>


<jsp:include page="./fragments/foot.jsp"></jsp:include>