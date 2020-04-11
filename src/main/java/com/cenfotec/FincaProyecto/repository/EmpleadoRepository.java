package com.cenfotec.FincaProyecto.repository;


import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cenfotec.FincaProyecto.domain.Empleado;
import com.microsoft.azure.spring.data.cosmosdb.repository.ReactiveCosmosRepository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends ReactiveCosmosRepository<Empleado, String> {
	
	List<Empleado> findByIdFinca(String idFinca);
	
    public List<Empleado> findEmployeeById(@Param("id") String id);

}