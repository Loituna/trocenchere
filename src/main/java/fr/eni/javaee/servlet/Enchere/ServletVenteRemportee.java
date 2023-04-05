package fr.eni.javaee.servlet.Enchere;

import java.io.IOException;

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
import fr.eni.javaee.bo.Utilisateur;

/**
 * Servlet implementation class ServletVenteRemportee
 */
@WebServlet("/ServletVenteRemportee")
public class ServletVenteRemportee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SESSION_UTILISATEUR = "utilisateur";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletVenteRemportee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		Utilisateur utilisateur = (Utilisateur) session.getAttribute(SESSION_UTILISATEUR);
		request.setAttribute(SESSION_UTILISATEUR, utilisateur);
	
		
		
		try {
			utilisateur = BLLFactory.getUserManager().getUserById(utilisateur);
			request.setAttribute("utilisateur", utilisateur);
			System.out.println("utilisateur : " + utilisateur);

			Article article = new Article();
			article.setNoArticle(1);
					BLLFactory.getArticleManager().selectByNoArticle(article);
			request.setAttribute("article", article );
			System.out.println("article : " + article + "Servlet");
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		RequestDispatcher rd1 = request.getRequestDispatcher("/WEB-INF/jsp/VenteRemportee.jsp");
		rd1.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd1 = request.getRequestDispatcher("/WEB-INF/jsp/VenteRemportee.jsp");
		rd1.forward(request, response);
	}

}
