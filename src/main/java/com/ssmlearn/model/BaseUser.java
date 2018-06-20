package com.ssmlearn.model;

import java.util.Date;

public class BaseUser {

/*CREATE TABLE user (
    id INT(11) AUTO_INCREMENT PRIMARY KEY ,
    username VARCHAR(20) NOT NULL ,
    password VARCHAR(50) NOT NULL ,
    gender VARCHAR(50) NOT NULL ,
    borthday DATE NOT NULL ,
    email VARCHAR(255) NOT NULL UNIQUE,
    edu VARCHAR(255) ,
    school VARCHAR(255) ,
    location VARCHAR(255) ,
    height VARCHAR(50) ,
    weight VARCHAR(50) ,
    married BOOLEAN ,
    hidden BOOLEAN ,
    phone VARCHAR(255) UNIQUE ,
    qq VARCHAR(255) UNIQUE ,
    underwrite VARCHAR(255)
);*/

    private String username;
    private String password;
    private String gender;
    private Date borthday;
    private String email;
    private String edu;
    private String school;
    private String location;
    private String height;
    private String weight;
    private boolean married;
    private boolean hidden;
    private String phone;
    private String qq;
    private String underwrite;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBorthday() {
        return borthday;
    }

    public void setBorthday(Date borthday) {
        this.borthday = borthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getUnderwrite() {
        return underwrite;
    }

    public void setUnderwrite(String underwrite) {
        this.underwrite = underwrite;
    }
}
