package com.product.app.repository;

import com.product.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    String getEmail(String username);
    String getPassword(String username);
}
