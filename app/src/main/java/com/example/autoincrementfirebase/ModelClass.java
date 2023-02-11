package com.example.autoincrementfirebase;

public class ModelClass {
    private String Name;
    private String Email;
    private String Password;
    public ModelClass(){

    }

    public void setName(String name) {
        Name = name;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }
}
