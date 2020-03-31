package com.tothenew.springbootrestfulday2assgn.Staticfiltering.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;

public class SmapleModel {

    String username;

    @JsonIgnore
    String password;

    public SmapleModel() {}

    public SmapleModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
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
