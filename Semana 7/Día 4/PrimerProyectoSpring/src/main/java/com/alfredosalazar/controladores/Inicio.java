package com.alfredosalazar.controladores;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Inicio {
	
	private static HashMap<Integer, String> alumnos = new HashMap<Integer, String>();
	
	public Inicio() {
		alumnos.put(123, "Alex Miller");
		alumnos.put(456, "Martha Gómez");
		alumnos.put(789, "Alan Morales");
	}
	
	// http:localhost:8080/incio
	@GetMapping("/inicio")
	public String holaGrupo() {
		System.out.println("Ejecutando la ruta de /inicio");
		return "Bienvenidos al curso de aplicaciones con SpringBoot";
	}
	
	@GetMapping("/saludo/{nombre}/{apellidoPaterno}/{apellidoMaterno}")
	public String mostrarSaludo(@PathVariable("nombre") String nombre,
								@PathVariable("apellidoPaterno") String apellidoPaterno,
								@PathVariable("apellidoMaterno") String apellidoMaterno) {
		System.out.println(nombre);
		return "Hola, bienvenid@ de vuelta " + nombre + " " + apellidoPaterno + " " +
				apellidoMaterno;
	}
	
	@GetMapping("/saludo/{nombre}")
	public String mostrarSaludo(@PathVariable("nombre") String nombre) {
		System.out.println(nombre);
		return "Hola, bienvenid@ de vuelta " + nombre;
	}
	
	@GetMapping("/alumnos/{id}")
	public String buscarPorId(@PathVariable("id") int id) {
		if(alumnos.get(id) == null) {
			return "El id de ese alumno no se encuentra en nuestra lista";
		}
		return "Estás buscando la información de " + alumnos.get(id);
	}
}
