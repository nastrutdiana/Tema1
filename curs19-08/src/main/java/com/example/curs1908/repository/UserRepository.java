package com.example.curs1908.repository;

import com.example.curs1908.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAllByName(String name);
}
