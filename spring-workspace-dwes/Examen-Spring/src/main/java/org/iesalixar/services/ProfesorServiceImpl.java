package org.iesalixar.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.iesalixar.model.Profesor;
import org.iesalixar.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfesorServiceImpl implements ProfesorService {

	@Autowired
	ProfesorRepository profRepo;

	@Override
	public List<Profesor> getAllProfesor() {
		// Obtengo el resultado a través del repositorio
		List<Profesor> profDB = profRepo.findAll();

		// Verificando que he obtenido algo
		if (profDB != null && profDB.size() > 0) {

			return profDB;
		}

		// No he obtenido nada devuelvo una lista vacía (para no devolver nulo)
		return new ArrayList<Profesor>();
	}

	@Override
	public Optional<Profesor> findProfesorById(Long id) {

		Optional<Profesor> profesor = null;

		if (id != null) {
			profesor = profRepo.findById(id);
		}

		return profesor;

	}

	@Override
	public Profesor addProfesor(Profesor profesor) {
		if (profesor != null && getProfesorByName(profesor.getNombre()) == null) {
			Profesor grdo = profRepo.save(profesor);
			return grdo;
		}

		return null;
	}

	@Override
	public Profesor getProfesorByName(String nombre) {
		if (nombre != null) {

			Profesor prof = profRepo.findByNombre(nombre);

			return prof;
		}

		return null;
	}

}
