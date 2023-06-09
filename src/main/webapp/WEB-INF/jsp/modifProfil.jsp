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
	<form class="article2" action="<%=request.getContextPath()%>/ServletModifProfil" method="post">
	<br>
		<h4>Mon profil</h4>
				<br>
					<input type="hidden" name="identifiant" value="${utilisateur.noUtilisateur}" /> 
				<br> 
					<div class="container"> 
						<div class="div1"> <label for="idPseudo">Pseudo : </label></div>
						<div class="div2"> <input name="pseudo" value="${utilisateur.pseudo}" /></div>
					</div>
				
					<div class="container"> 
						<div class="div1"> <label for="idNom">Nom : </label></div>
						<div class="div2"> <input name="nom" value=" ${utilisateur.nom}" /> </div>
					</div>
				
					<div class="container">
						<div class="div1"> <label for="idPrenom">Prenom : </label> </div>
						<div class="div2"> <input name="prenom" value="${utilisateur.prenom}" /> </div>
					</div>
				
					<div class="container"> 
						<div class="div1"> <label for="idEmail">Email: </label></div>
						<div class="div2"> <input name="email" value=" ${utilisateur.email}" /> </div>
					</div>
				
					<div class="container">  
						<div class="div1"> <label for="idTelephone">Téléphone : </label> </div>
						<div class="div2"> <input name="telephone"value="${utilisateur.telephone}" /> </div>
					</div>
					
					<div class="container">  
						<div class="div1"> <label for="idRue">Rue: </label></div>
						<div class="div2"> <input name="rue" value="${utilisateur.rue}" /> </div>
					</div>
				
					<div class="container"> 
						<div class="div1"> <label for="idCodePostal">Code Postal : </label></div>
						<div class="div2"> <input name="cp" value="${utilisateur.CP}" /> </div>
					</div>
					
					<div class="container"> 
						<div class="div1"> <label for="idVille">Ville: </label></div>
						<div class="div2"> <input name="ville" value="${utilisateur.ville}" /> </div>
					</div>
				
					<div class="container"> 
						<div class="div1"> <label for="idMotsPasse">Mots de passe actuel : </label> </div>
						<div class="div2"> <input type="text" required="required" value="" /> </div>
					</div>
					
					<div class="container"> 
						<div class="div1"> <label for="idMDP">Nouveau mots de passe : </label> </div>
						<div class="div2"> <input type="text" id="idMDP" name="MDP" required="required" value="<%=listeMessagesErreur != null ? request.getParameter("MDP") : ""%>" /> </div>
					</div>
					
					<div class="container"> 
						<div class="div1"> <label for="idMDPconfirm">Confirmez le mots de passe : </label> </div>
						<div class="div2"> <input type="text" id="idMDPconfirm" name="MDPconfirm" required="required" value="<%=listeMessagesErreur != null ? request.getParameter("MDPConfirm") : ""%>" /> </div>
					</div>
			 
		
					<label for="credit">Credit : </label>${utilisateur.credit}
		
				<br> 
					<input type="submit" onclick="alert('Modifié !')" value="Enregistrer" />
				
				<a href="./ServletAccueilCoo">
					<button type="button">Retourner à l'accueil</button>
				</a>
		
	</form>
</div>



<jsp:include page="./fragments/foot.jsp"></jsp:include>