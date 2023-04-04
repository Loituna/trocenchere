package fr.eni.javaee.servlet.Enchere;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.javaee.bll.BLLFactory;
import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bo.Article;
import fr.eni.javaee.bo.Retrait;
import fr.eni.javaee.bo.Utilisateur;
import fr.eni.javaee.dal.tools.DalException;

/**
 * Servlet implementation class ServletEnchere
 */
@WebServlet("/ServletEnchereVendeur")
public class ServletEnchereVendeur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SESSION_UTILISATEUR = "utilisateur";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletEnchereVendeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO recuperer l'id de larticle à afficher
		HttpSession session = request.getSession();

		Utilisateur utilisateur = (Utilisateur) session.getAttribute(SESSION_UTILISATEUR);
		request.setAttribute(SESSION_UTILISATEUR, utilisateur);
		Article article;

		try {
			article = BLLFactory.getArticleManager().selectByNoArticle(1);
			request.setAttribute("article", article);
			System.out.println("article" + article);
		} catch (DalException e) {
			System.out.println("Echec Recuperation Article Servlet");
			e.printStackTrace();
		}
		

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/EnchereVendeur.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		Utilisateur utilisateur = (Utilisateur) session.getAttribute(SESSION_UTILISATEUR);
		request.setAttribute(SESSION_UTILISATEUR,utilisateur);
		System.out.println(utilisateur);
	

		request.setCharacterEncoding("UTF-8");

		Article creation = new Article();
		// creation.setNoUtilisateur(Integer.parseInt(session.getId()));
		creation.setNoUtilisateur(utilisateur.getNoUtilisateur());
		creation.setNomArticle(request.getParameter("nomArticle"));
		creation.setDescription(request.getParameter("descriptionArticle"));
		creation.setDateDebutEnchere(LocalDateTime.parse(request.getParameter("DebutEnchere")));
		creation.setDateFinEnchere(LocalDateTime.parse(request.getParameter("FinEnchere")));	
		creation.setNoCategorie(Integer.parseInt(request.getParameter("ListeCategorie")));

		Retrait retraitcreation = new Retrait();
		retraitcreation.setRue(request.getParameter("rueRetrait"));
		retraitcreation.setVille(request.getParameter("VilleRetrait"));
		retraitcreation.setCodePostal(request.getParameter("CPRetrait"));
		
		
		
		
		
		
		try {
			BLLFactory.getArticleManager().insert(creation, retraitcreation);
		} catch (BusinessException e) {
			System.out.println("Echec Insert Article Servlet");
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/accueilConnecte.jsp");
		rd.forward(request, response);
	}

}
