package com.example.informatica.novedades;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface INovedadesRepository extends JpaRepository<Novedades, Integer>{

	@Query(value = "SELECT * FROM novedades WHERE is_bolsa_trabajo = ?1 ORDER BY fecha DESC",
		    countQuery = "SELECT count(*) FROM novedades WHERE is_bolsa_trabajo = ?1",
		    nativeQuery = true)
	Page<Novedades> findAll(char c, Pageable pageable);
	
}
