package com.alfredosalazar;

import com.alfredosalazar.clases.Estudiante;
import com.alfredosalazar.clases.Persona;

public class Aplicacion {

	public static void main(String[] args) {
		Persona alex = new Persona("Alejandro", "Miller", "Morales", "Chileno", 22);
		Estudiante martha = new Estudiante("Martha", "Gómez", "Santos", "Mexicana", 
											21, "Fundamentos de la Web", 12345);
		
		alex.imprimeInformacion();
		martha.imprimeInformacion();
	}

}
