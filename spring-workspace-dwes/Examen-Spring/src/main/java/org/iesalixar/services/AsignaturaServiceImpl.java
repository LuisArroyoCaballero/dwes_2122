package org.iesalixar.services;

import java.util.ArrayList;
import java.util.List;

import org.iesalixar.model.Asignatura;
import org.iesalixar.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsignaturaServiceImpl implements AsignaturaService{
	
	@Autowired
	AsignaturaRepository asigRepo;

	@Override
	public List<Asignatura> getAllAsignatura() {
		// Obtengo el resultado a través del repositorio
				List<Asignatura> asigDB = asigRepo.findAll();

				// Verificando que he obtenido algo
				if (asigDB != null && asigDB.size() > 0) {

					return asigDB;
				}

				// No he obtenido nada devuelvo una lista vacía (para no devolver nulo)
				return new ArrayList<Asignatura>();
	}

}
