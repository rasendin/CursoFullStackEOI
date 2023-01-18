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
		cadena1="Raul";
		
		String cadena2 = "Hola", cadena3 = "Adios";
		String cadena4 = cadena2 + cadena1;		// "HolaRaul"
		String cadena5 = cadena2 + " " + cadena1;		// "Hola Raul"
		String prefijo = "34";
		String telefono = "611111111";
		int num = 23;
		System.out.println(prefijo + "-" + telefono);
		System.out.println("Otra cosa");
		System.out.printf("%s tiene %d años",cadena1,num);
		
	}
	
	public static void main(String[] args) {
		
		// ejemplosComentarios();
		// ejemplosTipos();
		ejemplosString();

	}

}
