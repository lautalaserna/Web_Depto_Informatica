package com.example.informatica.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer>{

	@Query(value = "SELECT * FROM usuarios WHERE username = ?1",
		    nativeQuery = true)
	User findByUsername(String username);

}
