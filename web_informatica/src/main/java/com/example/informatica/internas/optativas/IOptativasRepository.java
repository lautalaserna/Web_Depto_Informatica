package com.example.informatica.internas.optativas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOptativasRepository extends JpaRepository<Optativas, Integer>{

}
