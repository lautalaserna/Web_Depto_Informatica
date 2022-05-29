package com.example.informatica.carrera.graduados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGraduadosRepository extends JpaRepository<Graduados, Integer>{

}
