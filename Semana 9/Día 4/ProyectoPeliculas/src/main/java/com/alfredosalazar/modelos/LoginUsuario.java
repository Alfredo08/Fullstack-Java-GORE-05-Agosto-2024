package com.alfredosalazar.modelos;

import jakarta.validation.constraints.NotBlank;

public class LoginUsuario {
	@NotBlank(message="Por favor proporciona tu correo.")
	private String correo;
	
	private String contrasenia;
	
	public LoginUsuario() {}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
}
