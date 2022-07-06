package com.example.informatica.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{

	@Query(value = "SELECT * FROM roles WHERE id_usuario = ?1",
		    nativeQuery = true)
	List<Rol> findRolesByUserId(int id_usuario);
}
