package fr.eni.javaee.servlet;

import java.io.IOException;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.javaee.bll.BusinessException;
import fr.eni.javaee.bll.UserManager;
import fr.eni.javaee.bll.UserManagerImpl;
import fr.eni.javaee.bll.UserManagerSingleton;
import fr.eni.javaee.bo.Utilisateur;
import fr.eni.javaee.dal.UtilisateurDAOJdbcImpl;
import fr.eni.javaee.messages.LecteurMessage;

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
		creation.setEmail(email = request.getParameter("Email"));
		creation.setTelephone(telephone = request.getParameter("Telephone"));
		creation.setRue(rue = request.getParameter("Rue"));
		creation.setCP(CP = request.getParameter("CodePostal"));
		creation.setVille(Ville = request.getParameter("Ville"));
			
		
		if ((MDP = request.getParameter("MDP")).equals(MDPconfirm = request.getParameter("MDPconfirm")))
			creation.setMdp(MDPconfirm);
		else {
			System.out.println(" Erreur mdp > mdp confirm");

		}
			
		try {
			UserManagerSingleton.getInstance().creationUtilisateur(creation);

		} catch (BusinessException e) {
			request.setAttribute("listeCodesErreur", e.getListeCodesErreur());
			request.setAttribute("ListeMessageErreur", e.getListeCodesErreur().stream()
					.map(x -> LecteurMessage.getMessageErreur(x)).collect(Collectors.toList()));
			e.printStackTrace();
			System.out.println("Erreur creation utilisateur");
		}
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/accueilConnecte.jsp");
		rd.forward(request, response);
	}

}
