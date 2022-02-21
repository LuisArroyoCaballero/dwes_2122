package org.iesalixar.servidor.services;

import java.util.ArrayList;
import java.util.Optional;

import org.iesalixar.servidor.model.Asignatura;
import org.iesalixar.servidor.model.Departamento;
import org.iesalixar.servidor.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsignaturaServiceImpl implements AsignaturaService {

	@Autowired
	AsignaturaRepository asignaturaRepo;

	@Override
	public ArrayList<Asignatura> getAllAsignatura() {

		ArrayList<Asignatura> asignaturasBD = (ArrayList<Asignatura>) asignaturaRepo.findAll();

		if (asignaturasBD != null && asignaturasBD.size() > 0) {

			return asignaturasBD;
		}

		return new ArrayList<Asignatura>();
	}

	

}
