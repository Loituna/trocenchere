package fr.eni.javaee.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.javaee.bll.BusinessException;
import fr.eni.javaee.bll.UserManagerSingleton;
import fr.eni.javaee.bo.Utilisateur;

/**
 * Servlet implementation class ServletSuppProfil
 */
@WebServlet("/ServletModifProfil")
public class ServletModifProfil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletModifProfil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//TODO récupérer l'utilsateur dans la session
		
		Utilisateur util;
		try {
			util = UserManagerSingleton.getInstance().getUserById(1);
			request.setAttribute("utilisateur", util);
			System.out.println("utilisateur : " + util);
			
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/modifProfil.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		if ((request.getParameter("MDP")).equals(request.getParameter("MDPconfirm"))) {
		
			Utilisateur util = new Utilisateur();
			
			util.setPseudo(request.getParameter("pseudo"));
			util.setNom(request.getParameter("nom"));
			util.setPrenom(request.getParameter("prenom"));
			util.setEmail(request.getParameter("email"));
			util.setTelephone(request.getParameter("telephone"));
			util.setRue(request.getParameter("rue"));
			util.setCP(request.getParameter("cp"));
			util.setVille(request.getParameter("ville"));
			util.setMdp(request.getParameter("MDP"));
			util.setNoUtilisateur(Integer.parseInt(request.getParameter("identifiant")));
			
			try {
				UserManagerSingleton.getInstance().modificationUtilisateur(util);
			} catch (BusinessException e) {
				request.setAttribute("Erreur", "Pas de modification");
				System.out.println("Erreur, Pas de modification");
				e.printStackTrace();
			}
		}else {
			//erreur à gérer !!!

			request.setAttribute("Erreur", "mauvaise confirmation du mot de passe");
			//mot de passe pas bon
		}
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/afficherUtilisateur.jsp");
		rd.forward(request, response);	
		
	}

}
