package org.iesalixar.dto;

public class MatriculaDTO {
	private String nombreMatricula;
	private String apellidoMatricula;
	private String cursoMatricula;
	private String emailMatricula;
	
	/* CONSTRUCTOR */
	
	public MatriculaDTO() {
	}
	
	/* GETTER & SETTERS*/
	
	public String getNombre() {
		return nombreMatricula;
	}
	public void setNombre(String nombre) {
		this.nombreMatricula = nombre;
	}
	public String getApellido() {
		return apellidoMatricula;
	}
	public void setApellido(String apellido) {
		this.apellidoMatricula = apellido;
	}
	public String getCurso() {
		return cursoMatricula;
	}
	public void setCurso(String curso) {
		this.cursoMatricula = curso;
	}
	public String getEmail() {
		return emailMatricula;
	}
	public void setEmail(String email) {
		this.emailMatricula = email;
	}

}
