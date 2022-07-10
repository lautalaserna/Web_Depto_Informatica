package com.example.informatica.internas.asignaturas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAsignaturasRepository extends JpaRepository<Asignaturas, Integer>{

}
