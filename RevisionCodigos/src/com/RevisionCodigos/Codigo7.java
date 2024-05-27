package com.RevisionCodigos;
//Me Califico Eugenia Perez 4 / 5 
//importamos HashMap
import java.util.HashMap;
//importamos scanner
import java.util.Scanner;

public class Codigo7 {
//agregamos un metodo

	public void codiguito7() {
		//le faltaba System.in
		Scanner s = new Scanner(System.in);
		//cambiamos ca pór capitales y poder usarlo
		//El tipo de dato debe ser String
	    HashMap<String, String> capitales = new HashMap<>();

	    capitales.put("Canadá", "Otawwa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "México DF");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    //Indicamos el segundo parametro
	    capitales.put("El Salvador", "El Salvador");
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	    // es String no Sting
	    String c = "";
	    do {
	    	//es System.out.print no System.in.print
	      System.out.print("Escribe el nombre de un país y te diré su capital: ");
	      //cambiamos .nextDouble por nextLine por que se esta recibiendo un string
	      c = s.nextLine();
	      //es squals no equal
	      if (!c.equals("salir")) {
	    	  //usamos capitales en luegar de ca, ya que asi lo declaramos
	    	  //usamos key
	        if (capitales.containsKey(c)) {
	        	//faltaba el out el sout
	        	//unimos los sytem.out... y usamos get en lugar de put
	          System.out.print("La capital de " + c + " es " + capitales.get(c));
	          //System.out.println(" es " + capitales.put(c));
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + c + "?: ");
	          String ca = s.nextLine();
	          capitales.put(c, ca);
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	      //faltaba cerrar un parentesis´
	      //es while no wile
	    } while (!c.equals("salir"));
	    s.close();
	    }
}
