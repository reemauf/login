package com.example.login;

public class user {
    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public user() {
    }

    public user(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
