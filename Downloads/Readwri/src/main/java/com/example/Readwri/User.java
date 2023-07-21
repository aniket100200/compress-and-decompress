package com.example.Readwri;

public class User
{
    private Integer userId;

    private String name;

    private String country;
    private Integer age;
    private String emailId;
    private String mobNo;

    public Integer getUserId()
    {
        return userId;
    }

    public void setUserId(Integer userId)
    {
        this.userId = userId;
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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo)
    {
        this.mobNo = mobNo;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
