package com.example.informatica.internas.areas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAreasRepository extends JpaRepository<Areas, Integer>{

}
