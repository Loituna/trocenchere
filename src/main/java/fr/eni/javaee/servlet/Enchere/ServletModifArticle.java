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

/**
 * Servlet implementation class ServletEnchere
 */
@WebServlet("/ServletModifArticle")
public class ServletModifArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SESSION_UTILISATEUR = "utilisateur";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletModifArticle() {
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
			article = BLLFactory.getArticleManager().selectByNoArticle(20);
			request.setAttribute("article", article);
			System.out.println("article" + article);
		} catch (BusinessException e) {
			System.out.println("Echec Recuperation Article Servlet");
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/ModifieArticle.jsp");
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
		request.setAttribute(SESSION_UTILISATEUR, utilisateur);
	

		request.setCharacterEncoding("UTF-8");

		Article creation = new Article();
		
		creation.setNoArticle(20);
		
		creation.setNomArticle(request.getParameter("nomArticle"));
		creation.setDescription(request.getParameter("descriptionArticle"));
		creation.setDateFinEnchere(LocalDateTime.parse(request.getParameter("FinEnchere")));
		creation.setNoCategorie(Integer.parseInt(request.getParameter("ListeCategorie")));

		Retrait retraitcreation = new Retrait();
		retraitcreation.setNoArticle(creation.getNoArticle());
		retraitcreation.setRue(request.getParameter("rueRetrait"));
		retraitcreation.setVille(request.getParameter("VilleRetrait"));
		retraitcreation.setCodePostal(request.getParameter("CPRetrait"));
		
		System.out.println(utilisateur + "Utilisateur Servlet");
		System.out.println(creation + "Article Servlet");
		System.out.println(retraitcreation+"Retrait Servlet");
		try {
			BLLFactory.getArticleManager().updateArticleByUser(creation, retraitcreation);
		} catch (BusinessException e) {
			System.out.println("Echec Update Serlvet");
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/ModifieArticle.jsp");
		rd.forward(request, response);
	}

}
