package ejercicios;

import java.util.Scanner;

public class ejerciciosFullStack {

	public static void ejercicio1() {

		int num1 = 36;
		int num2 = 27;
		int resultado = num1 + num2;

		System.out.println("El resultado de sumar " + num1 + " + " + num2 + " da como resultado " + resultado);

	}

	public static void ejercicio2() {

		int num1 = 15;
		int num2 = 4;

		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

	}

	public static void ejercicio3() {

		int num1 = 4, num2 = 8;
		System.out.println(num1 + " es menor que " + num2 + ": " + (num1 < num2));
		System.out.println(num1 + " es igual que " + num2 + ": " + (num1 == num2));
		System.out.println(num1 + " es mayor o igual que " + num2 + ": " + (num1 >= num2));

	}

	public static void ejercicio4() {

		double num1 = 3, num2 = 4, num3 = 5.5, num4 = 7.5;
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		System.out.print(num3 + " ");
		System.out.println(num4);
		System.out.println(((num1 + num2) * num3) / num4);

	}

	public static void ejercicio5() {

		int N = 5;

		System.out.println("Valor inicial de N = " + N);

		System.out.println("N + 77 = " + (N += 77));
		System.out.println("N - 5 = " + (N -= 3));
		System.out.println("N * 2 = " + (N *= 2));

	}

	public static void ejercicio6() {

		int A = 2, B = 4, C = 6, D = 8, auxB = B;

		System.out.println("Valores iniciales: A = " + A + " B = " + B + " C = " + C + " D = " + D);

		System.out.println("B toma el valor de C -> B = " + (B = C));
		System.out.println("C toma el valor de A -> C = " + (C = A));
		System.out.println("A toma el valor de D -> A = " + (A = D));
		System.out.println("D toma el valor de B -> D = " + (D = auxB));
	}

	public static void ejercicio7() {

		char letra1 = 'b';
		char letra2 = 'k';

		int diferencia = letra2 - letra1;
		System.out.println("b tiene la posición " + (int) letra1);
		System.out.println("k tiene la posición " + (int) letra2);

		System.out.println("Diferencia entre b y k: " + diferencia);
	}

	public static void ejercicio8() {

		int a = 5, b, c;
		;
		b = ++a;
		System.out.println(b);
		System.out.println(a);
		c = a++;
		System.out.println(c);
		System.out.println(a);
		b = b * 5;
		System.out.println(b);
		a = a * 2;
		System.out.println(a);

	}

	public static void ejercicio9() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese su nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Su nombre es: " + nombre);

	}

	public static void ejercicio10() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Escriba un número entero: ");
		int num = sc.nextInt();
		System.out.println("El doble de ese número es: " + num * 2);
		System.out.println("El triple de ese número es: " + num * 3);
	}

	public static void ejercicio11() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese cantidad de grados centígrados: ");
		int centigrados = sc.nextInt();
		int fahrenheit = 32 + (9 * centigrados / 5);
		System.out.println(centigrados + " son " + fahrenheit + " grados fahrenheit");

	}

	public static void ejercicio12() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un número de 3 cifras: ");
		int num = sc.nextInt();
		System.out.println(num / 100);
		num %= 100;
		System.out.println(num / 10);
		System.out.println(num % 10);

	}

	public static void ejercicio13() {

		Scanner sc = new Scanner(System.in);
		int dia, mes, anyo;
		int sumaFecha;
		int numeroSuerte = 0;
		System.out.print("Escriba su fecha de nacimiento: ");

		dia = sc.nextInt();
		mes = sc.nextInt();
		anyo = sc.nextInt();

		// Sumar los numeros de la fecha
		sumaFecha = dia + mes + anyo;

		// Averiguar las cuatro cifras del numero

		numeroSuerte += sumaFecha % 10;
		sumaFecha /= 10;
		numeroSuerte += sumaFecha % 10;
		sumaFecha /= 10;
		numeroSuerte += sumaFecha % 10;
		numeroSuerte += sumaFecha / 10;

		System.out.println("Tu número de la suerte es: " + numeroSuerte);

	}
	
	public static void ejercicio15() {
		Scanner sc = new Scanner(System.in);
		
		String producto1,producto2,producto3;
		double precio1,precio2,precio3;
		System.out.print("Primer producto: ");
		producto1 = sc.nextLine();
		System.out.print("Precio del primer producto: ");
		precio1 = Double.parseDouble(sc.next().replace(',', '.'));
		System.out.print("Segundo producto: ");
		producto2 = sc.nextLine();
		System.out.print("Precio del segundo producto: ");
		precio2 = Double.parseDouble(sc.next().replace(',', '.'));
		System.out.print("Tercer producto: ");
		producto3 = sc.nextLine();
		System.out.print("Precio del tercer producto: ");
		precio3 = Double.parseDouble(sc.next().replace(',', '.'));
		sc.close();
		
		System.out.printf("%-15s%12s%12s\n","NOMBRE","PRECIO","CON IVA");
		System.out.println("-----------------------------------------------");
		System.out.printf("%-15s%12.2f€%12.2f€\n",producto1,precio1,precio1+precio1*0.21);
		System.out.printf("%-15s%12.2f€%12.2f€\n",producto2,precio2,precio2+precio2*0.21);
		System.out.printf("%-15s%12.2f€%12.2f€\n",producto3,precio3,precio3+precio3*0.21);
		
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
		// ejercicio11();
		// ejercicio12();
		// ejercicio13();
		ejercicio15();
	}

}
