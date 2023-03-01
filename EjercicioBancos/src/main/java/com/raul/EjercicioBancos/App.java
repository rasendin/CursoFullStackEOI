package com.raul.EjercicioBancos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/**
 * Una clase es un molde
 * Una instancia es la galleta
 *
 */
public class App {
	
	//CONTEXTO GLOBAL DE LA APP. aquí se crean las variables GLOBALES, que todas las funciones puedan usar.

		static String path = ("C:\\Users\\Usuario\\Documents\\FullStackEOI\\CursoFullStackEOI\\ficheros_bancos");
		
		public static String getDniUserInput() {

			Scanner sc = new Scanner(System.in);
			System.out.println("Escriba su DNI o CIF: \n");
			String dni = sc.nextLine();
			sc.close();
			System.out.println(dni);
			return dni; // después del return nada se ejecuta.

		}

	//dependency injection ES ENVIAR A LA FUNCION SOLO LO QUE NECESITA PARA FUNCIONAR!!
		public static String[] getUserInfo(String dni) {
			File directory = new File(path);
			File[] files = directory.listFiles((dir, name) -> name.endsWith(".txt"));
			for (File file : files) {
				try {
					FileReader fileReader = new FileReader(file);
					BufferedReader bufferedReader = new BufferedReader(fileReader);
					String line;

					while ((line = bufferedReader.readLine()) != null) {
						if (line.contains(dni)) {
							return line.split(";"); // aquí creo un array con el número de columnas o elementos
							// separados por ;;

						}
					}

					bufferedReader.close();
					fileReader.close();

				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return null; // después del for.
		}

		public static String getDate(String postcode) {
	        LocalDate date = LocalDate.now();
	        if (postcode.equals("ES")) {
	            DateTimeFormatter formatSpanish = DateTimeFormatter.ofPattern("EEEE, d 'de' MMMM 'de' yyyy",
	                    new Locale("ES"));
	            String dateSpanish = date.format(formatSpanish);

	            return dateSpanish;
	        } else {

	            String dayOrdinal = getDayOrdinal(date.getDayOfMonth());
	            DateTimeFormatter dateEnglish = DateTimeFormatter.ofPattern("EEEE, MMMM d'" + dayOrdinal + "', yyyy",
	                    Locale.ENGLISH);
	            return date.format(dateEnglish);
	        }

	    }

	    private static String getDayOrdinal(int day) {
	        if (day >= 11 && day <= 13) {
	            return "th";
	        }
	        switch (day % 10) {
	        case 1:
	            return "st";
	        case 2:
	            return "nd";
	        case 3:
	            return "rd";
	        default:
	            return "th";
	        }
	    }

		public static String getName(String[] columns) {
//						line= 555;Fran;18/03/1970;ES;100000
//						country = "ES";
			return columns[1];

		}

		public static String getBirthdate(String[] columns) {
			return columns[2];
		}

		public static String getPostcode(String[] columns) {
			return columns[3];
		}

		public static double getBalance(String[] columns) {
			return Double.parseDouble(columns[4]) ;
		}
		public static void welcomeMessage(CuentaCliente c) {
			
			if(c.getLanguage().equals("en")) {
				System.out.println("Welcome " + c.getNombre() + ", today is " + getDate(c.getCodigoPostal()));
			} else {
				System.out.println("Bienvenid@ " + c.getNombre() + ", hoy es " + getDate(c.getCodigoPostal()));
			}
			
		}

		public static void showUserInfo(String[] userInfo) {

			for (String info : userInfo) {
				System.out.println(info);
			}
		}

		public static void main(String[] args) {
			

			String dni = getDniUserInput();
			String[] userInfo = getUserInfo(dni);
			String name = getName(userInfo);
			System.out.println(name);
//			String language = getLanguage(userInfo);
//			System.out.println(language);
//			String date = getDate(language);
//			System.out.println(date);
			String birthdate = getBirthdate(userInfo);
			String postcode = getPostcode(userInfo);
			double balance = getBalance(userInfo);
			
			CuentaCliente client = new CuentaCliente(dni, name, birthdate, postcode, balance); // client es la instancia, la que tiene valores reales, mientras que la clase es abstracta
			welcomeMessage(client);

		}
	}