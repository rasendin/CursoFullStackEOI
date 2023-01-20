package ejerciciosEstructuras;

import java.util.Scanner;

public class ejercicios {

	public static void ejercicio1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un número: ");
		int numero = sc.nextInt();
		if (numero % 2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
	}

	public static void ejercicio2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un número: ");
		int numero = sc.nextInt();
		if (numero % 10 == 0) {
			System.out.println("El número es múltiplo de 10");
		} else {
			System.out.println("El número no es múltiplo de 10");
		}
	}

	public static void ejercicio3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un caracter: ");
		char caracter = sc.next().charAt(0);
		if (Character.isUpperCase(caracter)) {
			System.out.println("Es una letra mayúscula");
		} else {
			System.out.println("Es una letra minúscula");
		}

	}

	public static void ejercicio4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese dos cadenas de texto.\n");
		System.out.print("\tCadena 1: ");
		String cadena1 = sc.nextLine();
		System.out.print("\tCadena 2: ");
		String cadena2 = sc.nextLine();

		if (cadena1.equals(cadena2)) {
			System.out.println("Los textos son iguales");
		} else {
			System.out.println("Los textos son distintos");
		}
	}

	public static void ejercicio5() {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.print("Ingrese primer número: ");
		num1 = sc.nextInt();
		System.out.print("Ingrese segundo número: ");
		num2 = sc.nextInt();

		if (num2 == 0) {
			System.out.println("No se puede dividir entre 0");
		} else {
			System.out.println(num1 / num2);
		}
	}

	public static void ejercicio6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el primer número: ");
		int num1 = sc.nextInt();
		System.out.print("Ingrese el segundo número: ");
		int num2 = sc.nextInt();
		System.out.print("Ingrese el tercer número: ");
		int num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("El número " + num1 + " es el número mayor");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("El número " + num2 + " es el número mayor");
		} else if (num3 > num2 && num3 > num1) {
			System.out.println("El número " + num3 + " es el número mayor");
		}
	}

	public static void ejercicio7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese una hora (0-23): ");
		int hora = sc.nextInt();
		System.out.print("Ingrese los minutos (0-59): ");
		int minutos = sc.nextInt();
		System.out.print("Ingrese los segundos (0-59): ");
		int segundos = sc.nextInt();

		if (hora > 23) {
			System.out.println("La hora no puede ser mayor de un número 23");
		} else if (minutos > 59 || minutos < 0) {
			System.out.println("Los minutos no puede ser un número mayor de 59");
		} else if (segundos > 59 || minutos < 0) {
			System.out.println("Los segundos no puede ser un número mayor de 59");
		} else {
			System.out.printf("%02d:%02d:%02d", hora, minutos, segundos);
		}
	}

	public static void ejercicio8() {
		int numero = 12;
		System.out.println((numero % 2 == 0) ? "El número es par" : "El número es impar");
	}

	public static void ejercicio9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el número de un mes: ");
		int mes = sc.nextInt();
		switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: 
				System.out.println("El mes tiene 31 días");
				break;
			case 4: 
			case 6:
			case 9:
			case 11:
				System.out.println("El mes tiene 30 días");
				break;
			case 2:
				System.out.println("El mes tiene 28 días");
				break;
			default: 
				System.out.println("El número de mes introducido no es correcto");
		}
		sc.close();
	}
	
	public static void ejercicio10() {
		Scanner sc = new Scanner (System.in);  // Para leer datos por pantalla
		System.out.println("Introduzca una letra por teclado:");  // Petición al usuario que escriba
		char letra = sc.nextLine().charAt(0);  // guarda en cadena lo que el usuario escriba en la pantalla
		if(Character.isDigit(letra)) {  // Si es un dígito
			System.out.println("La letra es una cifra numérica");
		} else if(letra=='.' || letra==',' || letra==';' || letra==':') {
			System.out.println("La letra es un signo de puntuación");
		} else	{
			System.out.println("Es otro caracter");
		}	
		sc.close();
	}
	
	public static void ejercicio10b() { // Java 17
		Scanner sc = new Scanner (System.in);  // Para leer datos por pantalla
		System.out.println("Introduzca una letra por teclado:");  // Petición al usuario que escriba
		char letra = sc.nextLine().charAt(0);  // guarda en cadena lo que el usuario escriba en la pantalla
		switch(letra) {
		case '0','1','2','3','4','5','6','7','8','9' -> System.out.println("La letra es una cifra numérica");
		case '.',',',';',':' ->	System.out.println("La letra es un signo de puntuación");
		default -> System.out.println("Es otro caracter");
		}
		sc.close();
	}
	
	public static void ejercicio13() {
		int numero = 20;
		while(numero>0) {
			System.out.println(numero);
			numero--; // Decremento necesario para que el bucle no sea infinito
		}
	}

	public static void main(String[] args) {

		// ejercicio1();
		// ejercicio2();
		// ejercicio3();
		// ejercicio4();
		// ejercicio5();
		// ejercicio6();
		// ejercicio7();
		// ejercicio8();
		// ejercicio9();
		// ejercicio10();
		// ejercicio10b();
		ejercicio13();
	}

}
