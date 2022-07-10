package com.example.informatica.internas.plan_estudio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlanEstudioRepository extends JpaRepository<PlanEstudio, Integer>{

}
