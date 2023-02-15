package poo1.ejercicio4h;

import java.util.Objects;

public class Empleado {
	
	private String nombre;
	private double salario;
	
	public Empleado() {
		
	}

	public Empleado(String nombre, double salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}
	
	public Empleado(Empleado e) {
		super();
		this.nombre = e.nombre;
		this.salario = e.salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre, salario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(salario) == Double.doubleToLongBits(other.salario);
	}

}