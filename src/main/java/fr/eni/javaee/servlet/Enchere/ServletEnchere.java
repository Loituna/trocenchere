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
import fr.eni.javaee.bo.Enchere;
import fr.eni.javaee.bo.Utilisateur;

/**
 * Servlet implementation class ServletEnchere
 */
@WebServlet("/ServletEnchere")
public class ServletEnchere extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SESSION_UTILISATEUR = "utilisateur";
	private static final String SESSION_ARTICLE = "article";
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletEnchere() {
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
			Article art = BLLFactory.getArticleManager().selectByNoArticle(1);
			System.out.println(SESSION_ARTICLE + art);
			request.setAttribute(SESSION_ARTICLE, art);
			//try {

				//request.setAttribute("utilisateur", BLLFactory.getUserManager().getUserById(art.getNoUtilisateur()));
		//	} catch (BusinessException e) {
//				System.out.println("erreur servlet getByIdUtilisateur");
//				e.printStackTrace();
//			}
		} catch (BusinessException e) {
			System.out.println("erreur servlet selecte idArticle");
			e.printStackTrace();
		}
		
		//Enchere enchere = BLLFactory.getEnchereManager().

		RequestDispatcher rd1 = request.getRequestDispatcher("/WEB-INF/jsp/enchere.jsp");
		rd1.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();		
		Utilisateur utilisateur = (Utilisateur) session.getAttribute(SESSION_UTILISATEUR);
		Article article = (Article) session.getAttribute(SESSION_ARTICLE);
		request.setAttribute(SESSION_UTILISATEUR, utilisateur);
		request.setAttribute(SESSION_ARTICLE, article);
		
		Enchere enchere = new Enchere();
		System.out.println("Insertion d'une enchère");
		System.out.println(enchere + " enchere servlet VIDE");

		
		
		enchere.setDatedebutEnchere(LocalDateTime.now());
		
		enchere.setMontant(Integer.parseInt(request.getParameter("newPrix")));
		System.out.println(enchere + " enchere servlet PRIX");
		enchere.setNoUtilisateur(utilisateur.getNoUtilisateur());
		System.out.println(enchere + " enchere servlet no_Util");
	//	enchere.setNoArticle(Integer.parseInt(request.getParameter("")));
		enchere.setNoArticle(1);
		System.out.println(enchere + " enchere servlet no_article");
		try {
			BLLFactory.getEnchereManager().updateEnchere(enchere);
	
		} catch (BusinessException e) {
			System.out.println("Erreur creation enchere Servlet");
			e.printStackTrace();
		}

		doGet(request, response);
	}

}
