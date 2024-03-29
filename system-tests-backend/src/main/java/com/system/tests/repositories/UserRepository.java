package com.system.tests.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.tests.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
    public User findByUsername(String username); 

}
