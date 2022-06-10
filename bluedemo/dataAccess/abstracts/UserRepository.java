package com.blue.it.bluedemo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blue.it.bluedemo.entities.concretes.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
