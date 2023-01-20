package ejerciciosEstructuras;

import java.util.Scanner;

public class ejercicios {
	
	public static void ejercicio1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un número: ");
		int numero = sc.nextInt();
		if(numero%2==0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
	}
	
	public static void ejercicio2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un número: ");
		int numero = sc.nextInt();
		if(numero%10==0) {
			System.out.println("El número es múltiplo de 10");
		} else {
			System.out.println("El número no es múltiplo de 10");
		}
	}
	
	public static void ejercicio3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un caracter: ");
		char caracter = sc.next().charAt(0);
		if(Character.isUpperCase(caracter)) {
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
		
		if(cadena1.equals(cadena2)) {
			System.out.println("Los textos son iguales");
		} else {
			System.out.println("Los textos son distintos");
		}
	}

	public static void ejercicio5() {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("Ingrese primer número: ");
		num1 = sc.nextInt();
		System.out.print("Ingrese segundo número: ");
		num2 = sc.nextInt();
		
		if(num2==0) {
			System.out.println("No se puede dividir entre 0");
		} else {
			System.out.println(num1/num2);
		}
	}
	
	public static void main(String[] args) {
		
		// ejercicio1();
		// ejercicio2();
		// ejercicio3();
		// ejercicio4();
		// ejercicio5();
	}

}
