package org.iesalixar.servidor.model;

import java.io.Serializable;

public class Usuario implements Serializable {
	private String usuario;
	private String apellido;
	private String direccion;
	private int edad;
	private String[] aficiones;
	
	public Usuario() {
		super();
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String[] getAficiones() {
		return aficiones;
	}

	public void setAficiones(String[] aficiones) {
		this.aficiones = aficiones;
	}
	
	

}
