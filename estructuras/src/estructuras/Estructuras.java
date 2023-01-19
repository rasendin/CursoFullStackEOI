package estructuras;

import java.util.Scanner;

public class Estructuras {
	
	public static void ejemploIf() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca su nombre: ");
		String nombre = sc.nextLine();
		
		if(nombre.equals("Fran")) {
			System.out.println("Hola Fran");
		}		
		System.out.println("Pasa un buen día!");		
		sc.close();		
	}
	
	public static void ejemploIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca su nombre: ");
		String nombre = sc.nextLine();
		
		if(nombre.equals("Fran")) {
			System.out.println("Hola Fran");
			System.out.println("Encantado de verte de nuevo");
		} else {
			System.out.println("Hola persona desconocida");
			System.out.println("Espero verte habitualmento por aquí");
		}
		System.out.println("Pasa un buen día!");		
		sc.close();	
	}
	
	public static void ejemploIfElseIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Tira un dado y escribe que número ha salido: ");
		int numero = sc.nextInt();
		
		if(numero==1) {
			System.out.println("Ha salido un uno");
		} else if(numero==2) {
			System.out.println("Ha salido un dos");
		} else if(numero==3) {
			System.out.println("Ha salido un tres");
		} else if(numero==4) {
			System.out.println("Ha salido un cuatro");
		} else if(numero==5) {
			System.out.println("Ha salido un cinco");
		} else if(numero==6) {
			System.out.println("Ha salido un seis");
		} else {
			System.out.println("¿Qué tipo de dato tienes que puede salir diferente 1-6?");
		}
		
		
		sc.close();	
	}
	
	public static void IfElseIfSinelse() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca su equipo favorito: ");
		String equipo = sc.nextLine();
		
		if(equipo.equals("Barcelona")) {
			System.out.println("Visca el Barça!");
		} else if(equipo.equals("Madrid")) {
			System.out.println("Hala Madrid!");
		}
		System.out.println("Bienvenido a nuestro programa de fútbol!");
		sc.close();
	}
	
	public static void main(String[] args) {
		
		// ejemploIF();
		// ejemploIfElse();
		// ejemploIfElseIfElse();
		IfElseIfSinelse();
	}
	
}
