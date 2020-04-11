package com.cenfotec.FincaProyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cenfotec.FincaProyecto.domain.Finca;
import com.cenfotec.FincaProyecto.repository.FincaRepository;

import reactor.core.publisher.Flux;

@Service
public class FincaServiceImpl implements FincaService {

	@Autowired
	FincaRepository repo;
	
	@Override
	public void saveFinca(Finca newFinca) {
		
		repo.save(newFinca);
		
	}

	@Override
	public void deleteFincabyId(String fincaId) {
	
		repo.deleteById(fincaId);
		
	}

	@Override
	public List<Finca> getAllFincas() {
			
		return (List<Finca>) repo.findAll();
	}

	@Override
	public List<Finca> getFincasById(String FincaId) {
		
		return (List<Finca>) repo.findById(FincaId);
	}

}
