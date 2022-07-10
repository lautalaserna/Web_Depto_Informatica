package com.example.informatica.internas.tipocarrera;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoCarreraRepository extends JpaRepository<TipoCarrera, Integer>{

}
