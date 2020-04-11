package com.cenfotec.FincaProyecto.service;

import java.util.List;

import javax.validation.Valid;


import com.cenfotec.FincaProyecto.domain.Finca;

public interface FincaService {

	public void saveFinca(Finca newFinca);
	public void deleteFincabyId(String fincaId);
	public List<Finca> getAllFincas();
	public List<Finca> getFincasById(String FincaId);

}
