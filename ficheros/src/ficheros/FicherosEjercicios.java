package ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FicherosEjercicios {
	
	/**
	 * Crea un programa que vaya leyendo lo que el usuario escribe en consola y lo escriba en un
	 * fichero (línea a línea). Terminará cuando el usuario escriba la palabra ‘FIN’.
	 * @param nombre
	 */
	
	public static void ejercicio2(String nombreFichero) {
		Scanner sc = new Scanner(System.in);
		String linea;
		try {	// Esto crea el fichero vacío
			Files.writeString(Paths.get(nombreFichero), "");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		do {	// Aqui vamos añadiendo linea a linea hasta que pongan la palabra FIN
			System.out.println("Introduzca la línea que quiere insertar en el fichero (FIN para finalizar): ");
			linea = sc.nextLine();
			if(!linea.equalsIgnoreCase("fin")) {
				try {
					Files.writeString(Paths.get(nombreFichero), linea+"\n", StandardOpenOption.APPEND);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} while(!linea.equalsIgnoreCase("fin"));
		
		sc.close();
	}
	
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
		// ejercicio7y5();
		ejercicio2("C:/ficheros/ejercicio2.txt");
	}

}
