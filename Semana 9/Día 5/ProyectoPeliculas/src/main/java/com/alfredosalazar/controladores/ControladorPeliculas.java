package com.alfredosalazar.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alfredosalazar.modelos.Director;
import com.alfredosalazar.modelos.Pelicula;
import com.alfredosalazar.servicios.ServicioDirectores;
import com.alfredosalazar.servicios.ServicioPeliculas;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class ControladorPeliculas {
	@Autowired
	private final ServicioPeliculas servicioPeliculas;
	private final ServicioDirectores servicioDirectores;
	
	public ControladorPeliculas(ServicioPeliculas servicioPeliculas,
								ServicioDirectores servicioDirectores) {
		this.servicioPeliculas = servicioPeliculas;
		this.servicioDirectores = servicioDirectores;
	}
	
	@GetMapping("/peliculas")
	public String desplegarPeliculas(Model modelo, HttpSession sesion) {
		if(sesion.getAttribute("id_director") == null) {
			return "redirect:/login";
		}
		List<Pelicula> peliculas = this.servicioPeliculas.obtenerTodas();
		modelo.addAttribute("peliculas", peliculas);
		return "peliculas.jsp";
	}
	
	@GetMapping("/formulario/pelicula")
	public String desplegarFormularioAgregarPelicula(@ModelAttribute Pelicula pelicula,
													 HttpSession sesion) {
		if(sesion.getAttribute("id_director") == null) {
			return "redirect:/login";
		}
		return "formularioPelicula.jsp";
	}
	
	@GetMapping("/detalle/pelicula/{id}")
	public String desplegarDetallePelicula(@PathVariable Long id,
										  Model modelo,
										  HttpSession sesion) {
		if(sesion.getAttribute("id_director") == null) {
			return "redirect:/login";
		}
		Pelicula  detallePelicula = this.servicioPeliculas.obtenerUno(id);
		modelo.addAttribute("detallePelicula", detallePelicula);
		return "detallePelicula.jsp";
	}
	
	@PostMapping("/agregar/pelicula")
	public String agregarPelicula(@Valid @ModelAttribute Pelicula pelicula, 
								  BindingResult validaciones,
								  HttpSession sesion) {
		if(validaciones.hasErrors()) {
			return "formularioPelicula.jsp";
		}
		Long id_director = (Long)sesion.getAttribute("id_director");
		Director director = this.servicioDirectores.obtenerUno(id_director);
		pelicula.setDirector(director);
		/* TODO: validar que el título sea único */
		this.servicioPeliculas.agregarUna(pelicula);
		return "redirect:/peliculas";
	}
	
	@DeleteMapping("/eliminar/pelicula/{id}")
	public String eliminarPelicula(@PathVariable Long id) {
		this.servicioPeliculas.eliminarUno(id);
		return "redirect:/peliculas";
	}
	
	@GetMapping("/formulario/editar/pelicula/{id}")
	public String desplegarFormularioEditarPelicula(@ModelAttribute Pelicula pelicula,
												    @PathVariable Long id,
												    Model modelo,
												    HttpSession sesion) {
		if(sesion.getAttribute("id_director") == null) {
			return "redirect:/login";
		}
		pelicula = this.servicioPeliculas.obtenerUno(id);
		modelo.addAttribute("pelicula", pelicula);
		
		return "formularioEditarPelicula.jsp";
	}
	
	@PutMapping("/actualizar/pelicula/{id}")
	public String actualizarPelicula(@Valid @ModelAttribute Pelicula pelicula,
									 BindingResult validaciones,
									 @PathVariable Long id) {
		if(validaciones.hasErrors()) {
			return "formularioEditarPelicula.jsp";
		}
		
		this.servicioPeliculas.actualizarUna(pelicula);
		return "redirect:/peliculas";
	}
	
}
