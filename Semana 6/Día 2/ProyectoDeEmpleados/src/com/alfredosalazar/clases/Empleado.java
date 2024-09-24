package com.alfredosalazar.clases;

public class Empleado {
	// Atributos de instancia
	private String nombre;
	private String apellido;
	private String puesto;
	private double salario;
	private int identificador;
	
	// Atributos estáticos
	private static int numDeEmpleados = 0;
	
	// Constructor
	public Empleado() {
		this.nombre = "N/A";
		this.apellido = "N/A";
		this.puesto = "N/A";
		this.salario = 0.0;
		this.identificador = -1;
		numDeEmpleados ++;
	}
	
	public Empleado(String nombre, String apellido, String puesto, double salario, int identificador) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.puesto = puesto;
		this.salario = salario;
		this.identificador = identificador;
		numDeEmpleados ++;
	}
	
	// Métodos de instancia
	public void imprimeInformacion() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		System.out.println("Identificador:" + this.identificador);
		System.out.println("Puesto: " + this.puesto);
		System.out.println("Salario: " + this.salario);
		System.out.println("----------");
	}
	
	public void aumentoDeSueldo(int porcentajeDeAumento) {
		this.salario = (1 + porcentajeDeAumento / 100.0) * this.salario;
	}
	
	public void aumentoDeSueldo(int porcentajeDeAumento, double bono) {
		this.salario = (1 + porcentajeDeAumento / 100.0) * this.salario + bono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	// Métodos estáticos
	public static int getNumDeEmpleados() {
		return numDeEmpleados;
	}

	public static void setNumDeEmpleados(int numDeEmpleados) {
		Empleado.numDeEmpleados = numDeEmpleados;
	}
	
}
