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

import jakarta.servlet.http.HttpSession;
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
								  BindingResult validaciones,
								  HttpSession sesion) {
		
		if(validaciones.hasErrors()) {
			return "registro.jsp";
		}
		// Agregar el director a la base de datos
		nuevoDirector = this.servicioDirectores.agregarUno(nuevoDirector);
		sesion.setAttribute("id_director", nuevoDirector.getId());
		sesion.setAttribute("nombre_director", nuevoDirector.getNombre() + " " + nuevoDirector.getApellidos());
		return "redirect:/peliculas";
	}
	
	@GetMapping("/login")
	public String desplegarLogin(@ModelAttribute LoginUsuario loginUsuario) {
		return "login.jsp";
	}
	
	@PostMapping("/procesa/login")
	public String procesaLogin(@Valid @ModelAttribute LoginUsuario loginUsuario,
							   BindingResult validaciones,
							   HttpSession sesion) {
		
		validaciones = this.servicioDirectores.validarLogin(validaciones, loginUsuario, sesion);
		if(validaciones.hasErrors()) {
			return "login.jsp";
		}
		
		return "redirect:/peliculas";
	}
	
	@GetMapping("/cerrar_sesion")
	public String procesaCerrarSesion(HttpSession sesion) {
		sesion.invalidate();
		return "redirect:/login";
	}
}
