package estructuras;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Estructuras {

	public static void ejemploIf() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca su nombre: ");
		String nombre = sc.nextLine();

		if (nombre.equals("Fran")) {
			System.out.println("Hola Fran");
		}
		System.out.println("Pasa un buen día!");
		sc.close();
	}

	public static void ejemploIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca su nombre: ");
		String nombre = sc.nextLine();

		if (nombre.equals("Fran")) {
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

		if (numero == 1) {
			System.out.println("Ha salido un uno");
		} else if (numero == 2) {
			System.out.println("Ha salido un dos");
		} else if (numero == 3) {
			System.out.println("Ha salido un tres");
		} else if (numero == 4) {
			System.out.println("Ha salido un cuatro");
		} else if (numero == 5) {
			System.out.println("Ha salido un cinco");
		} else if (numero == 6) {
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

		if (equipo.toLowerCase().equals("barcelona")) {
			System.out.println("Visca el Barça!");
		} else if (equipo.toUpperCase().equals("MADRID")) {
			System.out.println("Hala Madrid!");
		} else if (equipo.equalsIgnoreCase("atletico")) {
			System.out.println("Aupa Atleti!");
		}
		System.out.println("Bienvenido a nuestro programa de fútbol!");
		sc.close();
	}

	public static void ejemploSwitch() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Tira un dado y escribe que número ha salido: ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("Ha salido un uno");
			break;
		case 2:
			System.out.println("Ha salido un dos");
			break;
		case 3:
			System.out.println("Ha salido un tres");
			break;
		case 4:
			System.out.println("Ha salido un cuatro");
			break;
		case 5:
			System.out.println("Ha salido un cinco");
			break;
		case 6:
			System.out.println("Ha salido un seis");
			break;
		default:
			System.out.println("Un dado no tiene más números");
			break;

		}
	}

	public static void ejemploTernarias() {
		int edad = 15;

		/*
		 * if(edad>=18) System.out.println("Eres mayor de edad"); else
		 * System.out.println("Eres menor de edad");
		 */

		System.out.println(edad >= 18 ? "Eres mayor de edad" : "Eres menor de edad");

		/*
		 * int descuento; if(edad>18) { descuento=5; }
		 * else
		 * { descuento=20; }
		 */

		int descuento = edad >= 18 ? 5 : 20;
		System.out.println(descuento);

		/*
		 * int tresValores; if(edad<18) { tresValores=1; }
		 *  else if(edad>=18 && edad<=65) { tresValores=2; } 
		 * else { tresValores=3; }
		 */

		int tresValores = edad < 18 ? 1 : (edad > 18 && edad <= 65) ? 2 : 3;

		System.out.println("TresValores vale: " + tresValores);

		int euros = 1;
		System.out.println("Cuesta " + euros + " euro" + (euros!=1?"s":""));
	}
	
	public static void ejemploAmbitosVariables() {
		int numero = 5;
		int edad = 20;
		
		if(edad>18) {
			//int numero=3;  // En Java da error
			int valor = 4;
			System.out.println(numero);
		}
		System.out.println("hola");
		// System.out.println(valor);  // Da error porque la variable no existe fuera del if
	}
	
	/*
	 * Este programa se ejecuta hasta que el usuario introduzca la contraseña
	 */
	public static void ejemploWhile1() {
		Scanner sc = new Scanner(System.in);
		String password = "1234";
		boolean adivina = false;
		while(!adivina) {	// (adivina == false)
			System.out.print("Introduzca la contraseña: ");
			String respuesta = sc.nextLine();
			if(respuesta.equals(password)) {
				adivina = true;
			} else {
				System.out.println("Contraseña incorrecta\n");
			}
		}
		System.out.println("Contraseña correcta");
		sc.close();
	}
	
	/*
	 * El programa permite adivinar la password en 3 oportunidades
	 */
	
	public static void ejemploWhile2() {
		Scanner sc = new Scanner(System.in);
		String password = "1234";
		int intentos = 0;
		boolean adivina = false;
		while(!adivina && intentos<3) {	// (adivina == false)
			System.out.print("Introduzca la contraseña (Quedan " + (3-intentos) + " intentos): ");
			intentos++;
			String respuesta = sc.nextLine();
			if(respuesta.equals(password)) {
				adivina = true;
			} else {
				System.out.println("Contraseña incorrecta\n");
			}
		}
		
		//System.out.println(adivina?"Contraseña":"Limite de intentos excedido");
		
		if(adivina) {
			System.out.println("Contraseña correcta");
		} else {
			System.out.println("Limite de intentos excedido");
		}
		sc.close();
	}
	
	/*
	 * El programa permite adivinar la password en 3 oportunidades
	 */
	
	public static void ejemploDoWhile1() {
		Scanner sc = new Scanner(System.in);
		String password = "1234";
		int intentos = 0;
		boolean adivina = false;
		do {	// (adivina == false)
			System.out.print("Introduzca la contraseña (Quedan " + (3-intentos) + " intentos): ");
			intentos++;
			String respuesta = sc.nextLine();
			if(respuesta.equals(password)) {
				adivina = true;
			} else {
				System.out.println("Contraseña incorrecta\n");
			}
		} while(!adivina && intentos<3);
		
		//System.out.println(adivina?"Contraseña":"Limite de intentos excedido");
		
		if(adivina) {
			System.out.println("Contraseña correcta");
		} else {
			System.out.println("Limite de intentos excedido");
		}
		sc.close();
	}

	public static void acaboCurso() {
		int diasQuedan = 0;
		LocalDate fecha = LocalDate.now();	// dia de hoy (23/01/2023)
		while(fecha.isBefore(LocalDate.parse("2023-03-31"))) {
			if(fecha.getDayOfWeek()!=DayOfWeek.SATURDAY && fecha.getDayOfWeek()!=DayOfWeek.SUNDAY) {
				System.out.println(fecha);
				diasQuedan++;
			}
			fecha = fecha.plusDays(1);
		}
		System.out.println("Has acabado el curso");
		System.out.println("Te quedan " + diasQuedan + " días");
	}
	
	public static void main(String[] args) {

		// ejemploIF();
		// ejemploIfElse();
		// ejemploIfElseIfElse();
		// IfElseIfSinelse();
		// ejemploSwitch();
		// ejemploTernarias();
		// ejemploAmbitosVariables();
		// ejemploWhile1();
		// ejemploWhile2();
		// ejemploDoWhile1();
		acaboCurso();
	}

}
