package mongoDB;

import org.bson.Document;

import com.google.gson.Gson;
import com.mongodb.Block;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;


import static java.util.Arrays.asList;

import static com.mongodb.client.model.Filters.eq;

public class RestaurantManager {

	public RestaurantManager() {
		
	}
	
	public static void insertRestaurant(MongoDatabase db, Restaurant obj){ 
		Gson gson = new Gson();

		// convert java object to JSON format,
		// and returned as JSON formatted string
		String json = gson.toJson(obj);
		Document doc = Document.parse(json);
		db.getCollection("restaurants").insertOne(doc);
	}
	
	public static void showAllRestaurants(MongoDatabase db){
		FindIterable<Document> iterable = db.getCollection("restaurants").find();
		iterable.forEach(new Block<Document>() {
		    @Override
		    public void apply(final Document document) {
		        System.out.println(document);
		    }
		});
		
	}
	
	public static void findRestaurantByName(MongoDatabase db, String name){
		
		FindIterable<Document> iterable = db.getCollection("restaurants").find(eq("name", name));
		for (Document doc:  iterable ) {
			System.out.println(doc);
		}
	}
	
	
	
	public static void insertOne(MongoDatabase db){ 
	DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
	try {
		db.getCollection("restaurants").insertOne(
		        new Document("address",
		                new Document()
		                        .append("street", "2 Avenue")
		                        .append("zipcode", "10075")
		                        .append("building", "1480")
		                        .append("coord", asList(-73.9557413, 40.7720266)))
		                .append("borough", "Manhattan")
		                .append("cuisine", "Italian")
		                .append("grades", asList(
		                        new Document()
		                                .append("date", format.parse("2014-10-01T00:00:00Z"))
		                                .append("grade", "A")
		                                .append("score", 11),
		                        new Document()
		                                .append("date", format.parse("2014-01-16T00:00:00Z"))
		                                .append("grade", "B")
		                                .append("score", 17)))
		                .append("name", "Vella")
		                .append("restaurant_id", "41704620"));
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
