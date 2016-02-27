package mongoDB;

import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;

public class JsonConverter {

	public JsonConverter() {
		
	}


	public static void main(String[] args) {

		Restaurant obj = new Restaurant();
		Gson gson = new Gson();

		// convert java object to JSON format,
		// and returned as JSON formatted string
		String json = gson.toJson(obj);

		try {
			//write converted json data to a file named "file.json"
			FileWriter writer = new FileWriter("restaurant.json");
			writer.write(json);
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(json);

	    }


}
