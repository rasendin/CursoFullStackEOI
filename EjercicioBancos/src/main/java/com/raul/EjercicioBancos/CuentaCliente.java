package com.raul.EjercicioBancos;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Una clase es un molde
 * Una instancia es la galleta
 *
 */
// Función constructor - se ejecuta cuando instancias una clase (con new)

public class CuentaCliente {

	private String dni;
	private String nombre;
	private String fechaNacimiento;
	private String codigoPostal;
	private double saldo;

	public CuentaCliente() {

	}

	public CuentaCliente(String dni, String nombre, String fechaNacimiento, String codigoPostal, double saldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.codigoPostal = codigoPostal;
		this.saldo = saldo;
	}

	public CuentaCliente(CuentaCliente c) {
		super();
		this.dni = c.dni;
		this.nombre = c.nombre;
		this.fechaNacimiento = c.fechaNacimiento;
		this.codigoPostal = c.codigoPostal;
		this.saldo = c.saldo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "CuentaCliente [dni=" + dni + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento
				+ ", codigoPostal=" + codigoPostal + ", saldo=" + saldo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaCliente other = (CuentaCliente) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre);
	}

	public String getLanguage() {

		// voy recorriendo cada línea del archivo que me dieron.

		Map<String, String> countryLanguage = new HashMap<String, String>();
		countryLanguage.put("UK", "en");
		countryLanguage.put("ES", "es");
		return countryLanguage.get(this.getCodigoPostal());

	}

}

