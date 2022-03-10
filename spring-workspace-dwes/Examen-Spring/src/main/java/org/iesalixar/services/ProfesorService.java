package org.iesalixar.services;

import java.util.List;
import java.util.Optional;

import org.iesalixar.model.Profesor;

public interface ProfesorService {
	
	public List<Profesor> getAllProfesor();
	public Optional<Profesor> findProfesorById(Long id);
	public Profesor addProfesor(Profesor profesor);
	public Profesor getProfesorByName(String nombre);

}
