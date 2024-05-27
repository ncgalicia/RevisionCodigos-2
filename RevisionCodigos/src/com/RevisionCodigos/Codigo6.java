package com.RevisionCodigos;
//Me Califico Eugenia Perez 4 / 5 
public class Codigo6 {
//agreagamos un metoddo
	public void codiguito6() {
	
			 //le faltaba el nuw 
		    int[] n = new int[20];
		    //faltaba un +
		    for (int i = 0; i < 20; i++) {
		      n[i] = (int)(Math.random() * 381) + 20;
		      //faltaba out
		      System.out.print(n[i] + " ");
		    }
		    
		    //lo cambie a print ya que el \n sirve para el salto de linea
		    System.out.print("\n¿Qué números quiere resaltar? ");
		    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		    //faltaba cerrar el parentesis
		    int opcion = Integer.parseInt(System.console().readLine());
		    //estaban invertidos lo simbolos de : y ? 
		    int multiplo = (opcion == 1) ? 5 : 7;

		    //cambiamos char por int 
		    //el foreach no es valido en java
		    for (int e : n) {
	            if (e % multiplo == 0) {
	                System.out.print("[" + e + "] ");
	             //faltaba cerrar el if }
	            } else {
	            	//es out en lugar de in
	                System.out.print(e + " ");
	            }
	        }
		  
		
	}
}
