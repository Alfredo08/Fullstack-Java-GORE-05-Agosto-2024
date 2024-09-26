package com.alfredosalazar;

import com.alfredosalazar.clases.Circulo;
import com.alfredosalazar.clases.Cuadrado;

public class Aplicacion {

	public static void main(String[] args) {
		Cuadrado cuadro1 = new Cuadrado(40.0);
		Circulo circulo1 = new Circulo(25.0);
		
		cuadro1.imprimeInformacion();
		circulo1.imprimeInformacion();

	}

}
