package fr.eni.javaee.servlet.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.javaee.bll.BusinessException;
<<<<<<< HEAD
=======
import fr.eni.javaee.bll.UserManager;
>>>>>>> branch 'master' of https://github.com/Loituna/trocenchere.git
import fr.eni.javaee.bll.UserManagerSingleton;
import fr.eni.javaee.bo.Utilisateur;

/**
 * Servlet implementation class ServletTestDeleteUtilisateur
 */
@WebServlet("/ServletTestDeleteUtilisateur")
public class ServletTestDeleteUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTestDeleteUtilisateur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
		Utilisateur user = new Utilisateur();
		try {
			UserManagerSingleton.getInstance().suppressionUtilisateur(user);
		}catch (BusinessException e) {
=======
		Utilisateur util = new Utilisateur();
		try { UserManagerSingleton.getInstance().suppressionUtilisateur(util);

		} catch (BusinessException e){
>>>>>>> branch 'master' of https://github.com/Loituna/trocenchere.git
			e.printStackTrace();
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
