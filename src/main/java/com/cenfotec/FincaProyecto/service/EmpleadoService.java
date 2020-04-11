package com.cenfotec.FincaProyecto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cenfotec.FincaProyecto.domain.Empleado;


@Service
public interface EmpleadoService {

	
	public void saveEmpleado(Empleado newEmpleado);
	public void deleteEmpleadobyId(String empeladoId);
	public List<Empleado> getAllEmpleados();
	public List<Empleado> getEmpleadosById(String empeladoId);
	

}
