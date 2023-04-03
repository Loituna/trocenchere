package fr.eni.javaee.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bll.utilisateur.UserManagerSingleton;
import fr.eni.javaee.bo.Utilisateur;

/**
 * Servlet implementation class ServletSuppProfil
 */
@WebServlet("/ServletSuppProfil")
public class ServletSuppProfil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSuppProfil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//TODO récupérer l'utilsateur dans la session
		

				Utilisateur util;
				try {
					util = UserManagerSingleton.getInstance().getUserById(4);
					request.setAttribute("utilisateur", util);
					System.out.println("utilisateur : " + util);
					
				} catch (BusinessException e) {
					System.out.println("Erreur Recuperation UserByID servlet");
					e.printStackTrace();
				}

		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/supprimerProfil.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Utilisateur util = new Utilisateur();
		
		util.setNoUtilisateur(Integer.parseInt(request.getParameter("identifiant")));
		
		try {
			UserManagerSingleton.getInstance().suppressionUtilisateur(util);
		} catch (BusinessException e) {
			System.out.println("Erreur de suppression");
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/accueil.jsp");
		rd.forward(request, response);	
	}

}
