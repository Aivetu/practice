package com.exercise.classes;

import java.util.Scanner;

public class User {
    private String username;
    private String password;


    /**
     * 1. Create constructor that has the two fields as properties
     * 2. Create method to sign in that will accept two arguments: username and password
     * and returns boolean true if username and password matches and false if it does not
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


