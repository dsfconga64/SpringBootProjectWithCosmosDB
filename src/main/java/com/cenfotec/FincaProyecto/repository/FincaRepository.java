package com.cenfotec.FincaProyecto.repository;



import org.springframework.stereotype.Repository;

import com.cenfotec.FincaProyecto.domain.Finca;
import com.microsoft.azure.spring.data.cosmosdb.repository.ReactiveCosmosRepository;

@Repository
public interface FincaRepository extends ReactiveCosmosRepository<Finca, String> {
	
	

}

