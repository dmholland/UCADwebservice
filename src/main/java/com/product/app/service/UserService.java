package com.product.app.service;


import com.product.app.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
