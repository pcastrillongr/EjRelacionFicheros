import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
	
	public static void main(String[]args)
	{
		/** 
		 * 1.- Escribe un programa que escriba los 100 
		 * primeros números naturales en un archivo numNaturales.txt.
		 */
		
		try {
			//Creamos el fichero
			FileWriter fichero=new FileWriter("100numeros.txt");
			
			//Escribimos en el fichero
			
			int contador=0;
			
			while(contador<100)
			{
				contador++;
				fichero.write(contador+ "\n");
			}
			
			fichero.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
