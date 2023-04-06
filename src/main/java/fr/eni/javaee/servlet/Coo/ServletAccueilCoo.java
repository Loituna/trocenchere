package fr.eni.javaee.servlet.Coo;

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
import fr.eni.javaee.bo.Enchere;
import fr.eni.javaee.bo.Retrait;
import fr.eni.javaee.bo.Utilisateur;

/**
 * Servlet implementation class ServletAccueuilCoo
 */
@WebServlet("/ServletAccueilCoo")
public class ServletAccueilCoo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SESSION_UTILISATEUR = "utilisateur";
	private static final String SESSION_ARTICLE = "article";
	private static final String SESSION_ENCHERE = "enchere";
	private static final String SESSION_RETRAIT = "retrait";
	private static final String SESSION_VENDEUR = "vendeur";

	private static final String SESSION_ARTICLE2 = "article2";
	private static final String SESSION_ENCHERE2 = "enchere2";
	private static final String SESSION_RETRAIT2 = "retrait2";
	private static final String SESSION_VENDEUR2 = "vendeur2";

	private static final String SESSION_ARTICLE3 = "article3";
	private static final String SESSION_ENCHERE3 = "enchere3";
	private static final String SESSION_RETRAIT3 = "retrait3";
	private static final String SESSION_VENDEUR3 = "vendeur3";

	private static final String SESSION_ARTICLE4 = "article4";
	private static final String SESSION_ENCHERE4 = "enchere4";
	private static final String SESSION_RETRAIT4 = "retrait4";
	private static final String SESSION_VENDEUR4 = "vendeur4";

	private static final String SESSION_ARTICLE5 = "article5";
	private static final String SESSION_ENCHERE5 = "enchere5";
	private static final String SESSION_RETRAIT5 = "retrait5";
	private static final String SESSION_VENDEUR5 = "vendeur5";

	private static final String SESSION_ARTICLE6 = "article6";
	private static final String SESSION_ENCHERE6 = "enchere6";
	private static final String SESSION_RETRAIT6 = "retrait6";
	private static final String SESSION_VENDEUR6 = "vendeur6";
       
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
		HttpSession session = request.getSession();
		Utilisateur utilisateur = new Utilisateur();
		utilisateur = (Utilisateur) session.getAttribute(SESSION_UTILISATEUR);
		request.setAttribute(SESSION_UTILISATEUR, utilisateur);
		
		Article article = new Article();
		Enchere enchere = new Enchere();
		Retrait retrait = new Retrait();
		Utilisateur vendeur = new Utilisateur();

		// TODO à Hydrater avec valeur d'une div lié a larticle
		article.setNoArticle(1);
		
		try {
			// Recuperation de larticle dans la BDD
			article = BLLFactory.getArticleManager().selectByNoArticle(article);
			// Hydratation des valeurs necessaire via l'article recuperer précédement
			enchere.setNoArticle(article.getNoArticle());
			retrait.setNoArticle(article.getNoArticle());
			vendeur.setNoUtilisateur(article.getNoUtilisateur());
			enchere = BLLFactory.getEnchereManager().selectByIdArticle(enchere);
			retrait = BLLFactory.getRetraitManager().GetRetraitByID(retrait);
			BLLFactory.getUserManager().getUserById(vendeur);

		} catch (BusinessException e) {

			e.printStackTrace();
		}
		
		
		
		request.setAttribute(SESSION_ARTICLE, article);
		request.setAttribute(SESSION_ENCHERE, enchere);
		request.setAttribute(SESSION_RETRAIT, retrait);
		request.setAttribute(SESSION_VENDEUR, vendeur);
		
		Article article2 = new Article();
		Enchere enchere2 = new Enchere();
		Retrait retrait2 = new Retrait();
		Utilisateur vendeur2 = new Utilisateur();

		// TODO à Hydrater avec valeur d'une div lié a larticle
		article2.setNoArticle(2);
		
		try {
			// Recuperation de larticle dans la BDD
			article2 = BLLFactory.getArticleManager().selectByNoArticle(article2);
			// Hydratation des valeurs necessaire via l'article recuperer précédement
			enchere2.setNoArticle(article2.getNoArticle());
			retrait2.setNoArticle(article2.getNoArticle());
			vendeur2.setNoUtilisateur(article2.getNoUtilisateur());
			enchere2 = BLLFactory.getEnchereManager().selectByIdArticle(enchere2);
			retrait2 = BLLFactory.getRetraitManager().GetRetraitByID(retrait2);
			BLLFactory.getUserManager().getUserById(vendeur2);

		} catch (BusinessException e) {

			e.printStackTrace();
		}

		request.setAttribute(SESSION_ARTICLE2, article2);
		request.setAttribute(SESSION_ENCHERE2, enchere2);
		request.setAttribute(SESSION_RETRAIT2, retrait2);
		request.setAttribute(SESSION_VENDEUR2, vendeur2);

		Article article3 = new Article();
		Enchere enchere3 = new Enchere();
		Retrait retrait3 = new Retrait();
		Utilisateur vendeur3 = new Utilisateur();

		// TODO à Hydrater avec valeur d'une div lié a larticle
		article3.setNoArticle(3);
		
		try {
			// Recuperation de larticle dans la BDD
			article3 = BLLFactory.getArticleManager().selectByNoArticle(article3);
			// Hydratation des valeurs necessaire via l'article recuperer précédement
			enchere3.setNoArticle(article3.getNoArticle());
			retrait3.setNoArticle(article3.getNoArticle());
			vendeur3.setNoUtilisateur(article3.getNoUtilisateur());
			enchere3 = BLLFactory.getEnchereManager().selectByIdArticle(enchere3);
			retrait3 = BLLFactory.getRetraitManager().GetRetraitByID(retrait3);
			BLLFactory.getUserManager().getUserById(vendeur3);

		} catch (BusinessException e) {

			e.printStackTrace();
		}

		request.setAttribute(SESSION_ARTICLE3, article3);
		request.setAttribute(SESSION_ENCHERE3, enchere3);
		request.setAttribute(SESSION_RETRAIT3, retrait3);
		request.setAttribute(SESSION_VENDEUR3, vendeur3);

		Article article4 = new Article();
		Enchere enchere4 = new Enchere();
		Retrait retrait4 = new Retrait();
		Utilisateur vendeur4 = new Utilisateur();

		// TODO à Hydrater avec valeur d'une div lié a larticle
		article4.setNoArticle(4);

		try {
			// Recuperation de larticle dans la BDD
			article4 = BLLFactory.getArticleManager().selectByNoArticle(article4);
			// Hydratation des valeurs necessaire via l'article recuperer précédement
			enchere4.setNoArticle(article4.getNoArticle());
			retrait4.setNoArticle(article4.getNoArticle());
			vendeur4.setNoUtilisateur(article4.getNoUtilisateur());
			enchere4 = BLLFactory.getEnchereManager().selectByIdArticle(enchere4);
			retrait4 = BLLFactory.getRetraitManager().GetRetraitByID(retrait4);
			BLLFactory.getUserManager().getUserById(vendeur4);

		} catch (BusinessException e) {

			e.printStackTrace();
		}

		request.setAttribute(SESSION_ARTICLE4, article4);
		request.setAttribute(SESSION_ENCHERE4, enchere4);
		request.setAttribute(SESSION_RETRAIT4, retrait4);
		request.setAttribute(SESSION_VENDEUR4, vendeur4);

		Article article5 = new Article();
		Enchere enchere5 = new Enchere();
		Retrait retrait5 = new Retrait();
		Utilisateur vendeur5 = new Utilisateur();

		// TODO à Hydrater avec valeur d'une div lié a larticle
		article5.setNoArticle(5);
	
		try {
			// Recuperation de larticle dans la BDD
			article5 = BLLFactory.getArticleManager().selectByNoArticle(article5);
			// Hydratation des valeurs necessaire via l'article recuperer précédement
			enchere5.setNoArticle(article5.getNoArticle());
			retrait5.setNoArticle(article5.getNoArticle());
			vendeur5.setNoUtilisateur(article5.getNoUtilisateur());
			enchere5 = BLLFactory.getEnchereManager().selectByIdArticle(enchere5);
			retrait5 = BLLFactory.getRetraitManager().GetRetraitByID(retrait5);
			BLLFactory.getUserManager().getUserById(vendeur5);

		} catch (BusinessException e) {

			e.printStackTrace();
		}

		request.setAttribute(SESSION_ARTICLE5, article5);
		request.setAttribute(SESSION_ENCHERE5, enchere5);
		request.setAttribute(SESSION_RETRAIT5, retrait5);
		request.setAttribute(SESSION_VENDEUR5, vendeur5);

		Article article6 = new Article();
		Enchere enchere6 = new Enchere();
		Retrait retrait6 = new Retrait();
		Utilisateur vendeur6 = new Utilisateur();

		// TODO à Hydrater avec valeur d'une div lié a larticle
		article6.setNoArticle(6);
	
		try {
			// Recuperation de larticle dans la BDD
			article6 = BLLFactory.getArticleManager().selectByNoArticle(article6);
			// Hydratation des valeurs necessaire via l'article recuperer précédement
			enchere6.setNoArticle(article6.getNoArticle());
			retrait6.setNoArticle(article6.getNoArticle());
			vendeur6.setNoUtilisateur(article6.getNoUtilisateur());
			enchere6 = BLLFactory.getEnchereManager().selectByIdArticle(enchere6);
			retrait6 = BLLFactory.getRetraitManager().GetRetraitByID(retrait6);
			BLLFactory.getUserManager().getUserById(vendeur6);

		} catch (BusinessException e) {

			e.printStackTrace();
		}

		request.setAttribute(SESSION_ARTICLE6, article6);
		request.setAttribute(SESSION_ENCHERE6, enchere6);
		request.setAttribute(SESSION_RETRAIT6, retrait6);
		request.setAttribute(SESSION_VENDEUR6, vendeur6);
		
		
		
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
