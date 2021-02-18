package json.jackson;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MainJsonJackson {

	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		
		String jsonInput = "{\"id\":0,\"firstname\":\"Robin\",\"lastName\":\"Wilson\"}";
		
		Person q = mapper.readValue(jsonInput, Person.class);
		
		System.out.println("Read and parsed Person from JSON: " + q);

		Person p = new Person("Roger", "Rabbit");
		System.out.println("Person object " + p + " as JSON = ");
		mapper.writeValue(System.out, p);
	}

}
