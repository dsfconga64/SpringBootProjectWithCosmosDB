package com.cenfotec.FincaProyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cenfotec.FincaProyecto.domain.Empleado;
import com.cenfotec.FincaProyecto.domain.Finca;
import com.cenfotec.FincaProyecto.domain.Produccion;

public interface ProduccionRepository extends JpaRepository<Produccion, Long> {
	
	List<Produccion> findByIdFinca(Long idFinca);

}
