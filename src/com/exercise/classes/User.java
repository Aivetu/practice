package com.exercise.classes;

import java.util.Scanner;

public class User {
    private String username;
    private String password;


    /**
     * 1. Create constructor that has the two fields as properties
     * 2. Create method to sign in that will accept two arguments: username and password
     * and returns boolean true if username and password matches and false if it does not
     * 3 Create field age
     * 4 Create getter and setter for age
     * 5 Create method - whatAmI() method should return adult if age >= 18, teenager if
     * age >=13 to 17 and child from 0 to 12
     */

    public User() {
        username = "Aivetu";
        password = "ilikefood";
    }

    public boolean confirmPassword(String uname,String pword) {
        if ( uname==username && pword == password){
            return true;
        }
        else return false;

    }
}


