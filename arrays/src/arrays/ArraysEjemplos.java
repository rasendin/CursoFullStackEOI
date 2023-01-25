package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraysEjemplos {

	public static void ejemploRecorrido() {
		int[] numeros = { 12, 23, 53, 5, 92 };
		// con un bucle for
		for (int i = 0; i < numeros.length; i++) { // Recorrer el array de uno en uno
			System.out.println("El array numeros en su posición " + i + " tiene el valor " + numeros[i]);
		}
		// un bucle for de detrás hacia adelante
		for (int i = numeros.length - 1; i >= 0; i--) { // Recorrer el array de detras hacia adelante
			System.out.println("El array numeros en su posición " + i + " tiene el valor " + numeros[i]);
		}
		// con un bucle for-each
		for (int numero : numeros) {
			System.out.println(numero);
		}
		// bucle for-each con posición
		int i = 0;
		for (int numero : numeros) {
			System.out.println("El array numeros en su posición " + (i++) + " tiene el valor " + numero);
		}
	}

	public static void ejemploBusquedas() {
		String[] nombres = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		boolean encontrado = false; // Nos indicará si hemos encontrado el valor
		String buscar = "Pedro"; // Valor a buscar en el array
		// La condición también incluye que no hayamos encontrado lo que buscamos
		for (int i = 0; i < nombres.length && !encontrado; i++) {
			if (nombres[i].equals(buscar)) {
				encontrado = true;
			}
		}
		if (encontrado) {
			System.out.println("El nombre " + buscar + " está en el array");
		} else {
			System.out.println(buscar + " no encontrado...");
		}

	}

	public static void ejemploBusquedaFuncional() {
		String[] nombres = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		String buscar = "Pedro";
		if (Arrays.stream(nombres).anyMatch(n -> n.equals("Pedro"))) {	// con lambdas
			System.out.println("El nombre " + buscar + " está en el array");
		} else {
			System.out.println(buscar + " no encontrado...");
		}
	}
	
	public static void ejemploRedimensiones() {
		String[] nombres = { "Juan", "Ana", "Pedro", "Eva", "Paco", ""};
		nombres = Arrays.copyOf(nombres, 10);
		for(int i = 0; i < nombres.length; i++) {
			if(nombres[i]!=null) {
				System.out.println(nombres[i] + " tiene " + nombres[i].length() + " letras");
			}
			// for-each
			System.out.println("Comienzo del for-each");
			for(String nombre:nombres) {
				if(nombre!=null)
				System.out.println(nombre + " tiene " + nombre.length() + " letras");
			}
		}
	}
	
	public static void ejemploAumentarUnoArray() {
		Scanner sc = new Scanner(System.in);
		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco"};
		System.out.print("Introduzca el nuevo alumno: ");
		String nombreAlumno = sc.nextLine();
		alumnos = Arrays.copyOf(alumnos, alumnos.length+1);	// Le da un tamaño de una unidad más al array
		alumnos[alumnos.length-1] = nombreAlumno;	// Mete el nuevo dato en la última posición
		for(String alumno : alumnos) {
			System.out.println(alumno);
		}
		Arrays.stream(alumnos).forEach(e->System.out.println(e));	
		sc.close();
	}
	
	public static void ejemploStringJoin() {
		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco"};
		String cadenaAlumnos = String.join(",", alumnos);
		System.out.println(cadenaAlumnos);
	}
	
	public static void eliminarUnElementoArray() {
		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco"};
		alumnos = Arrays.copyOf(alumnos, alumnos.length-1);
		for(String alumno : alumnos) {	// forEach
			System.out.println(alumno);
		}
	}
	
	public static void ordenarArray() {
		String[] alumnos = { "Juan", "Ana", "Pedro", "eva", "Paco"};
		Arrays.sort(alumnos);
		System.out.println("Imprimir con for-each");
		for(String alumno : alumnos) {	// forEach
			System.out.println(alumno);
		}
		System.out.println("Imprimir con toString");
		System.out.println(Arrays.toString(alumnos));	// Para ver el contenido de un array
		
		int[] numeros = {11,2,4,5,3,21,80};
		Arrays.sort(numeros);
		for(int numero: numeros) {	//forEach
			System.out.println(numero);
		}
	}
	
	public static void ordenarInverso() {
		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco"};
		Arrays.sort(alumnos);	// Orden menor a mayor
		for(String alumno: alumnos) {	//forEach
			System.out.println(alumno);
		}
		// Orden mayor a menor
		Collections.reverse(Arrays.asList(alumnos));
		for(String alumno: alumnos) {	//forEach
			System.out.println(alumno);
		}
		// Ahora con números
		Integer[] numeros = {11,2,4,5,3,21,80};	// Integer es la clase Wrapper de int, Boxing
		Arrays.sort(numeros);	// De menor a mayor
		for(int numero: numeros) {	//forEach
			System.out.println(numero);
		}
		Collections.reverse(Arrays.asList(numeros));
		for(int numero: numeros) {	//forEach
			System.out.println(numero);
		}
	}
	
	public static void clasesEnvolventes() {	// Wrappers
		// int -> Integer
		Integer numero;
		// double -> Double
		Double decimal;
		// float -> Float
		Float decimal2;
		// char -> Character
		Character letra;
		// boolean -> Boolean
		Boolean booleano;
		// String ya es una clase, no tiene Wrapper
		String cadena = "Hola";
	}

	public static void main(String[] args) {

		// ejemploRecorrido();
		// ejemploBusquedas();
		// ejemploBusquedaFuncional();
		// ejemploRedimensiones();
		// ejemploAumentarUnoArray();
		// ejemploStringJoin();
		// eliminarUnElementoArray();
		// ordenarArray();
		ordenarInverso();
	}

}
