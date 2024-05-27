package com.RevisionCodigos;

//Importamos Scanner

import java.util.Scanner;
//Me Califico Eugenia Perez 4 / 5 
public class Codigo5 {
//Agregamos un metodo
	public void codiguito5() {
		// agregamos System.in
		Scanner s = new Scanner(System.in);
		// Agregamos comillas dobles en lugar de comilla simple
		System.out.print("Introduzca un numero:");
		// int en lugar de string
		int ni = s.nextInt();
		int c = ni;

		int afo = 0;
		int noAfo = 0;
		
		

		while (ni > 0) {
			int digito = (int) (ni % 10);
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
			} else {
				noAfo++;

				
				
			}
			
			ni /= 10;
		}//cerramos el while para que no se cicle
		//cerramos close
		 s.close();
			if (afo > noAfo) {
				System.out.println("El " + c + " es un número afortunado.");
			} else {
				System.out.println("El " + c + " no es un número afortunado.");
			}
			
		}
	}


