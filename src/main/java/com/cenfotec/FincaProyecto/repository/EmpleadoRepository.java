package com.cenfotec.FincaProyecto.repository;


import org.springframework.data.repository.query.Param;

import com.cenfotec.FincaProyecto.domain.Empleado;
import com.microsoft.azure.spring.data.cosmosdb.repository.ReactiveCosmosRepository;

import java.util.List;

public interface EmpleadoRepository extends ReactiveCosmosRepository<Empleado, String> {
	
	List<Empleado> findByIdFinca(long idFinca);
	
    public List<Empleado> findEmployeeBiyId(@Param("id") Long id);

}