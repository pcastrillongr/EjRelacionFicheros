import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio5 {


		public static void main(String[] args) {
		
			/**
			 * 3.- Escribir un método que reciba un array de
			 *  cadenas de caracteres y vuelque su contenido
			 *   a un archivo cuyo nombre también se recibirá 
			 *   por parámetro. Las cadenas quedarán
			 *    separadas en el archivo por un asterisco.
			 */
			
			String[]cadena=new String[]{"Hola","como","estas","caraculo"};
			try {
				FileWriter fichero=new FileWriter("FicheroCadena2.txt");
				metodofichero(cadena,fichero);
				fichero.close();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		private static void metodofichero(String[] cadena, FileWriter fichero) {
			
			
			for(String c:cadena)
			{
				try {
					fichero.write(c);
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
}