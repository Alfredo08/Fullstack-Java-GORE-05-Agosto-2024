package com.alfredosalazar.controladores;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alfredosalazar.modelos.Certificado;

@Controller
public class Inicio {
	
	public static ArrayList<String> lenguajesProgramacion = new ArrayList<String>();
	
	public Inicio() {
		lenguajesProgramacion.add("Java");
		lenguajesProgramacion.add("Python");
		lenguajesProgramacion.add("HTML");
		lenguajesProgramacion.add("Node");
		lenguajesProgramacion.add("C#");
	}
	
	@GetMapping("/inicio")
	public String inicio(Model modelo) {
		
		modelo.addAttribute("edad", 24);
		modelo.addAttribute("nombre", "Alex");
		modelo.addAttribute("lenguajesProgramacion", lenguajesProgramacion);
		
		Certificado certificadoJava = new Certificado("Certificación de Java", "Coding Dojo");
		modelo.addAttribute("certificadoJava", certificadoJava);
		
		return "index.jsp";
	}
	
	@GetMapping("/nuevo/lenguaje")
	public String agregarLenguaje() {
		return "nuevoLenguaje.jsp";
	}
	
	@PostMapping("/agregar/lenguaje")
	public String procesarAgregarLenguaje(@RequestParam String nuevoLenguaje) {
		lenguajesProgramacion.add(nuevoLenguaje);
		return "redirect:/inicio";
	}
}
