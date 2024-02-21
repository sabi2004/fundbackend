package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fund {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_Id;
    private String user_Name;
    private int age;
    private String sector;
    private long phonenumber;
    private String email_id;

    public Fund()
    {

    }

    public Fund(int user_Id , String user_Name,int age,String sector,long phonenumber,String email_id)
    {
        this.user_Id=user_Id;
        this.user_Name=user_Name;
        this.age=age;
        this.sector=sector;
        this.phonenumber=phonenumber;
        this.email_id=email_id;
    }

    public int getUserId()
    {
        return user_Id;
    }
    public void setUserId(int user_Id)
    {
        this.user_Id=user_Id;
    }
    public String getUserName()
    {
        return user_Name;
    }
    public void setUserName(String user_Name)
    {
        this.user_Name=user_Name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getSector()
    {
        return sector;
    }
    public void setSector(String sector)
    {
        this.sector=sector;
    }
    public long getPhonenumber()
    {
        return phonenumber;
    }
    public void setPhonenumber(long phonenumber)
    {
        this.phonenumber=phonenumber;
    }
    public String getEmailId()
    {
        return email_id;
    }
    public void setEmailId(String email_id)
    {
        this.email_id=email_id;
    }
}