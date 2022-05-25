package com.example.informatica.institucional.autoridades;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConsejoAlumnosRepository extends JpaRepository<Consejo_Alumnos, Integer>{

}
