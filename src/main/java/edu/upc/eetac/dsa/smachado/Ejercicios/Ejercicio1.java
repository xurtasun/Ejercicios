package edu.upc.eetac.dsa.smachado.Ejercicios;
import java.io.*;
/**
 * EJERCICIO 1
 *
 */
public class Ejercicio1
{
    public static void main( String[] args )
    {
    	String fileName = "numeros.txt" ;
    	String line;
    	
    	try {
    		BufferedReader lectura = new BufferedReader( new FileReader( fileName  ) );
    	     
    	    line = lectura.readLine();
    	    while ( line != null )  // while not end of file
    	    {
    	       System.out.println( line );
    	       line = lectura.readLine();
    	    }
    	    lectura.close();
    		
    	}
    	catch( IOException iox )
    		   {
    	     System.out.println("Imposible leer " + fileName );
    		   }
    	
        
    }
}
