package com.alfredosalazar.clases;

import com.alfredosalazar.interfaces.FiguraGeometrica;

public class Circulo implements FiguraGeometrica {
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public void imprimeInformacion() {
		System.out.println("Figura geométrica: Círculo");
		System.out.println("Radio: " + this.radio);
		System.out.println("Perímetro: " + perimetro());
		System.out.println("Área: " + area());
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(this.radio, 2);
	}

	@Override
	public double perimetro() {
		return (2 * Math.PI) * this.radio;
	}
	
}
