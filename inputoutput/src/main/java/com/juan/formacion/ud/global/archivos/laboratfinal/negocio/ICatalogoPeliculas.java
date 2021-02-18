package com.juan.formacion.ud.global.archivos.laboratfinal.negocio;

public interface ICatalogoPeliculas {
	
	public void agregarPelicula(String nombrePelicula, String nombreArchivo);
	
	public void listarPeliculas(String nombreArchivo);
	
	public void buscarPelicula(String nombreArchivo, String nombrePelicula);
	
	public void iniciarArchivo(String nombreArchivo);

}
