package com.example.thefoodcart.repository;

import com.example.thefoodcart.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmailAndPassword(String email, String password);
}
