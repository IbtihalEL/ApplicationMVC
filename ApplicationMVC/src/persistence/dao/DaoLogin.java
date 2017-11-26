package persistence.dao;


import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;


import persistence.connexion.ConnexionMongo;

public class DaoLogin {
	private ConnexionMongo cnx;
	private DB db;
public DaoLogin() {
		super();
		cnx= new ConnexionMongo();
		db= cnx.getConexionMongo();
	}
public int checkUtilisateur (String user , String pass){
	
		DBCollection collection = db.getCollection("users");
		BasicDBObject search = new BasicDBObject();
		search.put("username", user);
		search.put("password", pass);
		DBCursor cursor1 = collection.find(search);
		int res = cursor1.count();
		return res;
		
	}



}
