package fr.eni.javaee.servlet.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.javaee.bll.BusinessException;
import fr.eni.javaee.bll.UserManagerSingleton;
import fr.eni.javaee.bo.Utilisateur;

/**
 * Servlet implementation class ServletTestAffichageUtilisateur
 */
@WebServlet("/ServletTestAffichageUtilisateur")
public class ServletTestAffichageUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTestAffichageUtilisateur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//TODO récupérer l'utilsateur dans la session
		
		try {
			Utilisateur util = UserManagerSingleton.getInstance().getUserById(3);
			request.setAttribute("utilisateur", util);
			
			System.out.println("utilisateur : " + util);
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
