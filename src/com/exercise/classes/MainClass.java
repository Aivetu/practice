package com.exercise.classes;

public class MainClass {

    public static void main(String[] args) {
        //Create a new User with username and password
        //call the sign in method and print its response when the right credentials are sent
        // call the sign in method and print its response when the wrong credentials are sent
    User print = new User();
    System.out.println(print.confirmPassword("aiva","jdhfhd"));
    System.out.println(print.confirmPassword("Aivetu","ilikefood"));

    }
}
