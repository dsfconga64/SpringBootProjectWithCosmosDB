package com.cenfotec.FincaProyecto.repository;

import java.util.List;


import org.springframework.data.repository.query.Param;

import com.cenfotec.FincaProyecto.domain.Empleado;
import com.cenfotec.FincaProyecto.domain.Finca;
import com.cenfotec.FincaProyecto.domain.Produccion;
import com.microsoft.azure.spring.data.cosmosdb.repository.ReactiveCosmosRepository;

public interface ProduccionRepository extends ReactiveCosmosRepository<Produccion, Long> {
	
	List<Produccion> findByIdFinca(Long idFinca);

}
