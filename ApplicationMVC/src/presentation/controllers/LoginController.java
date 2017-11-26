package presentation.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.manager.ManagerConnexion;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ManagerConnexion manager;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		this.getServletContext().getRequestDispatcher("/WEB-INF/classes/presentation/views/loginPage.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		manager=new ManagerConnexion();
		
		int exist = manager.recupererUtilisateur(request.getParameter("username"),request.getParameter("password"));
		
		System.out.println("controlleruser"+exist);
		
						
		if(exist==0){
			
			
			request.setAttribute("erreur", "Username or password incorrect");
			this.getServletContext().getRequestDispatcher("/WEB-INF/classes/presentation/views/loginPage.jsp").forward(request, response);
		
		}	
		
		else {
			request.setAttribute("livre", manager.listerLivre());
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/classes/presentation/views/livre.jsp").forward(request, response);
					}
		
		
	
	}

}
