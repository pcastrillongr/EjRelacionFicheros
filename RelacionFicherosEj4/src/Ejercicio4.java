import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		/**
		 * 4.- Escribir un método que reciba por parámetro
		 *  el nombre de un archivo e imprima las cadenas 
		 *  que dicho archivo almacena (una cadena por línea). 
		 *  Se tendrá en cuenta que las distintas cadenas se 
		 *  separan en el archivo por un asterisco (que no se imprimirá)
		 *  
		 */
		
		File fichero=new File("/Users/cristinavilas/Desktop/FicheroEj4.txt");
		try {
			Scanner sc=new Scanner(fichero);
			leerfichero(fichero);
			sc.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void leerfichero(File fichero) {
		
		String manolo ="";
		
		try {
			Scanner sc=new Scanner(fichero);
			while(sc.hasNextLine())
			{
				
				manolo+=sc.nextLine();
				
			}
			StringTokenizer st=new StringTokenizer(manolo,"*");
			
			
			while(st.hasMoreTokens())
			{
				
				System.out.println(st.nextToken().trim()+"\n");
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
