
package poo1;

import java.util.ArrayList;
import java.util.List;

public class Ejemplos {
	
	public static void ejemplosCoches() {
		Coche miCoche = new Coche();  // Me crea un coche sin datos. Usa el constructor vacío
		//miCoche.numeroRuedas = -4;
		//miCoche.marca = "Seat";
		//miCoche.modelo = "Altea";
		miCoche.setNumeroRuedas(6);
		miCoche.setMarca("Seat");
		miCoche.setModelo("Altea");
		miCoche.setPrecio(10000);
		miCoche.setMatricula("0000-AAA");
		System.out.println(miCoche);  // Estamos probando el toString
		System.out.println("Mi coche es un " + 
				miCoche.getMarca() + " " 
				+ miCoche.getModelo() + " Con matrícula: " + miCoche.getMatricula());
		
		// Vamos a probar el constructor con parámetros
		Coche z3 = new Coche(40, "Bmw", "Z3", "1111-BBB", -20000);
		System.out.println(z3);
		System.out.println("Mi nuevo coche es un " + 
				z3.getMarca() + " " 
				+ z3.getModelo() + " Con matrícula: " + z3.getMatricula());
		
		Coche tercero = new Coche(4, "Mercedes", "Clase A", 15000);
		System.out.println(tercero);
		
		// Vamos a probar el constructor de copia
		Coche clonZ3 = new Coche(z3);
		System.out.println("Imprimo Z3 clonado sin cambiar nada:");
		System.out.println(clonZ3);
		clonZ3.setMatricula("2222-CCC");
		System.out.println("Imprimo Z3 original:");
		System.out.println(z3);
		System.out.println("Imprimo Z3 clonado y cambiada la matrícula:");
		System.out.println(clonZ3);
		
		// Error tipico de un programador
		Coche intentoClon = z3;  // Esto no crea un nuevo coche, al coche existente ahora se le puede llamar de dos formas
		z3.setPrecio(5000);
		intentoClon.setNumeroRuedas(5);
		System.out.println("Voy a imprimir el intentoClon:");
		System.out.println(intentoClon);
		System.out.println(z3);
		
		// Probar Equals
		
		if(z3.equals(intentoClon)) {
			System.out.println("Los coches son iguales");
		} else {
			System.out.println("Los coches son diferentes");
		}
		
		if(miCoche.esCaro()) {
			System.out.println("Mi coche es caro");
		} else {
			System.out.println("Mi coche es barato");
		}
	}
	
	public static void ejercicio1() {
		Jugador jugador1 = new Jugador("Fran", 45, 50000);
		Jugador jugador2 = new Jugador("David", 20, 60000);
		Jugador jugador3 = new Jugador("Bárbara", 23, 70000);
		Jugador jugador4 = new Jugador("Camila", 22, 80000);
		Jugador jugador5 = new Jugador("José Luis", 18, 60000);
		Jugador jugador6 = new Jugador("Enrique", 15, 50000);
		Jugador jugador7 = new Jugador("Atenea", 20, 40000);
		Jugador jugador8 = new Jugador("Ángel", 22, 1000000);
		Jugador jugador9 = new Jugador();
		jugador9.setNombre("Néstor");
		jugador9.setEdad(-20);
		jugador9.setSueldo(-50000);
		Jugador jugador10 = new Jugador(jugador1);
		System.out.println(jugador1);
		System.out.println(jugador9);
		System.out.println(jugador10);
	}
	
	public static void ejemploListaJugadores() {
		
		// Creo una lista vacía para almacenar los jugadores
		List<Jugador> jugadores = new ArrayList<Jugador>();
		
		Jugador fran = new Jugador("Fran", 45, 50000);
		Jugador david = new Jugador("David", 20, 60000);
		Jugador barbara = new Jugador("Bárbara", 23, 70000);
		Jugador camila = new Jugador("Camila", 22, 80000);
		Jugador joseLuis = new Jugador("José Luis", 18, 60000);
		Jugador enrique = new Jugador("Enrique", 15, 50000);
		Jugador atenea = new Jugador("Atenea", 20, 40000);
		Jugador angel = new Jugador("Ángel", 22, 1000000);
		Jugador nestor = new Jugador();
		nestor.setNombre("Néstor");
		nestor.setEdad(-20);
		nestor.setSueldo(-50000);
		Jugador francisco = new Jugador(fran);
		
		// Meter jugadores en la lista
		jugadores.add(fran);
		jugadores.add(david);
		jugadores.add(barbara);
		jugadores.add(camila);
		jugadores.add(joseLuis);
		jugadores.add(enrique);
		jugadores.add(atenea);
		jugadores.add(angel);
		jugadores.add(nestor);		
		jugadores.add(francisco);
		jugadores.add(new Jugador("Naomi",20,80000));
		
		// Imprmir todos los jugadores
		jugadores.forEach(e->System.out.println(e));
		// Filtra e imprime:
		System.out.println("Jugadores que ganan más de 60000 euros");
		jugadores.stream()
			.filter(e->e.getSueldo()>60000)
			.forEach(e->System.out.println(e));
		// Filtra e imprime:
		System.out.println("Jugadores que ganan entre 50000 y 70000 euros y su nombre tenga más de 5 letras");
		jugadores.stream()
			.filter(e->e.getSueldo()>=50000)
			.filter(e->e.getSueldo()<=70000)
			.filter(e->e.getNombre().length()>5)
			.forEach(e->System.out.println(e));
		// Filtra e imprime:
		System.out.println("Jugadores que tengan una 'N' en su nombre");
		jugadores.stream()
			.filter(e->e.getNombre().toLowerCase().contains("n"))
			.forEach(e->System.out.println(e));
		
		
	}
	
	public static void ejercicio2() {
		List<Jugador> jugadores = new ArrayList<Jugador>();
		Jugador Naomi = new Jugador("Naomi",25,50000);
		Jugador Francisco = new Jugador("Francisco",45,40000);
		Jugador Null = new Jugador();
		Jugador Null2 = new Jugador();
		Jugador Raul = new Jugador("Raúl",24,50000);
		Jugador Juan = new Jugador("Juan",20,80000);
		jugadores.add(Naomi);
		jugadores.add(Francisco);
		jugadores.add(null);
		jugadores.add(null);
		jugadores.add(Raul);
		jugadores.add(Juan);
		jugadores.stream()
		.filter(e -> e != null)
		.forEach(e -> System.out.println(e));
	}
	
	public static void ejercicio3() {
		List<Jugador> jugadores = new ArrayList<Jugador>();
		Jugador Naomi = new Jugador("Naomi",25,50000);
		Jugador Francisco = new Jugador("Francisco",45,40000);
		Jugador Null = new Jugador();
		Jugador Null2 = new Jugador();
		Jugador Raul = new Jugador("Raúl",24,50000);
		Jugador Juan = new Jugador("Juan",20,80000);
		Jugador clonNaomi = new Jugador(Naomi);
		Jugador clonFrancisco = new Jugador(Francisco);
		Jugador clonRaul = new Jugador(Raul);
		Jugador clonJuan = new Jugador(Juan);
		jugadores.add(clonNaomi);
		jugadores.add(clonFrancisco);
		jugadores.add(clonRaul);
		jugadores.add(clonJuan);
		clonNaomi.setNombre("Elvira");
		jugadores.stream()
		.filter(e -> e != null)
		.forEach(e -> System.out.println(e));
	}
	
	public static void ejercicio4() {
		Equipo equipo = new Equipo();
		equipo.setNombre("Equipo EOI");
		equipo.addJugador(new Jugador("José",25,100000));	// añade jugadores a la lista
		equipo.addJugador(new Jugador("Paco",25,100000));
		equipo.addJugador(new Jugador("Luis",25,100000));
		equipo.addJugador(new Jugador("Raul",25,100000));
		equipo.deleteJugador(0);	// borra el primer elemento
		equipo.getJugadores().forEach(e->System.out.println(e));	// Muestra todos los jugadores de la lista 
		System.out.println("El sueldo de todos los jugadores es: " + equipo.totalSueldo());
		
	}
	
	public static void ejemploEquipos() {
		Equipo barsa = new Equipo();
		barsa.setNombre("F.C. Barcelona");
		barsa.setPresupuesto(400000000);
		Estadio campNou = new Estadio();	// Creo el estadio y le doy datos
		campNou.setNombre("Camp Nou");
		campNou.setCapacidad(100000);
		barsa.setEstadio(campNou);	// Asigno el estadio al equipo
		List<Jugador> jugadoresBarsa = new ArrayList<Jugador>();	// Creo la lista y le meto jugadores
		jugadoresBarsa.add(new Jugador("Raul",23,200000));
		jugadoresBarsa.add(new Jugador("Fran",25,100000));
		jugadoresBarsa.add(new Jugador("Angel",20,150000));
		jugadoresBarsa.add(new Jugador("David",19,80000));
		barsa.setJugadores(jugadoresBarsa);
		System.out.println("Fin de la creación del equipo");
		// Imprimo el equipo
		//System.out.println(barsa);
		
		// Probamos el constructor de copia
		Equipo madrid = new Equipo(barsa);
		madrid.setNombre("Real Madrid");
		madrid.setPresupuesto(100000);
		barsa.getEstadio().setNombre("Nuevo Campo");	// Le cambio el nombre del estadio del barsa
		madrid.getEstadio().setNombre("Santiago Bernabeu");
		madrid.getEstadio().setCapacidad(80000);
		// Accede al equipo, luego a su lista de jugadores, luego a su primer elemento de la lista y luego le cambia el nombre
		barsa.getJugadores().get(0).setNombre("Francisco");	
		madrid.getJugadores().get(1).setNombre("Ate");
		
		// Impresión de los equipo
		System.out.println(barsa);	// Imprimo el Barsa
		System.out.println(madrid);	// Imprimo el Madrid
	}
	
	public static void ejemplosHerencias() {
		//Animal animal = new Animal("Mi animal",10);  // Falla al ser clase Abstracta
		
		Ave pajaro = new Ave(true);
		Ave gallina = new Ave("Animal desconocido", 1, false);

		
		
		//animal.comer();
		
		//pajaro.comer();
		pajaro.ponerHuevos();

		System.out.println("El pájaro se llama : " + pajaro.getNombre());
		
		Mamifero leon = new Mamifero("León", 210, true);
		
		leon.comer();
		System.out.println(pajaro.toString());
		System.out.println(leon.toString());
		Mamifero gato = new Mamifero("Animal desconocido",1,true);
		
		if(pajaro.equals(gallina)) {
			System.out.println("El pájaro es igual a la gallina");
		} else {
			System.out.println("El pájaro y la gallina no son iguales");
		}
		
		// Aquí aunque se llaman igual y pesan lo mismo y son animales
		// los detecta diferente porque son de distinta clase.
		if(pajaro.equals(gato)) {
			System.out.println("El pájaro es igual al gato");
		} else {
			System.out.println("El pájaro y el gato no son iguales");
		}
			
		List<Animal> animales = new ArrayList<Animal>();
		animales.add(gallina);
		animales.add(pajaro);
		animales.add(leon);
		animales.forEach(e->System.out.println(e.toString()));  // Aquí hay polimorfismo.
		animales.forEach(e->System.out.println(e.rugido())); // Aquí también.
		
		System.out.println("Ejemplo instanceof:");
		for(Animal animal : animales) {
			// La siguiente línea fallaría en los animales que no fuesen Ave. Debe ponerse dentro de un if con el instanceof
			//System.out.println("El número de pollitos es: " + ((Ave)animal).pollitos(animal.getNombre()));
			if(animal instanceof Ave) {
				System.out.println("El número de pollitos es: " + ((Ave)animal).pollitos(animal.getNombre()));
				System.out.println(animal.rugido());
			} else if(animal instanceof Mamifero) {
				System.out.println(animal.rugido());
			}		
		}
			
		
	}
	
	public static void main(String[] args) {
		//ejemplosCoches();
		//ejercicio1();	
		//ejemploListaJugadores();
		//ejercicio2();
		//ejercicio3();
		//ejemploEquipos();
		//ejercicio4();
		ejemplosHerencias();
	}

}