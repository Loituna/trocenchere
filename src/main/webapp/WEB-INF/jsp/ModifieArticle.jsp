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
		<form class="article2" action="<%=request.getContextPath()%>/ServletEnchereVendeur" method="post">
			<br>
			<h4>Modification Article</h4>
			<br>
				<select name="ListeCategorie" id="listcate">
					<option value="1">Informatique</option>
					<option value="2">Ameublement</option>
					<option value="3">Vetement</option>
					<option value="4">Sport</option>
					<option value="5">Loisir</option>
				</select>
				<br>
				<br>
				<div class="container">
					<div class="div1"> <label for="idArticle">Article : </label> </div>
					<div class="div2"> <input name="nomArticle" value="${article.nomArticle}" /> </div>
				</div>
				
				<div class="container">
					<div class="div1"> <label for="idDescription ">Description : </label> </div>
					<div class="div2"> <input name="descriptionArticle" value="${article.description}" style="width: 250px; height: 100px;" /> </div>
				</div>
				
				<div class="container">
					<div class="div1"> <label>Modifié date de fin d'enchere</label> </div>
					<div class="div2"> <input type="datetime-local" id="FinEnchere" name="FinEnchere" value="2023-03-12T6:53" min="2023-03-12T6:53" max="2030-06-14T00:00"required="required"> </div>
				</div>
				
	
				<div>
				<h4>Retrait</h4>
				</div>
				
				<div class="container">
					<div class="div1">  <label for="rueRetrait">Rue : </label> </div>
					<div class="div2"> <input type="text" name="rueRetrait" required="required" value="${utilisateur.rue}" /> </div>
				</div>
				
				<div class="container">	
					<div class="div1">  <label for="CPRetrait">Code Postal : </label> </div>
					<div class="div2"> <input type="text" name="CPRetrait" required="required" value="${utilisateur.CP}" /> </div>
				</div>
				
				<div class="container">	
					<div class="div1">  <label for="VilleRetrait">Ville : </label> </div>
					<div class="div2"> <input type="text" name="VilleRetrait" required="required" value="${utilisateur.ville}" /> </div>
				</div>
				<br>
				<input type="submit" onclick="alert('Enchere Modifié !')"
					value="Enregistrer" />
		</form>
</div>

<jsp:include page="./fragments/foot.jsp"></jsp:include>