package com.example.movies.model;

import jakarta.persistence.*;

@Entity
@Table(name="user_details")
public class User {

    @Id
    @Column(name="user_name")
    private String userName;

    @Column(name="password")
    private String password;

    @Column(name="uuid")
    private String uuid;
    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
