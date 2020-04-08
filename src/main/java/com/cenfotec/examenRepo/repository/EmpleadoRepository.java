package com.cenfotec.examenRepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

import com.cenfotec.examenRepo.domain.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
	
	List<Empleado> findByIdFinca(long idFinca);
	@Query(value="SELECT * FROM empleado  where empleado_Id = :id",nativeQuery = true) 
    public List<Empleado> findEmployeeBiyId(@Param("id") Long id);

}