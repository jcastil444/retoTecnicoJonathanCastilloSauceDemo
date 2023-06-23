package com.sura.saucedemo.data;

public class User {
    private Integer id;
    private String userName;
    private String lastName;
    private String password;
    private String postalCode;

    public User(Integer id, String userName, String lastName, String password, String postalCode) {
        this.id = id;
        this.userName = userName;
        this.lastName = lastName;
        this.password = password;
        this.postalCode = postalCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String email) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
