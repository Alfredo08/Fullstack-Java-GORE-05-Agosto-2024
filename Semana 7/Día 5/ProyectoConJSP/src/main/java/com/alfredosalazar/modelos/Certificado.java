package com.alfredosalazar.modelos;

public class Certificado {
	private String nombre;
	private String institucion;
	
	public Certificado(String nombre, String institucion) {
		this.nombre = nombre;
		this.institucion = institucion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	
 }
