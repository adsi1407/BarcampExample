package com.example.test.barcampexample.dtos;

/**
 * Created by DAVIDPORTATILW7 on 09/10/2015.
 */
public class User {

    private String id;
    private String name;
    private String password;
    private String phone;
    private String addess;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddess() {
        return addess;
    }

    public void setAddess(String addess) {
        this.addess = addess;
    }

    public User(String id, String name, String password, String phone, String address){
        this.id = id;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.addess = address;
    }

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }
}
