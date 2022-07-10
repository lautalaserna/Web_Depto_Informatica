package com.example.informatica.internas.docentes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDocentesRepository extends JpaRepository<Docentes, Integer>{

}
