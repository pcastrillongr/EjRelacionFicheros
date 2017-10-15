import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

	
		/**
		 * 6.- Escribir un método que reciba por
		 *  parámetro un nombre de archivo para
		 *   dejar sus líneas ordenadas alfabéticamente
		 *    (no distinguir minúsculas de mayúsculas a la hora de ordenar).
		 * 
		 */
		
		File manolo=new File("/Users/cristinavilas/Desktop/Ficherej6.txt");
		ordenamefichero(manolo);

	}

	private static void ordenamefichero(File manolo) {
		
		Scanner sc;
		
		int contador = 0;
		try {
			sc = new Scanner(manolo);
			while(sc.hasNextLine())
			{	
				contador++;
			}
			String[]ficherillo=new String[contador];
			
			for(int i=0;i<ficherillo.length;i++)
			{
				ficherillo[i]=sc.nextLine();
				System.out.println(ficherillo[i]);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
