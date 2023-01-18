package ejemplos;

public class Ejemplos {

	public static void ejemplosComentarios() {
		/**
		 * Para poner el comentario en azul
		 */
		/*
		 * Este es mi primer programa
		 */
		System.out.println("Hola mundo");
		// System.out.println("Comentario individual");
	}

	public static void ejemplosTipos() {
		// Números enteros
		int numero = 5;
		int numero2 = 7;
		int suma = numero + numero2;
		double division = (double) numero2 / numero;
		System.out.println("La suma es " + suma);
		System.out.println("La division es: " + division);
		System.out.println("La división es " + (numero2 / numero));
		// Números con decimales
		double decimales1 = 3.14;
		double decimales2 = 2.22;
		System.out.println("La multiplicación es: " + decimales1 * decimales2);
		System.out.println("La suma es: " + (decimales1 + decimales2));
		double sumadecimales = numero + decimales1;
		System.out.println(sumadecimales);
		// Enteros largos
		int maxInt = Integer.MAX_VALUE; // 2147483647
		int minInt = Integer.MIN_VALUE; // -2147483648
		System.out.println("Suma de dos largos: " + (maxInt + minInt));
		long largo1 = 2000000000;
		long largo2 = 1000000000;
		System.out.println("La suma de dos largos correctamente es: " + (largo1 + largo2));
		char letraA = 'a';
		char letraB = 'b';
		System.out.println("La suma de letra a y letra b es: " + letraA + letraB);
		System.out.println("La suma de letra a y letra b es: " + (letraA + letraB));
		System.out.println("La suma de letra a más 3 es: " + (letraA + 3));
		System.out.println("La suma de letra a más 3 es: " + (letraA + 3));
	}

	public static void ejemplosString() {

		String cadena1;
		cadena1 = "Raul";

		String cadena2 = "Hola", cadena3 = "Adios";
		String cadena4 = cadena2 + cadena1; // "HolaRaul"
		String cadena5 = cadena2 + " " + cadena1; // "Hola Raul"
		String prefijo = "34";
		String telefono = "611111111";
		int num = 23;
		System.out.println(prefijo + "-" + telefono);
		System.out.println("Otra cosa");
		System.out.printf("%s tiene %d años", cadena1, num);

	}

	public static void ejemplosBoolean() {

		// Son valores que solo pueden almacenar true o false;
		boolean verdad = true;
		boolean falso = false;
		boolean comparacion1 = 10 < 20; // true;
		System.out.println(10 < 20); // true;
		System.out.println(comparacion1); // true;

		// Condiciones de comparacion <,>,<=,>=,==,!=
		int num1 = 10;
		int num2 = 20;
		boolean c1 = 10 < 20; // true
		boolean c2 = 10 > 20; // false
		boolean c3 = 10 <= 20; // true
		boolean c4 = 10 >= 20; // false
		boolean c5 = 10 == 20; // false
		boolean c6 = 10 != 20; // true
		String cadena1 = "hola";
		String cadena2 = "adiós";
		String cadena3 = "hola";
		String cadena4 = "Hola";
		System.out.println(cadena1.equals(cadena2)); // Para comparar cadenas - false
		System.out.println(cadena1.equals(cadena3)); // Para comparar cadenas - true
		System.out.println(cadena1.equals(cadena4)); // Para comparar cadenas - false

		num1 = 5;
		double num3 = 5.0;
		double num4 = 5.1;
		System.out.println(num1 == num3); // true
		System.out.println(num1 == num4); // false
		System.out.println((11 / 2) == num1); // true
		System.out.println((11.0 / 2) == num1); // false
		System.out.println((11 % 2) == 1); // true
		System.out.println((11 % 2) == 0); // false
		System.out.println(23 % 4); // el resto de la division es 3
	}

	public static void tablasVerdad() {

		int edad = 25;
		int anyosCarnet = 6;
		String sexo = "Masculino";
		String nombre = "Pepe";
		boolean esPepeMayor = edad >= 18 && nombre.equals("Pepe"); // true
		System.out.println(esPepeMayor); // true

		boolean tieneDescuento = (sexo.equals("Masculino") && anyosCarnet > 10
				|| (sexo.equals("Femenino") && anyosCarnet > 5)); // false || false
		System.out.println(tieneDescuento); // false

		boolean estoQueDa = sexo.equals("Masculino") && nombre.equals("Raul") || anyosCarnet > 5; // true
		System.out.println(estoQueDa);

	}

	public static void ejemplosIncrementosDecrementos() {

		int numero = 10;
		// pre-incremento
		++numero; // 11
		System.out.println(numero); // 11
		// post-incremento
		numero++; // 12
		System.out.println(numero); // 12
		// pre-decremento
		--numero; // 11
		System.out.println(numero); // 11
		// post-decremento
		numero--; // 10
		System.out.println(numero); // 10

		//// LO IMPORTANTE ES EL MOMENTO EN QUE INCREMENTA O DECREMENTA
		System.out.println(++numero); // 10 u 11 ? -> 11 y número = 11
		System.out.println(numero++); // 11 y número = 12
		System.out.println(numero); // 12

		// System.out.println(++numero+numero++); // 26 (13 + 13) y luego numero=14 //
		// a+b = b+a
		System.out.println(numero++ + ++numero); // 26 (13+13) y luego numero=14 // a+b = b+a
		System.out.println(numero); // 14
		int numero2 = ++numero; // numero2 = 15; numero = 15;
		System.out.println("numero2 = " + numero2 + " numero = " + numero);
		int numero3 = numero++; // numero3 = 15; numero = 16;
		System.out.println("numero2 = " + numero3 + " numero = " + numero);
	}

	public static void ejemplosConstantes() {
		final double IVA = 0.21;
		final double PI = 3.1416;
		double precioVaquero = 50;
		System.out.println("El precio final es: " + (precioVaquero * (1 + IVA)));
		/*
		 * PI = 3.14159; Daría un error porque el valor de la variable final no se puede
		 * modificar en otra línea
		 */
	}

	public static void conversionesNumerosCadenas() {
		int num = 10;
		String cadena = "11";
		System.out.println(cadena + num); // 1110
		// Convertir cadena a número
		System.out.println(Integer.parseInt(cadena) + num); // 21
		// Convertir número a cadena
		int prefijo = 34;
		int telefono = 677777777;
		System.out.println(prefijo + telefono); // Lo suma porque son int 677777811
		System.out.println(""+prefijo + telefono); // 34677777777
		System.out.println(String.valueOf(prefijo) + telefono); // 34677777777
		System.out.println("00" + prefijo + "-" + telefono); // 0034-677777777
		
	}

	public static void main(String[] args) {

		// ejemplosComentarios();
		// ejemplosTipos();
		// ejemplosString();
		// ejemplosBoolean();
		// tablasVerdad();
		// ejemplosIncrementosDecrementos();
		// ejemplosConstantes();
		conversionesNumerosCadenas();
	}

}
