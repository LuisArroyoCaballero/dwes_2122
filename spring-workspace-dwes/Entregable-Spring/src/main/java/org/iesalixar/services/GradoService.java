package org.iesalixar.services;

import java.util.List;
import java.util.Optional;

import org.iesalixar.model.Grado;

public interface GradoService {
	
	public List<Grado> getAllGrados();
	public Optional<Grado> findGradoById(Long id);
	public Grado addGrado(Grado grado);
	public Grado getGradoByName(String nombre);

}
