package fr.eni.javaee.servlet.Coo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.javaee.bll.BLLFactory;
import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bo.Article;
import fr.eni.javaee.bo.Enchere;

/**
 * Servlet implementation class ServletAccueuilCoo
 */
@WebServlet("/ServletAccueilCoo")
public class ServletAccueilCoo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SESSION_ARTICLE = "article";
	private static final String SESSION_ENCHERE = "enchere";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAccueilCoo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Article article = new Article();
		article.setNoArticle(3);
		request.setAttribute(SESSION_ARTICLE, article);
		try {
			
			article = BLLFactory.getArticleManager().selectByNoArticle(article);
		
		} catch (BusinessException e) {
			System.out.println("erreur article dans servlet accueil design");
			e.printStackTrace();
		}
		
		//Session enchere
		
		Enchere enchere = new Enchere();
		enchere.setNoEnchere(1);
		enchere.setNoArticle(article.getNoArticle());
		System.out.println(enchere+ "Servlet");
		request.setAttribute(SESSION_ENCHERE, enchere);
		 try {
			enchere = BLLFactory.getEnchereManager().selectByIdArticle(enchere);
		} catch (BusinessException e) {
			System.out.println(enchere);
			System.out.println("Echec get by ID servlet");
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/accueilConnecte.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
