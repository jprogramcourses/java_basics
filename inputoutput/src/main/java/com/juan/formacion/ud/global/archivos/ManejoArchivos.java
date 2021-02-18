package com.juan.formacion.ud.global.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManejoArchivos {

	public static void main(String[] args) {

		File archivo = new File("C:\\cursos\\java\\udm_global\\archivos\\manejo_archivos.txt");

		try(PrintWriter pWriter = new PrintWriter(new FileWriter(archivo))) {
			pWriter.write("Hola");
			pWriter.write("¿Cómo estás?");
			pWriter.write("\n");
			pWriter.write("Texto en la siguiente línea");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		leerArchivo("manejo_archivos.txt");
		
		agregarInformacionArchivo("manejo_archivos.txt");
		
		leerArchivo("manejo_archivos.txt");
	}
	
	private static void leerArchivo(String archivo) {
		File arch = new File("C:\\cursos\\java\\udm_global\\archivos\\".concat(archivo));
		try(BufferedReader br = new BufferedReader(new FileReader(arch))){
			String lectura;
			lectura = br.readLine();
			while(lectura != null) {
				System.out.println("Lectura: " + lectura);
				lectura = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void agregarInformacionArchivo(String archivo) {
		File arch = new File("C:\\cursos\\java\\udm_global\\archivos\\".concat(archivo));
		try(PrintWriter pWriter = new PrintWriter(new FileWriter(arch, true))){
			String masInformacion = "Esta línea se añade tras realizar la lectura del archivo inicial";
			pWriter.println();
			pWriter.println(masInformacion);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
