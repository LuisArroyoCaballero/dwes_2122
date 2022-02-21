package org.iesalixar.servidor.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.iesalixar.servidor.model.Profesor;
import org.iesalixar.servidor.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfesorServiceImpl implements ProfesorService {
	
	@Autowired
	ProfesorRepository profRepo;


	@Override
	public List<Profesor> getAllTeachers() {
		
		List<Profesor> profDB = profRepo.findAll();
		
		if (profDB != null && profDB.size() > 0) {
			return profDB;
		}
		
		return new ArrayList<Profesor>();
	}


	@Override
	public Optional<Profesor> findProfesorById(Long id) {
		Optional<Profesor> prof = null;
		
		if(id != null && id > 0) {
			prof = profRepo.findById(id);
		}
		
		return prof;
	}
	


}
