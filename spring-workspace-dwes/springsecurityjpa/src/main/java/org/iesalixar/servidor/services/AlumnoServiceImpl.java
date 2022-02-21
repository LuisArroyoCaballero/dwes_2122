package org.iesalixar.servidor.services;

import java.util.ArrayList;
import java.util.List;

import org.iesalixar.servidor.model.Alumno;
import org.iesalixar.servidor.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	AlumnoRepository alumnoRepo;

	@Override
	public List<Alumno> getAllAlumns() {
		// Obtengo el resultado a través del repositorio
		List<Alumno> alumnDB = alumnoRepo.findAll();

		// Verificando que he obtenido algo
		if (alumnDB != null && alumnDB.size() > 0) {

			return alumnDB;
		}

		// No he obtenido nada devuelvo una lista vacía (para no devolver nulo)
		return new ArrayList<Alumno>();
	}

}
