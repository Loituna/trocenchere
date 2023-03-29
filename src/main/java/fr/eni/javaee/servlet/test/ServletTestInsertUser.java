package fr.eni.javaee.servlet.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.javaee.bll.BusinessException;
import fr.eni.javaee.bo.Utilisateur;
import fr.eni.javaee.dal.UtilisateurDAOJdbcImpl;

/**
 * Servlet implementation class ServletTestDal
 */
@WebServlet("/ServletTestInsertUser")
public class ServletTestInsertUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	
	public ServletTestInsertUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Utilisateur u = new Utilisateur("Dell", "Bpm", "Toto", "azerty@gmail.com", "0685462929", "5 rue mendes",
				"35000", "Rennes", "1234");

		UtilisateurDAOJdbcImpl dao = UtilisateurDAOJdbcImpl.getInstance();
		try {
			dao.creationUtilisateur(u);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
