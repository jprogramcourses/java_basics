package com.juan.formacion.ud.global.archivos.laboratfinal.negocio;

import com.juan.formacion.ud.global.archivos.laboratfinal.datos.AccesoDatosImpl;
import com.juan.formacion.ud.global.archivos.laboratfinal.datos.IAccesoDatos;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {
	
	private IAccesoDatos accesoDatos = null;
	
	public CatalogoPeliculasImpl() {
		accesoDatos = new AccesoDatosImpl(); 
	}

	@Override
	public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
		

	}

	@Override
	public void listarPeliculas(String nombreArchivo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void buscarPelicula(String nombreArchivo, String nombrePelicula) {
		// TODO Auto-generated method stub

	}

	@Override
	public void iniciarArchivo(String nombreArchivo) {
		// TODO Auto-generated method stub

	}

}
