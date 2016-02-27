package mongoDB;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class Main {


	public static void main(String[] args) {
		// Connect to a MongoDB instance running on the localhost on the default port 27017:
		MongoClient mongoClient = new MongoClient();
		
		// Access the test database:
		MongoDatabase db = mongoClient.getDatabase("test");
		
		// Call the manager for data transactions
		RestaurantManager.insertOne(db);
		
		// Close the connection
		mongoClient.close();


	}

}