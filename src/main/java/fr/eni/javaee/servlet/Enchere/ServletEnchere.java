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
import fr.eni.javaee.bo.Retrait;
import fr.eni.javaee.bo.Utilisateur;

/**
 * Servlet implementation class ServletEnchere
 */
@WebServlet("/ServletEnchere")
public class ServletEnchere extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	private static final String SESSION_UTILISATEUR = "utilisateur";
	private static final String SESSION_ARTICLE = "article";
	private static final String SESSION_ENCHERE = "enchere";
	private static final String SESSION_RETRAIT = "retrait";
	private static final String SESSION_VENDEUR = "vendeur";
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
		//Recuperation Session
		Utilisateur utilisateur = new Utilisateur();
		utilisateur = (Utilisateur) session.getAttribute(SESSION_UTILISATEUR);	
		//Creation Article A Afficher
		Article article = new Article() ;
		Enchere enchere = new Enchere();
		Retrait retrait = new Retrait();
		Utilisateur vendeur = new Utilisateur();			
		
		// TODO à Hydrater avec valeur d'une div lié a larticle
		article.setNoArticle(1);
		System.out.println(SESSION_ARTICLE + article + "Servlet");	
		try {		
			//Recuperation de larticle dans la BDD
			article = BLLFactory.getArticleManager().selectByNoArticle(article);
			//Hydratation des valeurs necessaire via l'article recuperer précédement
			enchere.setNoArticle(article.getNoArticle());
			retrait.setNoArticle(article.getNoArticle());
			vendeur.setNoUtilisateur(article.getNoUtilisateur());
			enchere = BLLFactory.getEnchereManager().selectByIdArticle(enchere);
			retrait = BLLFactory.getRetraitManager().GetRetraitByID(retrait);
			BLLFactory.getUserManager().getUserById(vendeur);
	
		} catch (BusinessException e) {
			
			e.printStackTrace();
		}	
		
		//Hydratation de la requete avec les objet recuperer , celle ci les donnera a la JSP
		request.setAttribute(SESSION_ARTICLE, article);		
		request.setAttribute(SESSION_UTILISATEUR, utilisateur);
		request.setAttribute(SESSION_ENCHERE, enchere);
		request.setAttribute(SESSION_RETRAIT, retrait);
		request.setAttribute(SESSION_VENDEUR, vendeur);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/enchere.jsp");	
		rd.forward(request, response);
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
