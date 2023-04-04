package fr.eni.javaee.test.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.javaee.bo.Utilisateur;

/**
 * Servlet implementation class Connectservlet
 */
@WebServlet("/Connectservlet")
public class Connectservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String SESSION_UTILISATEUR= "utilisateur";
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connectservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Utilisateur util = new Utilisateur(1, "nom", "nom", "nom", "nom", "nom", "nom", "nom", "nom", "nom");
		HttpSession session = request.getSession();
		session.setAttribute(SESSION_UTILISATEUR, util);
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
