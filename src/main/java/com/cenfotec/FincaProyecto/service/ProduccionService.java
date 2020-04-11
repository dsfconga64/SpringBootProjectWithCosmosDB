package com.cenfotec.FincaProyecto.service;

import java.util.List;

import javax.validation.Valid;

import com.cenfotec.FincaProyecto.domain.Finca;
import com.cenfotec.FincaProyecto.domain.Produccion;

public interface ProduccionService {

	public void saveProduccion(Produccion newProduccion);
	public void deleteProduccionbyId(String produccionId);
	public List<Produccion> getAllProducciones();
	public List<Produccion> getProduccionesById(String produccionId);

}
