package com.alfredosalazar.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alfredosalazar.modelos.Pelicula;

@Repository
public interface RepositorioPeliculas extends CrudRepository<Pelicula, Long> {

	/* SELECT *
	 * FROM peliculas;
	 */
	List<Pelicula> findAll();
	
	/* INSERT INTO peliculas
	 * VALUES(titulo, duracion, genero, imagenPortada)
	 */
	// Pelicula save(Pelicula p);
	
	/*
	 * SELECT *
	 * FROM peliculas
	 * WHERE id = id;
	 */
	// Pelicula findById(Long id);
}
