package inputoutput.exerc_10_2_readfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesUtils {

    public static void filesLines(String pathFile) {
	try {
	    Files.lines(Path.of(pathFile)).forEach(System.out::println);
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

}
