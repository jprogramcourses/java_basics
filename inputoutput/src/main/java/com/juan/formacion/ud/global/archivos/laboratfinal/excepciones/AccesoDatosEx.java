package com.juan.formacion.ud.global.archivos.laboratfinal.excepciones;

public class AccesoDatosEx extends Exception {
	
	String mensaje;

	public AccesoDatosEx(String mensaje) {
		this.mensaje = mensaje;
	}

}
