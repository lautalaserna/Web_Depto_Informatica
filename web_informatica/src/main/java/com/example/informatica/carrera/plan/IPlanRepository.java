package com.example.informatica.carrera.plan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlanRepository extends JpaRepository<Plan, Integer>{

}
