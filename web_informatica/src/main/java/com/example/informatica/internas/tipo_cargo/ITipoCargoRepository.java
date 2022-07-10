package com.example.informatica.internas.tipo_cargo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoCargoRepository extends JpaRepository<TipoCargo, Integer>{

}
