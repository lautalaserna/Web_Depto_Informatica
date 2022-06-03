package com.example.informatica.carrera.calendario;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICalendarioRepository extends JpaRepository<Calendario, Integer>{

	@Query("FROM Calendario ORDER BY fecha_inicio ASC")
	List<Calendario> findAll();
}
