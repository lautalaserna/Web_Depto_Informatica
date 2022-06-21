package com.example.informatica.institucional.elecciones;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IEleccionRepository extends JpaRepository<Eleccion, Integer>{

	@Query("FROM Eleccion ORDER BY votos DESC")
	List<Eleccion> findAll();
}
