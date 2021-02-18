package com.juan.formacion.ud.global.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArchivoUtils {
	
	public static void crearArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter pWriter = new PrintWriter(archivo);
			pWriter.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void escribirEnArchivo(String nombreArchivo, String contenido) {
		File archivo = new File(nombreArchivo);
		try(PrintWriter pWriter = new PrintWriter(new FileWriter(archivo))){
			if(contenido != null)
				pWriter.println(contenido);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void agregarAArchivo(String nombreArchivo, String contenido) {
		File archivo = new File(nombreArchivo);
		try(PrintWriter pWriter = new PrintWriter(new FileWriter(archivo, true))){
			if(contenido != null) {
				pWriter.println(contenido);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void leerArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try(BufferedReader bReader = new BufferedReader(new FileReader(archivo))){
			String contenido = bReader.readLine();
			while(contenido != null) {
				System.out.println("Lectura: " + contenido);
				contenido = bReader.readLine();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
