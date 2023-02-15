package com.raul.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.raul.colecciones.entidades.Persona;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void ejemplosListas() {
		// Lista que almacena números
		List<Integer> numeros = new ArrayList<Integer>();
		// Podemos establecer una capacidad inicial reservada
		List<Integer> numeros2 = new ArrayList<>(12);
		// Se puede crear una lista a partir de un array
		Integer[] array = {2, 3, 5};
		List<Integer> numeros3 = new ArrayList<>(Arrays.asList(array));
		// Se puede crear una lista a partir de otra colección
		List<Integer> numeros4 = new ArrayList<Integer>(numeros2);
		
		Integer[][] matriz = new Integer[4][5];  // como se hacía un array de 2 dimensiones
		Integer[][][] show_red = new Integer[1024][728][128];  // array de 3 dimensiones
	
		// Crear listas de más de una dimensión
		List<List<Integer>> listaDeListas = new ArrayList<List<Integer>>();
		List<List<List<Integer>>> lista3Dimensiones = new ArrayList<>();
		
		List<String> cadenas = new ArrayList<>();
		cadenas.add("Hola");
		cadenas.add("Mundo");
		cadenas.add("Cruel");
		cadenas.add("Hola");  // Las listas SÍ permiten elementos duplicados
		cadenas.add("Otra");
		cadenas.add("Vez");
		System.out.println(cadenas.size());  // Imprime número de elementos. 6
		
		List<String> otra = Arrays.asList("hola","en","minúscula");  // Una lista de cadenas con valores iniciales  
		cadenas.addAll(otra);
		System.out.println(cadenas.size());  // 9
		
		//cadenas.clear();
		//System.out.println(cadenas.size());  // 0
		if(cadenas.contains("hola")) {
			System.out.println("La lista contiene hola");
		}
		
		// recorrer una lista entera
		cadenas.forEach(e->System.out.println(e));
		System.out.println(cadenas.indexOf("Hola"));  // 0
		System.out.println(cadenas.lastIndexOf("Hola"));  // 3
		
		List<String> otra2 = new ArrayList<>(Arrays.asList("hola","en","minúscula"));  // Lo correcto para crear una lista a partir de datos iniciales en un array
		
		// borrados lista
		cadenas.remove("Mundo");  // Borra el primer "Mundo"
		cadenas.removeAll(otra2);  // Borra un conjunto
		cadenas.forEach(e->System.out.println(e));
		cadenas.removeIf(e->e.equals("Hola"));  // Borra TODOS los elementos de la lista que cumplan la condicion a la derecha de ->
		cadenas.forEach(e->System.out.println(e));
		
	}
	
	public static void ejemploMap() {
		// Diccionario que almacena cadenas y el índice también es una cadena
		Map<String, String> traducciones = new HashMap<>();
		traducciones.put("mesa", "table");
		traducciones.put("silla", "chair");
		traducciones.put("cabeza", "head");
		traducciones.put("botella", "bottle");
		// {mesa=table, cabeza=head, botella=bottle, silla=chair}
		System.out.println(traducciones);
		
		// Acceder a los valores
		String palabra = traducciones.get("cabeza");
		System.out.println(palabra); // head
		
		// Recorrer los valores
		for(String key: traducciones.keySet()) {
			 System.out.println(key + " en inglés es: " + traducciones.get(key));
		}
		for(String value: traducciones.values()) {
		 System.out.println("Palabra: " + value + " (no puedo saber la clave...)");
		}
		// Con funcional sería
		traducciones.forEach((clave, valor) -> System.out.println(clave + " en inglés es: " + valor));
		
		Map<Integer,Persona> personas = new HashMap<>();
		personas.put(1,new Persona("Fran",10000));
		personas.put(2,new Persona("Pepe",10000));
		personas.put(3,new Persona("Jose",10000));
		personas.put(4,new Persona("Fran",10000));		
		
		Persona persona3 = personas.get(3);
		System.out.println(persona3);
	}
	
	public static void ejemploSet() {
		// NO PERMITE ELEMENTOS DUPLICADOS
		Set<Persona> personas = new HashSet<>();
		personas.add(new Persona("Fran",10000));
		personas.add(new Persona("Luis",10000));
		personas.add(new Persona("Fran",20000));	// La ignora
		personas.add(new Persona("Fran",30000));	// La ignora
		personas.add(new Persona("fran",10000));
		System.out.println("El número de personas es: " + personas.size());	// 3
	}
	
	public static void ejercicio1() {
		List<Integer> numeros = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		numeros.add(50);
		numeros.add(60);
		numeros.removeIf(e->e==20);
		numeros.add(1, 25);
		numeros.add(2, 26);
		//numeros.sort(Comparator.reverseOrder());
		//numeros.sort(Collections.reverseOrder());
		//Collections.reverse(numeros);
		numeros.sort((e1,e2)->e2-e1);	// Crearte tú mismo un comparador
		numeros.forEach(e->System.out.println(e));
		
	}
	
    public static void main( String[] args ){
    	//ejemplosListas();
    	//ejemploMap();
    	//ejemploSet();
    	ejercicio1();
    }
    
    
}
