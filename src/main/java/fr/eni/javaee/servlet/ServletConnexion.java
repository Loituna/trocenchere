package fr.eni.javaee.servlet;

import java.io.IOException;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bll.utilisateur.UserManager;
import fr.eni.javaee.bll.utilisateur.UserManagerSingleton;
import fr.eni.javaee.bo.Utilisateur;

/**
 * Servlet implementation class ServletConnexion
 */
@WebServlet("/ServletConnexion")
public class ServletConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SESSION_UTILISATEUR= "utilisateur";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletConnexion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/connexion.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		try {

			UserManager instance = UserManagerSingleton.getInstance();

			Utilisateur util = instance.authentificationUtilisateur(request.getParameter("pseudo"), 
																	request.getParameter("mdp"));
			
			if (util != null) { 
				HttpSession session = request.getSession();
				session.setAttribute(SESSION_UTILISATEUR, util);
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/accueilConnecte.jsp");
				rd.forward(request, response);
			}
			else {
				//TODO gestion erreur!!!!
			}

		} catch (BusinessException e) {

			request.setAttribute("listeCodesErreur", e.getListeCodesErreur());

			request.setAttribute("listeMessagesErreur", e.getListeCodesErreur().stream()
					.map(x -> fr.eni.javaee.messages.LecteurMessage.getMessageErreur(x)).collect(Collectors.toList())

			);

			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/accueilConnecte.jsp");
			rd.forward(request, response);
			return;
		}


		response.sendRedirect("./ServletAccueil");
	}

}
