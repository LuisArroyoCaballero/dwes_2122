package org.iesalixar.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="grado")
public class Grado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique=true, nullable=false)
	private String nombre;
	
	@OneToMany(mappedBy="grado", cascade=CascadeType.ALL, orphanRemoval=true)
	private Set<Asignatura> asignaturas = new HashSet<Asignatura>();
	

	public Grado() {
		// TODO Auto-generated constructor stub
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
	
	public Set<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Set<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	
	
}
