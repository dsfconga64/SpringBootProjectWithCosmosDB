package com.cenfotec.FincaProyecto.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cenfotec.FincaProyecto.domain.Empleado;
import com.cenfotec.FincaProyecto.repository.EmpleadoRepository;


@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	EmpleadoRepository repo;
	
	@Override
	public void saveEmpleado(Empleado newEmpleado) {
		repo.save(newEmpleado);
		
	}

	@Override
	public void deleteEmpleadobyId(String empleadoId) {
		repo.deleteById(empleadoId);
		
	}

	@Override
	public List<Empleado> getAllEmpleados() {
		return (List<Empleado>) repo.findAll();
	}

	@Override
	public List<Empleado> getEmpleadosById(String empeladoId) {
		// TODO Auto-generated method stub
		return (List<Empleado>) repo.findById(empeladoId);
	}

}
