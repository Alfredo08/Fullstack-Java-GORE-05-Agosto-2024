package com.alfredosalazar.clases;

public class Debito extends TarjetaBancaria{

	private String nombreDelCliente;
	private double sueldo;
	private String numeroTarjeta;
	
	public Debito(String nombreDelCliente, double sueldo, String numeroTarjeta) {
		this.nombreDelCliente = nombreDelCliente;
		this.sueldo = sueldo;
		this.numeroTarjeta = numeroTarjeta;
	}
	
	@Override
	public void imprimeInformacion() {
		despliegaNombreDelBanco();
		System.out.println("Tarjeta de débito.");
		System.out.println("Nombre del cliente: " + this.nombreDelCliente);
		System.out.println("Número de la tarjeta: " + this.numeroTarjeta);
		System.out.println("Balance: " + this.sueldo);
	}
	

	@Override
	public void despositar(double cantidad) {
		this.sueldo += cantidad;
	}

	@Override
	public boolean retirar(double cantidad) {
		if(cantidad < this.sueldo) {
			this.sueldo -= cantidad;
			System.out.println("Fondos retirados exitosamente: $" + cantidad);
			return true;
		}
		else {
			System.out.println("Fondos insuficientes, no se puede retirar esa cantidad.");
			return false;
		}
	}

}
