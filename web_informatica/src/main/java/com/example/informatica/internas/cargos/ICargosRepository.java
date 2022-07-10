package com.example.informatica.internas.cargos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICargosRepository extends JpaRepository<Cargos, Integer>{

}
