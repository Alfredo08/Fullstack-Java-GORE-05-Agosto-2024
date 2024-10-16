package com.alfredosalazar.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.alfredosalazar.modelos.Director;
import com.alfredosalazar.modelos.LoginUsuario;
import com.alfredosalazar.servicios.ServicioDirectores;

import jakarta.validation.Valid;

@Controller
public class ControladorDirectores {
	@Autowired
	private final ServicioDirectores servicioDirectores;
	
	public ControladorDirectores(ServicioDirectores servicioDirectores) {
		this.servicioDirectores = servicioDirectores;
	}
	
	@GetMapping("/registro")
	public String desplegarRegistro(@ModelAttribute("nuevoDirector") Director nuevoDirector) {
		return "registro.jsp";
	}
	
	@PostMapping("/agregar/director")
	public String agregarDirector(@Valid @ModelAttribute("nuevoDirector") Director nuevoDirector,
								  BindingResult validaciones) {
		
		if(validaciones.hasErrors()) {
			return "registro.jsp";
		}
		// Agregar el director a la base de datos
		nuevoDirector = this.servicioDirectores.agregarUno(nuevoDirector);
		return "redirect:/peliculas";
	}
	
	@GetMapping("/login")
	public String desplegarLogin(@ModelAttribute LoginUsuario loginUsuario) {
		return "login.jsp";
	}
	
	@PostMapping("/procesa/login")
	public String procesaLogin(@Valid @ModelAttribute LoginUsuario loginUsuario,
							   BindingResult validaciones) {
		
		Director directorActual = this.servicioDirectores.obtenerUnoParaLogin(loginUsuario.getCorreo(), loginUsuario.getContrasenia());

		if(directorActual == null) {
			validaciones.rejectValue("contrasenia", "contraseniaNoCoincide", "Credenciales incorrectas.");
		}
		
		if(validaciones.hasErrors()) {
			return "login.jsp";
		}
		
		return "redirect:/peliculas";
		
	}
}
