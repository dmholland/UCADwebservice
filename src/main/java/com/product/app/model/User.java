package com.product.app.model;

public class User {
    private String name;
    private String passwrd;
    private String email;

    public User(){

    }

    public User(String name, String passwrd,String email){
        this.name=name;
        this.passwrd=passwrd;
        this.email=email;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }







}
