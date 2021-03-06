package org.iesalixar.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.iesalixar.model.Grado;
import org.iesalixar.repository.GradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradoServiceImpl implements GradoService {

	@Autowired
	GradoRepository gradoRepo;

	@Override
	public List<Grado> getAllGrados() {
		// Obtengo el resultado a través del repositorio
		List<Grado> gradoBD = gradoRepo.findAll();

		// Verificando que he obtenido algo
		if (gradoBD != null && gradoBD.size() > 0) {

			return gradoBD;
		}

		// No he obtenido nada devuelvo una lista vacía (para no devolver nulo)
		return new ArrayList<Grado>();
	}

	@Override
	public Optional<Grado> findGradoById(Long id) {

		Optional<Grado> grado = null;

		if (id != null) {
			grado = gradoRepo.findById(id);
		}

		return grado;

	}

	@Override
	public Grado addGrado(Grado grado) {
		
		if (grado!=null && getGradoByName(grado.getNombre())==null) {
			Grado grdo = gradoRepo.save(grado);
			return grdo;
		}
		
		return null;
	}

	@Override
	public Grado getGradoByName(String nombre) {
		if (nombre!=null) {
			
			Grado grdo = gradoRepo.findByNombre(nombre);
			
			return grdo; 			
		}
		
		return null;
	}

}
