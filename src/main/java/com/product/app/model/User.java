package com.product.app.model;

import io.swagger.models.auth.In;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//All getters and setters are now instance variables
     InstanceVariable<Long> id;
     InstanceVariable<String> userName;
     InstanceVariable<String> email;
     InstanceVariable<String> password;
     InstanceVariable<Integer> phone;


    @Transient
    private String passwordConfirm;

    @ManyToMany
    private Set<Role> roles;


}
