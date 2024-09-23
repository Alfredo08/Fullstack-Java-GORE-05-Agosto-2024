package com.alfredosalazar.clases;

public class Mascota {
	// Atributos
	private String nombreMascota;
	private String tipoMascota;
	private Persona duenio;
	
	// Constructor
	public Mascota(String nombreMascota, String tipoMascota, Persona duenio) {
		this.nombreMascota = nombreMascota;
		this.tipoMascota = tipoMascota;
		this.duenio = duenio;
	}
	
	// Método de instancia
	public void imprimeInformacion() {
		System.out.println("Nombre: " + this.nombreMascota);
		System.out.println("Tipo: " + this.tipoMascota);
		System.out.println("Dueño:");
		this.duenio.imprimeInformacion();
		System.out.println("----------");
	}
	
	// Getters y setters (métodos de acceso y modificación)
	public String getNombreMascota() {
		return this.nombreMascota;
	}
	
	public void setNombreMascota(String nuevoNombre) {
		this.nombreMascota = nuevoNombre;
	}

	public String getTipoMascota() {
		return tipoMascota;
	}

	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}

	public Persona getNombreDuenio() {
		return duenio;
	}

	public void setNombreDuenio(Persona duenio) {
		this.duenio = duenio;
	}
}


