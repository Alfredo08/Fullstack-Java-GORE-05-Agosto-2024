package com.alfredosalazar.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfredosalazar.modelos.Director;
import com.alfredosalazar.repositorios.RepositorioDirectores;

@Service
public class ServicioDirectores {
	@Autowired
	private final RepositorioDirectores repositorioDirectores;
	
	public ServicioDirectores(RepositorioDirectores repositorioDirectores) {
		this.repositorioDirectores = repositorioDirectores;
	}
	
	public Director obtenerUno(Long id_director) {
		return this.repositorioDirectores.findById(id_director).orElse(null);
	}
	
	public Director agregarUno(Director nuevoDirector) {
		return this.repositorioDirectores.save(nuevoDirector);
	}
	
	public Director obtenerUnoParaLogin(String correo, String contrasenia) {
		return this.repositorioDirectores.findOneByCorreoAndContrasenia(correo, contrasenia);
	}
}
