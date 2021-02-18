package com.juan.formacion.ud3.exer3;

import java.util.Scanner;

public class MinutesMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Introduzca el número de segundos (-1 para salir)");
			int numberSeconds = sc.nextInt();
			if(numberSeconds == -1) {
				break;
			}
			sc.nextLine();
			calculateTime(numberSeconds);
		}

	}
	
	private static void calculateTime(int numberSeconds) {
		int hour = 0;
		int minutes = 0;
		int seconds = 0;
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("" + numberSeconds + "segundos, equivalen a ");
		if(numberSeconds > 0) {
			seconds = numberSeconds%60;
			minutes = ((int)(numberSeconds/60))%60;
			hour = (int)((numberSeconds/60)/60);
		}
		if(hour > 0) {
			sBuilder.append(hour + " horas; ");
		}
		sBuilder.append(minutes + " minutos; ");
		sBuilder.append(seconds + " segundos.");
		System.out.println(sBuilder);
	}

}
