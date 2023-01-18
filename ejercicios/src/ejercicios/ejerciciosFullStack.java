package ejercicios;

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

		int A = 2, B = 4, C = 6, D = 8, valorGuardado = B;

		System.out.println("Valores iniciales: A = " + A + " B = " + B + " C = " + C + " D = " + D);

		System.out.println("B toma el valor de C -> B = " + (B = C));
		System.out.println("C toma el valor de A -> C = " + (C = A));
		System.out.println("A toma el valor de D -> A = " + (A = D));
		System.out.println("D toma el valor de B -> D = " + (D = valorGuardado));
	}

	public static void main(String[] args) {

		// ejercicio1();
		// ejercicio2();
		// ejercicio3();
		// ejercicio4();
		// ejercicio5();
		ejercicio6();
	}

}
