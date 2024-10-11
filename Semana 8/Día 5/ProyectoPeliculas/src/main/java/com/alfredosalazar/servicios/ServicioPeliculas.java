package com.alfredosalazar.servicios;

import java.util.List;

import org.eclipse.tags.shaded.org.apache.bcel.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfredosalazar.modelos.Pelicula;
import com.alfredosalazar.repositorios.RepositorioPeliculas;

@Service
public class ServicioPeliculas {
	
	@Autowired
	private final RepositorioPeliculas repositorioPeliculas;
	
	public ServicioPeliculas(RepositorioPeliculas repositorioPeliculas) {
		this.repositorioPeliculas = repositorioPeliculas;
	}
	
	public List<Pelicula> obtenerTodas(){
		return this.repositorioPeliculas.findAll();
	}
	
	public Pelicula agregarUna(Pelicula nuevaPelicula) {
		return this.repositorioPeliculas.save(nuevaPelicula);
	}
	
	public Pelicula obtenerUno(Long id) {
		return this.repositorioPeliculas.findById(id).orElse(null);
	}
	
	public void eliminarUno(Long id) {
		this.repositorioPeliculas.deleteById(id);
	}
	
	public Pelicula actualizarUna(Pelicula pelicula) {
		return this.repositorioPeliculas.save(pelicula);
	}
}
