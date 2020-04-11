package com.cenfotec.FincaProyecto.repository;

import java.util.List;


import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cenfotec.FincaProyecto.domain.Empleado;
import com.cenfotec.FincaProyecto.domain.Finca;
import com.cenfotec.FincaProyecto.domain.Produccion;
import com.microsoft.azure.spring.data.cosmosdb.repository.ReactiveCosmosRepository;

@Repository
public interface ProduccionRepository extends ReactiveCosmosRepository<Produccion, String> {
	
	List<Produccion> findByIdFinca(String idFinca);

}
