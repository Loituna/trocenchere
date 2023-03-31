package fr.eni.javaee.servlet;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.javaee.bll.BusinessException;
import fr.eni.javaee.bo.Article;
import fr.eni.javaee.bo.Retrait;
import fr.eni.javaee.dal.DAOFactory;

/**
 * Servlet implementation class ServletVenteArticle
 */
@WebServlet("/ServletVenteArticle")
public class ServletVenteArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletVenteArticle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/VenteArticle.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		Article creation = new Article();
		Retrait retraitcreation = new Retrait();
		
		creation.setNomArticle(request.getParameter("nomArticle"));
		creation.setDescription(request.getParameter("descriptionArticle"));
		creation.setDateDebutEnchere(LocalDateTime.parse(request.getParameter("DebutEnchere")));
		creation.setDateFinEnchere(LocalDateTime.parse(request.getParameter("FinEnchere")));
		creation.setPrixInitial(Integer.parseInt(request.getParameter("credit")));
		retraitcreation.setRue(request.getParameter("rueRetrait"));
		retraitcreation.setVille(request.getParameter("VilleRetrait"));
		retraitcreation.setCodePostal(request.getParameter("CPRetrait"));
		
		
		try {
			DAOFactory.getArticleDao().insertArticle(creation);
		} catch (BusinessException e) {
			request.setAttribute("Erreur", "PATATE");
			System.out.println("PATATE");
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/accueilConnecte.jsp");
		rd.forward(request, response);	
	}

}
