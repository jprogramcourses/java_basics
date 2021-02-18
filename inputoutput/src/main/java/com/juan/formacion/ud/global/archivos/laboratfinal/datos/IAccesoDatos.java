package com.juan.formacion.ud.global.archivos.laboratfinal.datos;

import java.util.List;

import com.juan.formacion.ud.global.archivos.laboratfinal.excepciones.*;
import com.juan.formacion.ud.global.archivos.laboratfinal.model.Pelicula;

public interface IAccesoDatos {
	
	public boolean existe(String nombreArchivo) throws AccesoDatosEx;
	
	public List<Pelicula> listar(String nombre) throws LecturaDatosEx;
	
	public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;

	public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;
	
	public void crear(String nombreArchivo) throws AccesoDatosEx;
	
	public void borrar(String nombreArchivo) throws AccesoDatosEx;
}
