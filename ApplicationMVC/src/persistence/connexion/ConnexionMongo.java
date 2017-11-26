package persistence.connexion;


import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class ConnexionMongo {
	 public static  DB getConexionMongo() {  
		
		MongoClient mongo = new MongoClient("localhost", 27017);
	    	
			DB db = mongo.getDB("ctlv"); 
			
			return db;
		  }  

	 
   
}