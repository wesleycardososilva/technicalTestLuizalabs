package com.wesley.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesley.webService.entities.User;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>{

    User findByNameAndPassword(String name, String password);
}
