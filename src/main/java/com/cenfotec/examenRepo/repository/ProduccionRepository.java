package com.cenfotec.examenRepo.repository;

import com.cenfotec.examenRepo.domain.Empleado;
import com.cenfotec.examenRepo.domain.Finca;
import com.cenfotec.examenRepo.domain.Produccion;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProduccionRepository extends JpaRepository<Produccion, Long> {
	
	List<Produccion> findByIdFinca(Long idFinca);

}
