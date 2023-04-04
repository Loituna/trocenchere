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
import fr.eni.javaee.bo.Article;
import fr.eni.javaee.dal.tools.DalException;

/**
 * Servlet implementation class ServletEnchere
 */
@WebServlet("/ServletEnchere")
public class ServletEnchere extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEnchere() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Article art = BLLFactory.getArticleManager().selectByNoArticle(3);
			System.out.println("article : " + art);
			request.setAttribute("article", art);
			try {
		
				request.setAttribute("utilisateur", BLLFactory.getUserManager().getUserById(art.getNoUtilisateur()));
			} catch (BusinessException e) {
				System.out.println("erreur servlet getByIdUtilisateur");
				e.printStackTrace();
			}
			} catch (BusinessException e) {
				System.out.println("erreur servlet selecte idArticle");
				e.printStackTrace();
			}
		
		RequestDispatcher rd1 = request.getRequestDispatcher("/WEB-INF/jsp/enchere.jsp");
		rd1.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
