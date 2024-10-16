package com.alfredosalazar.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alfredosalazar.modelos.Director;

@Repository
public interface RepositorioDirectores extends CrudRepository<Director, Long>{
	List<Director> findAll();
	
	/*
	 * SELECT *
	 * FROM directores
	 * WHERE correo = correo AND contrasenia = contrasenia;
	 */
	Director findOneByCorreoAndContrasenia(String correo, String contrasenia);
}
