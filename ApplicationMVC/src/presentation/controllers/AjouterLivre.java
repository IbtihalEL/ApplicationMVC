package presentation.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.manager.ManagerConnexion;

/**
 * Servlet implementation class AjouterLivre
 */
@WebServlet("/AjouterLivre")
public class AjouterLivre extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ManagerConnexion manager;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterLivre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/classes/presentation/views/livrable.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.getParameter("ajouterLivre")!=null){
 this.getServletContext().getRequestDispatcher("/WEB-INF/classes/presentation/views/livrable.jsp").forward(request, response);
		
		}else if(request.getParameter("ajouter")!=null) {
		manager=new ManagerConnexion();
		String titre = request.getParameter("titre");
		String domaine = request.getParameter("domaine");
		int nombreExemplaire = Integer.parseInt(request.getParameter("nombreExemplaire"));
		int prix = Integer.parseInt(request.getParameter("prix"));
		
		
		manager.ajouterLivre(titre, domaine, nombreExemplaire, prix);
		request.setAttribute("livre", manager.listerLivre());
		this.getServletContext().getRequestDispatcher("/WEB-INF/classes/presentation/views/livre.jsp").forward(request, response);

       }
		}
	}


