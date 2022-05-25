package com.example.informatica.institucional.autoridades;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutoridadRepository extends JpaRepository<Autoridad, Integer>{

}
