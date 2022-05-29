package com.example.informatica.carrera.trabajos_finales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrabajoFinalRepository extends JpaRepository<TrabajoFinal, Integer>{

}
