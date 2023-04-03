package fr.eni.javaee.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bll.utilisateur.UserManager;
import fr.eni.javaee.bll.utilisateur.UserManagerSingleton;
import fr.eni.javaee.bo.Utilisateur;

/**
 * Servlet implementation class ServletInscription
 */
@WebServlet("/ServletInscription")
public class ServletInscription extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletInscription() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/Inscription.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		if ((request.getParameter("MDP")).equals(request.getParameter("MDPconfirm"))) {
			
			Utilisateur creation = new Utilisateur();
	
			creation.setPseudo(request.getParameter("pseudo"));
			creation.setNom(request.getParameter("Nom"));
			creation.setPrenom(request.getParameter("Prenom"));
			creation.setEmail(request.getParameter("Email"));
			creation.setTelephone(request.getParameter("Telephone"));
			creation.setRue(request.getParameter("Rue"));
			creation.setCP(request.getParameter("CodePostal"));
			creation.setVille(request.getParameter("Ville"));
			creation.setMdp(request.getParameter("MDP"));
			
			
			try {
				UserManagerSingleton.getInstance().creationUtilisateur(creation);
			} catch (BusinessException e) {
				request.setAttribute("Erreur", "PATATE");
				System.out.println("PATATE");
				e.printStackTrace();
			}
			
		}
		else {
			//erreur à gérer !!!
			
			request.setAttribute("Erreur", "mauvaise confirmation du mot de passe");
			//mot de passe pas bon
		}
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/accueilConnecte.jsp");
		rd.forward(request, response);	
	
	}
}
