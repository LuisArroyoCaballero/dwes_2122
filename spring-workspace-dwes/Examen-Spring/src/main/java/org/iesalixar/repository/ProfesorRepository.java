package org.iesalixar.repository;

import java.util.Optional;

import org.iesalixar.model.Grado;
import org.iesalixar.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor,Long> {

	public Optional<Profesor> findById(Long id);
	public Profesor findByNombre(String nombre);
}
