package com.juan.formacion.ud3.exer2;

import java.util.Scanner;

public class CelsiusToFarMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			mostrarMenu();
			String selection = sc.next();
			switch(selection) {
			case "0":
				return;
			case "1":
				convertCelsiusToFahr(sc);
				break;
			case "2":
				convertFahrToCelsius(sc);
				break;
			default:
				mostrarMenu();
			}
		}
		
	}
	
	private static void mostrarMenu() {
		System.out.println("Seleccione la conversión [0-1-2]");
		System.out.println("1. Celsius to Fahrenheit");
		System.out.println("2. Fahrenheit to Celsius");
		System.out.println("0. Salir");
	}
	
	private static void convertCelsiusToFahr(Scanner sc) {
		System.out.println("Introduzca la temperatura");
		Double temperature = sc.nextDouble();
		System.out.println("Temperatura introducida: " + temperature);
		Double tempFahr = (temperature * 9)/5 + 32;
		System.out.println("Temperatura en grados Fahrenheit: " + tempFahr);
	}
	
	private static void convertFahrToCelsius(Scanner sc) {
		System.out.println("Introduzca la temperatura");
		Double temperature = sc.nextDouble();
		System.out.println("Temperatura introducida: "+ temperature);
		Double tempCelsius = (temperature -32)*(5/9);
	}

}
