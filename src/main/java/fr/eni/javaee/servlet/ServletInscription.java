package fr.eni.javaee.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.javaee.bll.UserManager;
import fr.eni.javaee.bll.UserManagerSingleton;
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
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Inscription.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String pseudo;
		String nom;
		String prenom;
		String email;
		String telephone;
		String rue;
		String CP;
		String Ville;
		String MDP;
		String MDPconfirm;

		Utilisateur creation = new Utilisateur();

		creation.setPseudo(pseudo = request.getParameter("pseudo"));
		creation.setNom(nom = request.getParameter("Nom"));
		creation.setPrenom(prenom = request.getParameter("Prenom"));
		creation.setEmail(email = request.getParameter("Nom"));
		creation.setTelephone(telephone = request.getParameter("Nom"));
		creation.setRue(rue = request.getParameter("Nom"));
		creation.setCP(CP = request.getParameter("Nom"));
		creation.setVille(Ville = request.getParameter("Nom"));

		if ((MDP = request.getParameter("MDP")).equalsIgnoreCase(MDPconfirm = request.getParameter("MDPconfirm")))
			creation.setMdp(MDPconfirm);
		else {// lever exception mdp different
			

	}
	}
}
