package com.domain;

import java.math.BigDecimal;

public class Customer {
    private String email;
    private String fname;
    private String minit;
    private String lname;
    private String phone;
    private String password;
    private BigDecimal streetno;
    private String streetname;
    private String city;
    private String state;
    private BigDecimal zip;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMinit() {
        return minit;
    }

    public void setMinit(String minit) {
        this.minit = minit;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getStreetno() {
        return streetno;
    }

    public void setStreetno(BigDecimal streetno) {
        this.streetno = streetno;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BigDecimal getZip() {
        return zip;
    }

    public void setZip(BigDecimal zip) {
        this.zip = zip;
    }
}

