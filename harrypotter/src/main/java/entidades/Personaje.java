package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Personaje {

	private String id;
	private String name;
	private List<String> alternate_names;
	private String species;
	private String gender;
	private String house;
	private String dateOfBirth;
	private LocalDate dateOfBirthLD;
	private Integer yearOfBirth;
	private Boolean wizard;
	private String ancestry;
	private String eyeColour;
	private String hairColour;
	private Wand wand;
	private String patronus;
	private Boolean hogwartsStudent;
	private Boolean hogwartsStaff;
	private String actor;
	private List<String> alternate_actors;
	private Boolean alive;
	private String image;
	
	public Personaje() {
		alternate_names = new ArrayList<String>();
		alternate_actors = new ArrayList<String>();
	}

	public Personaje(String id, String name, List<String> alternate_names, String species, String gender, String house,
			String dateOfBirth, LocalDate dateOfBirthLD, Integer yearOfBirth, Boolean wizard, String ancestry,
			String eyeColour, String hairColour, Wand wand, String patronus, Boolean hogwartsStudent,
			Boolean hogwartsStaff, String actor, List<String> alternate_actors, Boolean alive, String image) {
		super();
		this.id = id;
		this.name = name;
		this.alternate_names = alternate_names;
		this.species = species;
		this.gender = gender;
		this.house = house;
		this.dateOfBirth = dateOfBirth;
		this.dateOfBirthLD = dateOfBirthLD;
		this.yearOfBirth = yearOfBirth;
		this.wizard = wizard;
		this.ancestry = ancestry;
		this.eyeColour = eyeColour;
		this.hairColour = hairColour;
		this.wand = wand;
		this.patronus = patronus;
		this.hogwartsStudent = hogwartsStudent;
		this.hogwartsStaff = hogwartsStaff;
		this.actor = actor;
		this.alternate_actors = alternate_actors;
		this.alive = alive;
		this.image = image;
	}

	public Personaje(String id, String name, List<String> alternate_names, String species, String gender, String house,
			String dateOfBirth, Integer yearOfBirth, Boolean wizard, String ancestry, String eyeColour,
			String hairColour, Wand wand, String patronus, Boolean hogwartsStudent, Boolean hogwartsStaff, String actor,
			List<String> alternate_actors, Boolean alive, String image) {
		super();
		this.id = id;
		this.name = name;
		this.alternate_names = alternate_names;
		this.species = species;
		this.gender = gender;
		this.house = house;
		this.dateOfBirth = dateOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.wizard = wizard;
		this.ancestry = ancestry;
		this.eyeColour = eyeColour;
		this.hairColour = hairColour;
		this.wand = wand;
		this.patronus = patronus;
		this.hogwartsStudent = hogwartsStudent;
		this.hogwartsStaff = hogwartsStaff;
		this.actor = actor;
		this.alternate_actors = alternate_actors;
		this.alive = alive;
		this.image = image;
		this.dateOfBirthLD = LocalDate.parse(dateOfBirth,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}
	
}
