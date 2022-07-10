package com.example.informatica.internas.carreras;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarrerasRepository extends JpaRepository<Carreras, Integer>{

}
