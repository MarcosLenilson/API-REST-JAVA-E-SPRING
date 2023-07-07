package com.estudouserdept.userdepart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudouserdept.userdepart.entities.User;

public interface UserRepositoty extends JpaRepository<User, Long>{
	
}
