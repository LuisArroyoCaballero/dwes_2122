package org.iesalixar.servidor.model;

import java.io.Serializable;

public class Reserva implements Serializable{
	private String fechaInicio;
	private String fechaFin;
	private String numeroPersonas;
	private String[] checkbox;
	
	public Reserva() {
		super();
		
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getNumeroPersonas() {
		return numeroPersonas;
	}

	public void setNumeroPersonas(String numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}

	public String[] getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(String[] checkbox) {
		this.checkbox = checkbox;
	}
	
	
	
}
