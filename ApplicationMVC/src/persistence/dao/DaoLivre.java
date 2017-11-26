package persistence.dao;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;

import metier.manager.bean.Livre;
import persistence.connexion.ConnexionMongo;

public class DaoLivre {
	
	private ConnexionMongo cnx;
	private DB db;
	public DaoLivre() {
		super();
		cnx= new ConnexionMongo();
		db= cnx.getConexionMongo();
	}
	public List<Livre> lister() {
	
		
		List<Livre> livre = new ArrayList<Livre>();
		DBCollection table = db.getCollection("livres");
		List<DBObject> cursor = table.find().toArray();
		for(int i=0;i<cursor.size();i++){
		Livre liv = new Livre();
		
		liv.setTitre((String)cursor.get(i).get("titre"));
		liv.setDomaine((String)cursor.get(i).get("domaine"));
		liv.setNombreExemplaire((int) cursor.get(i).get("nombreExemplaire"));
		liv.setPrix((int) cursor.get(i).get("prix"));
		livre.add(liv);
		}
		
		
	
		return livre;
	}
	
	
	
public void ajouterLivre(String titre,String domaine,int nombreExemplaire,int prix){
		
		
		
		 
		
		DBCollection livres=db.getCollection("livres"); 
		
		DBObject Object = new BasicDBObject();
		Object.put("titre", titre);
		Object.put("domaine", domaine);
		Object.put("nombreExemplaire",nombreExemplaire);
		Object.put("prix",prix);
		
		
		
		livres.insert(Object);
		}


	}
