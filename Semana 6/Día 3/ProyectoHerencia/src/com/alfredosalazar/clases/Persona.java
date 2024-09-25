package com.alfredosalazar.clases;

public class Persona {
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String nacionalidad;
	private int edad;
	
	public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String nacionalidad, int edad) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
	}
	
	public void imprimeInformacion() {
		System.out.println("Nombre completo: " + this.nombre + " " + 
						   this.apellidoPaterno + " " + this.apellidoMaterno);
		System.out.println("Nacionalidad: " + this.nacionalidad);
		System.out.println("Edad: " + this.edad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
