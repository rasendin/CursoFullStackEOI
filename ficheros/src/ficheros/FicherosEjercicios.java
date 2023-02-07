package ficheros;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FicherosEjercicios {
	
	/**
	 * A partir de un archivo que contiene una palabra en cada línea. Carga las palabras en un array*
	 * y selecciona una al azar. Pide al usuario que la adivine. Tiene 3 intentos.
	 * 
	 * Haz un programa que pregunte al usuario por el nombre de un fichero y muestra su contenido.
	 * Observa que cuando el fichero no existe lanza una excepción. Captúrala e informa de que el
	 * fichero no existe al usuario.
	 */
	
	public static void ejercicio7y5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre del fichero");
		String nombreFichero = sc.nextLine();
		List<String> lineas = FicherosEjemplos.devolverLineasJava8(Paths.get(nombreFichero));
		if(lineas!=null) {	// He podido acceder al fichero
			lineas.forEach(e->System.out.println(e));	// Me muestra todas las líneas de un fichero
			// String[] lineasArray = (String[]) lineas.toArray();	// Me transforma una lista de String en un Array de String
			int elementosLista = lineas.size();	// Número de elementos de la lista
			Random random = new Random();	// Crea un objeto de tipo random para sacar números aleatorios
			int azar = random.nextInt(elementosLista);	// Saca un aleatorio entre 0 y elementosLista-1
			int numeroAzar = new Random().nextInt(lineas.size());
			System.out.println(lineas.get(numeroAzar));	// El método get te coge una posición de una lista
		}
		sc.close();
	}

	public static void main(String[] args) {
		ejercicio7y5();
	}

}
