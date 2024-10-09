package com.alfredosalazar.servicios;

import java.util.List;

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
}
