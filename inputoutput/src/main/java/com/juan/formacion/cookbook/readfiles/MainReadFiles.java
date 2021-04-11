package com.juan.formacion.cookbook.readfiles;

import java.io.IOException;

public class MainReadFiles {
	
	private static final String INPUT_PATH_FILE = "C:\\cursos\\java\\cookbook_files\\readFileExample.txt";
	private static final String OUTPUT_PATH_FILE = "C:\\cursos\\java\\cookbook_files\\writeFileExample.txt";

	public static void main(String[] args) {

		try {
			ExReadFiles.readFile(INPUT_PATH_FILE);
			
			ExReadFiles.readFileInString(INPUT_PATH_FILE);
			
			ExReadFiles.readFileReadAllLines(INPUT_PATH_FILE);
			
			ExReadFiles.readAllBytes(INPUT_PATH_FILE);
			
			ExReadFiles.readBufferedReader(INPUT_PATH_FILE);
			
			ExReadFiles.readBufferedReader2(INPUT_PATH_FILE);
			
			ExReadFiles.readReplaceWrite(INPUT_PATH_FILE, OUTPUT_PATH_FILE);
		} catch (IOException e) {
			System.out.println("Error en la lectura del archivo");
			e.printStackTrace();
		}

	}

}
