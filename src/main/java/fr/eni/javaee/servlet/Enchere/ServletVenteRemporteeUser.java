package fr.eni.javaee.servlet.Enchere;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.javaee.bll.BLLFactory;
import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bll.utilisateur.UserManagerSingleton;
import fr.eni.javaee.bo.Article;
import fr.eni.javaee.bo.Utilisateur;
import fr.eni.javaee.dal.tools.DalException;

/**
 * Servlet implementation class ServletVenteRemportee
 */
@WebServlet("/ServletVenteRemporteeUser")
public class ServletVenteRemporteeUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SESSION_UTILISATEUR = "utilisateur";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletVenteRemporteeUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		Utilisateur utilisateur = new Utilisateur();
		request.setAttribute(SESSION_UTILISATEUR, utilisateur);
		
		try {
			utilisateur = BLLFactory.getUserManager().getUserById(utilisateur);
			
			System.out.println(SESSION_UTILISATEUR + utilisateur+"Servlet");

			Article article = new Article();
			article.setNoArticle(1);
			BLLFactory.getArticleManager().selectByNoArticle(article);
			request.setAttribute("article", article);
			System.out.println("article : " + article + "Servlet");
		} catch (BusinessException e) {
			e.printStackTrace();
		}

		RequestDispatcher rd1 = request.getRequestDispatcher("/WEB-INF/jsp/VenteRemporteeUser.jsp");
		rd1.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd1 = request.getRequestDispatcher("/WEB-INF/jsp/VenteRemporteeUser.jsp");
		rd1.forward(request, response);
	}

}
