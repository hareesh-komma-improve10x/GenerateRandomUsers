package com.example.generaterandomusers.model;

import com.google.gson.annotations.SerializedName;

public class User {

    private String name;
    private Integer age;
    private String job;
    private Integer incomeUsd;
    private Integer creditScore;
    private String ccNumber;
    private Boolean married;
    private Boolean hasChildren;
    private Integer heightInCms;
    private Float weightInKgs;
    private String eyeColor;
    private String email;
    private String gender;
    private Boolean hasDegree;
    private String bloodType;
    private String username;
    private Float politicalLeaning;
    private String religion;

    public Address address;
    @SerializedName("doB")
    private String dob;

    private Float gpa;

    public User() {
    }

    public User(String name, Integer age, String job, Integer incomeUsd, Integer creditScore,
                String ccNumber, Boolean married, Boolean hasChildren, Integer heightInCms, Float weightInKgs,
                String eyeColor, String email, String gender, Boolean hasDegree, String bloodType,
                String username, Float politicalLeaning, String religion, Address address, String dob,
                Float gpa) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.incomeUsd = incomeUsd;
        this.creditScore = creditScore;
        this.ccNumber = ccNumber;
        this.married = married;
        this.hasChildren = hasChildren;
        this.heightInCms = heightInCms;
        this.weightInKgs = weightInKgs;
        this.eyeColor = eyeColor;
        this.email = email;
        this.gender = gender;
        this.hasDegree = hasDegree;
        this.bloodType = bloodType;
        this.username = username;
        this.politicalLeaning = politicalLeaning;
        this.religion = religion;
        this.address = address;
        this.dob = dob;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getIncomeUsd() {
        return incomeUsd;
    }

    public void setIncomeUsd(Integer incomeUsd) {
        this.incomeUsd = incomeUsd;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public Boolean getHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public Integer getHeightInCms() {
        return heightInCms;
    }

    public void setHeightInCms(Integer heightInCms) {
        this.heightInCms = heightInCms;
    }

    public Float getWeightInKgs() {
        return weightInKgs;
    }

    public void setWeightInKgs(Float weightInKgs) {
        this.weightInKgs = weightInKgs;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getHasDegree() {
        return hasDegree;
    }

    public void setHasDegree(Boolean hasDegree) {
        this.hasDegree = hasDegree;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Float getPoliticalLeaning() {
        return politicalLeaning;
    }

    public void setPoliticalLeaning(Float politicalLeaning) {
        this.politicalLeaning = politicalLeaning;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }
}
