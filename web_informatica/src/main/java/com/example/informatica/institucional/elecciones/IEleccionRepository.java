package com.example.informatica.institucional.elecciones;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEleccionRepository extends JpaRepository<Eleccion, Integer>{

}
