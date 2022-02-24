package org.iesalixar.servidor.models;

import java.io.Serializable;

public class Usuario implements Serializable {

	private String usuario;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String role;
	
	public Usuario() {
		
	}

	public Usuario(String usuario, String email, String password, String firstName, String lastName, String role) {
		super();
		this.usuario = usuario;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	
}
