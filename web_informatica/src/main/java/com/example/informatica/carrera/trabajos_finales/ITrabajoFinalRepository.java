package com.example.informatica.carrera.trabajos_finales;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrabajoFinalRepository extends JpaRepository<TrabajoFinal, Integer>{

	@Query("FROM TrabajoFinal ORDER BY is_concluido DESC")
	List<TrabajoFinal> findAll();
}
