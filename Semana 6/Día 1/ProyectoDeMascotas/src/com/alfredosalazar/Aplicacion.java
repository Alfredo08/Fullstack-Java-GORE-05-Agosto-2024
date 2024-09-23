package com.alfredosalazar;

import com.alfredosalazar.clases.Mascota;
import com.alfredosalazar.clases.Persona;

public class Aplicacion {
	public static void main(String args[]) {
		Persona julieta = new Persona("Julieta", "Salazar", 18);
		Persona alfredo = new Persona("Alfredo", "Salazar", 20);
		
		Mascota chetos = new Mascota("Chetos", "Gato", alfredo);
		Mascota jagger = new Mascota("Jagger", "Perro", julieta);
			
		chetos.imprimeInformacion();
		jagger.imprimeInformacion();
		
		// System.out.println("Mascota: " + chetos.getNombreMascota());
	}
}
