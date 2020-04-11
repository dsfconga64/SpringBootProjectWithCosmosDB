package com.cenfotec.FincaProyecto.repository;



import com.cenfotec.FincaProyecto.domain.Finca;
import com.microsoft.azure.spring.data.cosmosdb.repository.ReactiveCosmosRepository;

public interface FincaRepository extends ReactiveCosmosRepository<Finca, String> {
	
	

}

