package com.cenfotec.FincaProyecto.repository;



import org.springframework.stereotype.Repository;

import com.cenfotec.FincaProyecto.domain.Empleado;
import com.microsoft.azure.spring.data.cosmosdb.repository.ReactiveCosmosRepository;



@Repository
public interface EmpleadoRepository extends ReactiveCosmosRepository<Empleado, String> {
	
	

}