package fr.eni.javaee.servlet.Enchere;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.javaee.bll.BLLFactory;
import fr.eni.javaee.bll.article.ArticleManagerSingleton;
import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bll.utilisateur.UserManagerSingleton;
import fr.eni.javaee.bo.Article;
import fr.eni.javaee.bo.Utilisateur;
import fr.eni.javaee.dal.tools.DalException;

/**
 * Servlet implementation class ServletVenteRemportee
 */
@WebServlet("/ServletVenteRemportee")
public class ServletVenteRemportee extends HttpServlet {
	private static final long serialVersionUID = 1L;

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

		try {
			Utilisateur util = BLLFactory.getUserManager().getUserById(1);
			request.setAttribute("utilisateur", util);

			System.out.println("utilisateur : " + util);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/VenteRemportee.jsp");
		rd.forward(request, response);

		
		try {
			Article art = BLLFactory.getArticleManager().selectByNoArticle(1);
			request.setAttribute("article", art);
			System.out.println("article : " + art);
		} catch (DalException e) {
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
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/VenteRemportee.jsp");
		rd.forward(request, response);
		
		RequestDispatcher rd1 = request.getRequestDispatcher("/WEB-INF/jsp/VenteRemportee.jsp");
		rd1.forward(request, response);
	}

}
