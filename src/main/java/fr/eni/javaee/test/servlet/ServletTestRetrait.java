package fr.eni.javaee.test.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.javaee.bll.BusinessException;
import fr.eni.javaee.bo.Retrait;
import fr.eni.javaee.dal.DAOFactory;

/**
 * Servlet implementation class ServletTestRetrait
 */
@WebServlet("/ServletTestRetrait")
public class ServletTestRetrait extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTestRetrait() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		Retrait RRRrrr = new Retrait("5 rue de la retraite", "35000", "Rennes");
		
		try {
			DAOFactory.getRetraitDao().insert(RRRrrr);
			
		}catch(BusinessException e) {
			e.printStackTrace();
		}
		
		System.out.println(RRRrrr);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}