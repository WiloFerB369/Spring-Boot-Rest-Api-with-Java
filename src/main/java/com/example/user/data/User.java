package com.example.user.data;

import java.util.Date;

public class User {

    //Attributes
    private String id;

    private String name;

    private String lastName;

    private String email;

    private Date createdAt;

    public User(String id, String name, String lastName, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.createdAt = new Date();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setId(String id) {
        this.id = id;
    }

}
