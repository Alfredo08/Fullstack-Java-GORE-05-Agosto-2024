package com.alfredosalazar.clases;

public class Estudiante extends Persona {
	private String curso;
	private int id;
	
	public Estudiante(String nombre, String apellidoPaterno, String apellidoMaterno, 
					  String nacionalidad, int edad, String curso, int id) {
		super(nombre, apellidoPaterno, apellidoMaterno, nacionalidad, edad);
		this.curso = curso;
		this.id = id;
	}
	
	@Override
	public void imprimeInformacion() {
		super.imprimeInformacion();
		System.out.println("Curso: " + this.curso);
		System.out.println("Id: " + this.id);	
	}

	public void imprimeInformacionEstudiante() {
		super.imprimeInformacion();
		System.out.println("Curso: " + this.curso);
		System.out.println("Id: " + this.id);
	}
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
