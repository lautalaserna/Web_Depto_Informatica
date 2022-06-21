package com.example.informatica.carrera.graduados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IGraduadosRepository extends JpaRepository<Graduados, Integer>{

	@Query("FROM Graduados ORDER BY fecha DESC")
	List<Graduados> findAll();
}
