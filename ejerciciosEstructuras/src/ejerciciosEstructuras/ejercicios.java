package ejerciciosEstructuras;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	public static void ejercicio9b() {  // Java 17
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el número del mes:");
		int mes = sc.nextInt();
		switch(mes) {
		case 1,3,5,7,8,10,12:
			System.out.print("El mes tiene 31 días y es ");
			if(mes==1)
				System.out.println(" Enero");
			else if(mes==3)
				System.out.println(" Marzo"); //...
			break;
		case 4,6,9,11:
			System.out.println("El mes tiene 30 días y es " + ((mes==4)?"Abril":(mes==6)?"Junio":(mes==9)?"Septiembre":"Noviembre"));
			break;
		case 2:
			System.out.println("El mes tiene 30 días y es Febrero");
			break;
		default:
			System.out.println("El número de mes introducido no es correcto");
		}
		sc.close();
	}
	
	public static void ejercicio9c() {  // Java 17
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el número del mes:");
		int mes = sc.nextInt();
		switch(mes) {
		case 1,3,5,7,8,10,12 -> System.out.println("El mes tiene 31 días");
		case 4,6,9,11 -> System.out.println("El mes tiene 30 días y es " + ((mes==4)?"Abril":(mes==6)?"Junio":(mes==9)?"Septiembre":"Noviembre"));
		case 2 -> System.out.println("El mes tiene 30 días y es Febrero");
		default -> System.out.println("El número de mes introducido no es correcto");
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
	
	public static void ejercicio12() {
		Scanner sc = new Scanner(System.in);
		double precioEntrada = 50;
		final double MENOR_EDAD = 0.25;
		final double DESCUENTO_SOCIO = 0.40;
		final double DESCUENTO_JUBILADO = 0.75;
		System.out.print("Introduzca su edad: ");
		int edad = sc.nextInt();
		sc.nextLine();
		
		if(edad<18) {
			precioEntrada = precioEntrada * (1-MENOR_EDAD);	// precio * 0.75
			System.out.println("Su entrada vale " + precioEntrada + " euros");
		} else if(edad>=18 && edad<65) {
			System.out.println("¿Es usted socio?");
			String respuesta = sc.nextLine();
			// Solución con expresión regular
			Pattern regex = Pattern.compile("^s[iíÍ]?$", Pattern.CASE_INSENSITIVE);			
			Matcher m = regex.matcher(respuesta);
			if(m.matches()) {
				precioEntrada = precioEntrada * (1 - DESCUENTO_SOCIO);
			}
		} else {
			precioEntrada = precioEntrada * (1 - DESCUENTO_JUBILADO);
		}
		System.out.println("Su precio es: " + precioEntrada);
		sc.close();
	}
	
	public static void ejercicio12Grupo() {
		final double MENOR_EDAD = 0.25;
		final double DESCUENTO_SOCIO = 0.40;
		final double DESCUENTO_JUBILADO = 0.75;
		final int PRECIO_ENTRADA = 50;
		final int MAYORIA_EDAD = 18;
		final int EDAD_JUBILACION = 65;
		Scanner sc = new Scanner (System.in);  // Para leer datos por pantalla
		double precioEntrada = PRECIO_ENTRADA;  // Precio estándar sin descuentos
		double precioTotalGrupo = 0;  // Almacenará el precio total
		System.out.println("¿Cuántos sois?");
		int personas = sc.nextInt();  // Ya tengo las personas
		sc.nextLine();
		int personasAtendidas = 0;
		while(personasAtendidas<personas) {
			System.out.println("Datos de la persona " + (personasAtendidas+1));
			System.out.println("Introduzca su edad:");
			int edad = sc.nextInt();
			sc.nextLine();
			precioEntrada = PRECIO_ENTRADA;  // Volver a poner el precio que toca para ver si se aplican descuentos
			if(edad<MAYORIA_EDAD) {
				precioEntrada = precioEntrada * (1-MENOR_EDAD);  
			} else if(edad>=MAYORIA_EDAD && edad<EDAD_JUBILACION) {
				System.out.println("Es usted socio (sí/no):");
				String respuesta = sc.nextLine();
				if(respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("sí") || respuesta.equalsIgnoreCase("s")) {
					precioEntrada = precioEntrada * (1 - DESCUENTO_SOCIO);
				}
			} else {
				precioEntrada = precioEntrada * (1-DESCUENTO_JUBILADO);
			}
			precioTotalGrupo += precioEntrada;
			System.out.println("Precio de la entrada de la persona " + (personasAtendidas+1) + " es " + precioEntrada);
			System.out.println("Precio del grupo hasta el momento: " + precioTotalGrupo);
			personasAtendidas++;
		}
				
		System.out.println("El precio FINAL del grupo es: " + precioTotalGrupo);
		sc.close();
	}
	
	public static void ejercicio13() {
		int numero = 20;
		while(numero>0) {
			System.out.println(numero);
			numero--; // Decremento necesario para que el bucle no sea infinito
		}
	}
	
	public static void ejercicio13b() {
		int numero = 20;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el número a decrementar: ");
		numero = sc.nextInt();
		while(numero>0) {
			System.out.println(numero);
			numero--; // Decremento necesario para que el bucle no sea infinito
		}
	}
	
	public static void ejercicio14() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int numUser;
		do {
			System.out.print("Introduzca un número (cuando desee parar, solamente ingrese el 0): ");
			numUser = sc.nextInt();
			System.out.println(num+=numUser);
		} while (numUser!=0);
		if(numUser==0) {
			System.out.println("El total sumado es: " + num);
		}
		sc.close();
	}
	
	/*
	 * Decir si un número es primo o no
	 * Primo es si solamente es divisible entre 1 y por sí mismo (ej: 2,3,5,7,13, etc...)
	 */
	
	public static void ejercicio21() {	// Resuleto con for
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int numero = Integer.parseInt(sc.nextLine());	// Para coger un número y asignarlo a una variable
		
		for (int i = 1; i <= numero; i++) {
			if(numero%i==0) {
				System.out.println("El número " + i + " es divisible de " + numero);
			}
		}
		sc.close();
	}
	
	public static void ejercicio21b() {	// Resuleto con while
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int numero = sc.nextInt();
		sc.nextLine();
		int i=1;
		while(i<numero) {
			if(numero%i==0) {
				System.out.println("El número " + i + " es divisible de " + numero);
			}
			i++;
		}
	}
	
	public static void ejercicio21Primos() {	// Resuleto con for
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int numero = Integer.parseInt(sc.nextLine());	// Para coger un número y asignarlo a una variable
		
		for (int i = 1; i <= numero; i++) {
			if(numero%i==0) {
				contador++;
			}
		}
		if(contador==2 || numero == 1) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}
		sc.close();
	}
	
	public static void ejercicio21PrimosConBooleano() {	
		int contador = 0;
		boolean esPrimo = true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int numero = Integer.parseInt(sc.nextLine());	// Para coger un número y asignarlo a una variable
		
		for (int i = 2; i < numero/2 && esPrimo; i++) {
			if(numero%i==0) {
				esPrimo=false;
			}
		}
		if(esPrimo) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}
		sc.close();
	}
	
	public static void ejercicio21PrimosConBreak() {	
		int contador = 0;
		boolean esPrimo = true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int numero = Integer.parseInt(sc.nextLine());	// Para coger un número y asignarlo a una variable
		
		for (int i = 2; i<numero/2; i++) {
			contador++;
			if(numero%i==0) {
				esPrimo=false;
				break;	// No recomendable salvo excepciones
			}
		}
		System.out.println("Número de veces que se ha ejecutado el bucle for: " + contador);
		if(esPrimo) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}
		sc.close();
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
		// ejercicio9b()
		// ejercicio9c();
		// ejercicio10();
		// ejercicio10b();
		// ejercicio13();
		// ejercicio14();
		// ejercicio13b();
		// ejercicio12();
		// ejercicio12Grupo();
		// ejercicio21();
		// ejercicio21b();
		// ejercicio21Primos();
		// ejercicio21PrimosConBooleano();
		ejercicio21PrimosConBreak();
		 
	}

}
