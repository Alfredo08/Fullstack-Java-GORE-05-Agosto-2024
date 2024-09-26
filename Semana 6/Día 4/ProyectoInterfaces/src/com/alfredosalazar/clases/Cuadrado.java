package com.alfredosalazar.clases;

import com.alfredosalazar.interfaces.FiguraGeometrica;

public class Cuadrado implements FiguraGeometrica{
	private int numDeLados;
	private double longitud;
	
	public Cuadrado(double longitud) {
		this.numDeLados = 4;
		this.longitud = longitud;
	}

	@Override
	public void imprimeInformacion() {
		System.out.println("Figura geométrica: Cuadrado");
		System.out.println("Número de lados: " + this.numDeLados);
		System.out.println("Longitud: " + this.longitud);
		System.out.println("Perímetro: " + perimetro());
		System.out.println("Área: " + area());
		
	}

	@Override
	public double area() {
		return this.longitud * this.longitud;
	}

	@Override
	public double perimetro() {
		return this.longitud * 4;
	}
}
