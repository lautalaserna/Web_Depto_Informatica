package com.example.informatica.novedades;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface INovedadesRepository extends JpaRepository<Novedades, Integer>{
	
}
