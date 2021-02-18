package json.jackson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileUtil {
	
	private static final String PATH = "./files";
	private static final String FILE_NAME = "jsonfile.txt";
	
	public static void createFileJson() {
		File newJsonFile = new File(FILE_NAME);
		
		try(BufferedWriter bfw = new BufferedWriter(new FileWriter(newJsonFile))){
			bfw.append("hola");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
