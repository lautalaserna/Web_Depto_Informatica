package com.example.informatica.novedades;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface INovedadesRepository extends JpaRepository<Novedades, Integer>{

	@Query("FROM Novedades WHERE is_bolsa_trabajo = ?1 ORDER BY fecha DESC")
	List<Novedades> findAll(char is_bolsa_trabajo);
	
}
