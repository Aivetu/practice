package com.exercise.arrayList;

import java.util.ArrayList;

public class User {
    private String firstName;
    private String lastName;
    private int age;

   /* public User(String firstName,String lastName,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }*/

    public void setDetails(String firstName,String lastName,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }
    public String getRegisteredUsers(){
        return this.firstName + " " + this.lastName;
    }


}
