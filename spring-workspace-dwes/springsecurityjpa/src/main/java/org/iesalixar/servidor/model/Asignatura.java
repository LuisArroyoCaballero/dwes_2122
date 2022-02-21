package org.iesalixar.servidor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="asignatura")
public class Asignatura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String nombre;
	
	@Column(nullable = false)
	private float creditos;
	
	@Column(nullable = false)
	private String tipo;
	
	@Column(nullable = false)
	private int curso;
	
	@Column(nullable = false)
	private int cuatrimestre;
	
	@ManyToOne
	@JoinColumn(name="id_profesor", insertable=false, updatable=false, nullable=true)
	private Profesor profesor;
	
	@Column(nullable = false)
	private int id_grado;
	
	
	public Asignatura() {
		super();
	}

	
	
	public Long getId() {
		return id;
	}

	
	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getCreditos() {
		return creditos;
	}


	public void setCreditos(float creditos) {
		this.creditos = creditos;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getCurso() {
		return curso;
	}


	public void setCurso(int curso) {
		this.curso = curso;
	}


	public int getCuatrimestre() {
		return cuatrimestre;
	}


	public void setCuatrimestre(int cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}


	public Profesor getProfesor() {
		return profesor;
	}


	public void setId_profesor(Profesor profesor) {
		this.profesor= profesor;
	}


	public int getId_grado() {
		return id_grado;
	}


	public void setId_grado(int id_grado) {
		this.id_grado = id_grado;
	}

	
}
