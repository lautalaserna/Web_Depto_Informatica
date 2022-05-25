package com.example.informatica.institucional.investigacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInvestigacionRepository extends JpaRepository<Investigacion, Integer>{

}
