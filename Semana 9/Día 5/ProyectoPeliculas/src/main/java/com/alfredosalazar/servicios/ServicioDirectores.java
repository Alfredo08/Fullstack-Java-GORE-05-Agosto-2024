package com.alfredosalazar.servicios;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.alfredosalazar.modelos.Director;
import com.alfredosalazar.modelos.LoginUsuario;
import com.alfredosalazar.repositorios.RepositorioDirectores;

import jakarta.servlet.http.HttpSession;

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
		String contraseniaEncriptada = BCrypt.hashpw(nuevoDirector.getContrasenia(), BCrypt.gensalt());
		nuevoDirector.setContrasenia(contraseniaEncriptada);
		return this.repositorioDirectores.save(nuevoDirector);
	}
	
	public Director obtenerUnoParaLogin(String correo) {
		return this.repositorioDirectores.findOneByCorreo(correo);
	}
	
	public BindingResult validarLogin(BindingResult validaciones, 
									  LoginUsuario loginUsuario,
									  HttpSession sesion
			) {
		Director directorActual = this.obtenerUnoParaLogin(loginUsuario.getCorreo());
		if(directorActual == null) {
			validaciones.rejectValue("contrasenia", "contraseniaNoCoincide", "Credenciales incorrectas.");
		}
		else {
			if(! BCrypt.checkpw(loginUsuario.getContrasenia(), directorActual.getContrasenia())) {
				validaciones.rejectValue("contrasenia", "contraseniaNoCoincide", "Credenciales incorrectas.");
			}
			else {
				sesion.setAttribute("id_director", directorActual.getId());
				sesion.setAttribute("nombre_director", directorActual.getNombre() + " " + directorActual.getApellidos());
			}
		}
		return validaciones;
	}
}
