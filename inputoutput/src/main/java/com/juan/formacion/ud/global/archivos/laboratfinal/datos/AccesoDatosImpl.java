package com.juan.formacion.ud.global.archivos.laboratfinal.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.juan.formacion.ud.global.archivos.laboratfinal.excepciones.AccesoDatosEx;
import com.juan.formacion.ud.global.archivos.laboratfinal.excepciones.EscrituraDatosEx;
import com.juan.formacion.ud.global.archivos.laboratfinal.excepciones.LecturaDatosEx;
import com.juan.formacion.ud.global.archivos.laboratfinal.model.Pelicula;

public class AccesoDatosImpl implements IAccesoDatos {

	@Override
	public boolean existe(String nombreArchivo) throws AccesoDatosEx {
		File archivo = new File(nombreArchivo);
		return archivo.exists();
	}

	@Override
	public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
		File archivo = new File(nombreArchivo);
		List<Pelicula> lista = new ArrayList<>();
		try(BufferedReader bReader = new BufferedReader(new FileReader(archivo))){
			String linea = bReader.readLine();
			while(linea != null) {
				Pelicula pelicula = new Pelicula(linea);
				lista.add(pelicula);
				linea = bReader.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
		File archivo = new File(nombreArchivo);
		try(PrintWriter pWriter = new PrintWriter(new FileWriter(archivo, anexar))){
			pWriter.println(pelicula.getNombre());
			System.out.println("Se ha escrito correctamente el archivo	");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
		File archivo = new File(nombreArchivo);
		String resultado = null;
		try {
			BufferedReader bReader = new BufferedReader(new FileReader(archivo));
			String linea = null;
			int i = 0;
			linea = bReader.readLine();
			while(linea != null) {
				if(buscar != null && buscar.equalsIgnoreCase(linea)) {
					resultado = "Pelicula ".concat(buscar).concat(" encontrada en índice " + i);
					break;
				}else {
					i++;
					linea = bReader.readLine();
				}
			}
			bReader.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	@Override
	public void crear(String nombreArchivo) throws AccesoDatosEx {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter pWriter = new PrintWriter(new FileWriter(archivo));
			pWriter.close();
			System.out.println("Se ha creado el archivo correctamente");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void borrar(String nombreArchivo) throws AccesoDatosEx {
		File archivo = new File(nombreArchivo);
		archivo.delete();
		System.out.println("El archivo se ha borrado correctamente");
	}

	

}
