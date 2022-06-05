package com.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
