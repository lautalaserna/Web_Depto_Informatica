package com.example.informatica.institucional.docente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDocenteRepository extends JpaRepository<Docente, Integer>{

}
