package metier.manager;

import persistence.dao.DaoLivre;
import persistence.dao.DaoLogin;

import java.util.List;

import metier.manager.bean.Livre;;


public class ManagerConnexion {
	private DaoLogin login;
	private DaoLivre livre;
	
	public ManagerConnexion() {
		super();
		 login = new DaoLogin();
		 livre = new DaoLivre();
		
	}

	public int recupererUtilisateur(String user , String pass){
	  
	  int check=login.checkUtilisateur(user, pass);
	 
	  return check;
	  
	}
	public List<Livre> listerLivre(){
		
		return livre.lister();
	}
	
	public void ajouterLivre(String titre,String domaine,int nombreExemplaire,int prix)
	{
		livre.ajouterLivre(titre, domaine, nombreExemplaire, prix);
	}
	}
