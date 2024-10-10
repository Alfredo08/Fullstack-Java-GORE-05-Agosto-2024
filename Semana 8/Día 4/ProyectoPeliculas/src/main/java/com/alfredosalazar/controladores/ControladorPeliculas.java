package com.alfredosalazar.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.alfredosalazar.modelos.Pelicula;
import com.alfredosalazar.servicios.ServicioPeliculas;

import jakarta.validation.Valid;

@Controller
public class ControladorPeliculas {
	@Autowired
	private final ServicioPeliculas servicioPeliculas;
	
	public ControladorPeliculas(ServicioPeliculas servicioPeliculas) {
		this.servicioPeliculas = servicioPeliculas;
	}
	
	@GetMapping("/peliculas")
	public String desplegarPeliculas(Model modelo) {
		List<Pelicula> peliculas = this.servicioPeliculas.obtenerTodas();
		modelo.addAttribute("peliculas", peliculas);
		return "peliculas.jsp";
	}
	
	@GetMapping("/formulario/pelicula")
	public String desplegarFormularioPelicula(@ModelAttribute Pelicula pelicula) {
		return "formularioPelicula.jsp";
	}
	
	@GetMapping("/detalle/pelicula/{id}")
	public String desplegarDetallePelicula(@PathVariable Long id,
										  Model modelo) {
		Pelicula  detallePelicula = this.servicioPeliculas.obtenerUno(id);
		modelo.addAttribute("detallePelicula", detallePelicula);
		return "detallePelicula.jsp";
	}
	
	@PostMapping("/agregar/pelicula")
	public String agregarPelicula(@Valid @ModelAttribute Pelicula pelicula, 
								  BindingResult validaciones) {
		if(validaciones.hasErrors()) {
			return "formularioPelicula.jsp";
		}
		/* TODO: validar que el título sea único */
		this.servicioPeliculas.agregarUna(pelicula);
		return "redirect:/peliculas";
	}
}
