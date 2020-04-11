package com.cenfotec.FincaProyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cenfotec.FincaProyecto.domain.Produccion;
import com.cenfotec.FincaProyecto.repository.ProduccionRepository;

@Service
public class ProduccionServiceImpl implements ProduccionService {

	@Autowired
	ProduccionRepository repo;
	
	@Override
	public void saveProduccion(Produccion newProduccion) {
		
		repo.save(newProduccion);
	}

	@Override
	public void deleteProduccionbyId(String produccionId) {

		repo.deleteById(produccionId);
	}

	@Override
	public List<Produccion> getAllProducciones() {
		return (List<Produccion>) repo.findAll();
	}

	@Override
	public List<Produccion> getProduccionesById(String produccionId) {
		return (List<Produccion>) repo.findById(produccionId);
	}

}
