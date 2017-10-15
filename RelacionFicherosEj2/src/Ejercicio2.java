import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio2 {

	public static void main(String[] args) {
		/**
		 *  Escribe un programa que reciba el nombre de un archivo 
		 *  que almacena una serie de cantidades enteras positivas 
		 *  e imprima su suma.
		 */
		
		String manolo = null;
		int suma=0;
		try {
			File numero=new File("/Users/cristinavilas/Desktop/numero.txt");
			Scanner sc=new Scanner(numero);
			while(sc.hasNextLine())
			{
				 manolo=sc.nextLine();
			}
			
			StringTokenizer st=new StringTokenizer(manolo,",");
			
			while(st.hasMoreTokens())
			{
				suma+=Integer.parseInt(st.nextToken());
				
				
				
			}
			System.out.println("La suma de los numero del fichero es:"+suma);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
