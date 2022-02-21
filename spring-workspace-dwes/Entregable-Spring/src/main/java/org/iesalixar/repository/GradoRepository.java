package org.iesalixar.repository;

import java.util.Optional;

import org.iesalixar.model.Grado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradoRepository extends JpaRepository<Grado,Long>{

	public Optional<Grado> findById(Long id);
	public Grado findByNombre(String nombre);
	
}
