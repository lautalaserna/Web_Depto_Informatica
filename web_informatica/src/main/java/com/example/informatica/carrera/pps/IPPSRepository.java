package com.example.informatica.carrera.pps;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IPPSRepository extends JpaRepository<PPS, Integer>{

	@Query("FROM PPS WHERE estado = ?1 ORDER BY fecha_inicio DESC")
	List<PPS> findAll(char estado);
}
