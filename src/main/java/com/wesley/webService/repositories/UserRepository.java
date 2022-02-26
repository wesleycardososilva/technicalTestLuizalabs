package com.wesley.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesley.webService.entities.User;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>{

    @Query("select u from User u where u.name = ?2 and u.password = ?3")
    Optional<User> findByLastnameOrFirstname(String name, String password);
}
