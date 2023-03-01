package entidades;

import java.util.Objects;

/* Esto es una varita en el universo Harry Potter */
public class Wand {

	private String wood;
	private String core;
	private Double length;
	
	public Wand() {
		
	}

	public Wand(String wood, String core, Double length) {
		super();
		this.wood = wood;
		this.core = core;
		this.length = length;
	}

	public String getWood() {
		return wood;
	}

	public void setWood(String wood) {
		this.wood = wood;
	}

	public String getCore() {
		return core;
	}

	public void setCore(String core) {
		this.core = core;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Wand [wood=" + wood + ", core=" + core + ", length=" + length + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(core, length, wood);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wand other = (Wand) obj;
		return Objects.equals(core, other.core) && Objects.equals(length, other.length)
				&& Objects.equals(wood, other.wood);
	}
	
}


