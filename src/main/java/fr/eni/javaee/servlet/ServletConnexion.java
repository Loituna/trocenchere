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


import fr.eni.javaee.bll.BusinessException;
import fr.eni.javaee.bll.UserManager;
import fr.eni.javaee.bll.UserManagerSingleton;


/**
 * Servlet implementation class ServletConnexion
 */
@WebServlet("/ServletConnexion")
public class ServletConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SESSION_UTILISATEUR_PSEUDO = "pseudo";
	private static final String SESSION_UTILISATEUR_ID = "id";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConnexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/connexion.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String pseudo;
		String mdp;
		try
		{
		
			pseudo = request.getParameter("pseudo");
			mdp = request.getParameter("mdp");
			new UserManagerSingleton();
		
		UserManager instance = UserManagerSingleton.getInstance();		
		
		instance.authentificationUtilisateur(pseudo,mdp);
		
		} catch (BusinessException e) {
		
		request.setAttribute("listeCodesErreur", e.getListeCodesErreur());
		
		request.setAttribute("listeMessagesErreur",
					e.getListeCodesErreur()
					.stream()
					.map(x -> fr.eni.javaee.messages.LecteurMessage.getMessageErreur(x))
					.collect(Collectors.toList())
					
		);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/accueilConnecte.jsp");
		rd.forward(request, response);	
		return;
		}
		
		HttpSession session = request.getSession();
        session.setAttribute(SESSION_UTILISATEUR_ID, pseudo);
        session.setAttribute(SESSION_UTILISATEUR_PSEUDO, pseudo);
        
		response.sendRedirect("./ServletAccueuil");
	}

}
