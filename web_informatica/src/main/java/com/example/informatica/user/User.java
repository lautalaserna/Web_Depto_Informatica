/*
package com.example.informatica.user;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.JoinColumn;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "usuarios", uniqueConstraints = @UniqueConstraint(columnNames = "username"))
public class User{

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
	
	@Column(name = "username")
    private String userName;
	
	@Column(name = "password")
    private String password;

    @ManyToMany 
    @JoinTable( 
        name = "roles_usuario",
        joinColumns = @JoinColumn(
          name = "id_usuario", referencedColumnName = "id_usuario"), 
        inverseJoinColumns = @JoinColumn(
          name = "id_rol", referencedColumnName = "id_rol")) 
    private Collection<UserRole> roles;
    
    
}
*/















