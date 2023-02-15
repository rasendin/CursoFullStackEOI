package poo1.ejercicio4h;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empresa {
	
	private String nombre;
	private Direccion direccion;
	private List<Empleado> empleados;
	
	public Empresa() {
		// NO OLVIDAR DAR MEMORIA PARA ALMACENAR LOS DIFERENTES OBJETOS
		direccion = new Direccion();	// Si meto parámetros es darle valores por defecto, lo normal es dejarlo vacío
		empleados = new ArrayList<Empleado>();
	}

	public Empresa(String nombre, Direccion direccion, List<Empleado> empleados) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.empleados = empleados;
	}
	
	public Empresa(Empresa e) {
		super();
		this.nombre = e.nombre;
		this.direccion = new Direccion(e.direccion);
		this.empleados = new ArrayList<Empleado>();
		e.getEmpleados().forEach(emp->this.empleados.add(new Empleado(emp)));
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", direccion=" + direccion + ", empleados=" + empleados + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(direccion, empleados, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		return Objects.equals(direccion, other.direccion) && Objects.equals(empleados, other.empleados)
				&& Objects.equals(nombre, other.nombre);
	}
	
	
	
}
