package com.product.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    private String passwrd;
    private String email;

    public User(){

    }

    public User(String id, String name, String passwrd,String email){
        this.id=id;
        this.name=name;
        this.passwrd=passwrd;
        this.email=email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passwrd='" + passwrd + '\'' +
                ", email=" + email +
                '}';
    }
public String getId(){
        return id;
    }
public void setId(String id){
        this.id=id;
}
    public String getPasswrd() {
        return passwrd;
    }

    public void setPasswrd(String passwrd) {

        this.passwrd = passwrd;
    }

    public String getName() {

        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }







}
