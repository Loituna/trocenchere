package fr.eni.javaee.servlet.User;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bll.utilisateur.UserManagerSingleton;
import fr.eni.javaee.bo.Utilisateur;
import fr.eni.javaee.dal.DAOFactory;

/**
 * Servlet implementation class ServletTestAffichageUtilisateur
 */
@WebServlet("/ServletTestAffichageUtilisateur")
public class ServletAffichageUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SESSION_UTILISATEUR= "utilisateur";
   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAffichageUtilisateur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
//		//TODO récupérer l'utilsateur dans la session
//
//		HttpSession session = request.getSession();
//		Utilisateur utilisateur = (Utilisateur) session.getAttribute(SESSION_UTILISATEUR);
//		
//		System.out.println(utilisateur);

	
		try {
			Utilisateur util = UserManagerSingleton.getInstance().getUserById(4);
			request.setAttribute("utilisateur", util);

			
			System.out.println("utilisateur : " + util);
			HttpSession session = request.getSession();
			
			//session.setAttribute(SESSION_UTILISATEUR, util);
			Utilisateur utilisateur = (Utilisateur) session.getAttribute(SESSION_UTILISATEUR);
			
			System.out.println(utilisateur);
			/*
			if (util!=null) {
				HttpSession session = request.getSession();
				session.setAttribute(SESSION_UTILISATEUR, util);
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/afficherUtilisateur.jsp");
				rd.forward(request, response);;
			}
			*/

			
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/afficherUtilisateur.jsp");
		rd.forward(request, response);

	}
  
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/suppProfil.jsp");
		rd.forward(request, response);

	}

}
