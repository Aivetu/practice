package com.exercise.exceptions;

import com.sun.istack.internal.Nullable;

import java.util.Scanner;

public class TestException {

    /**
     * do a try catch and return -1 if error
     * @param pos
     * @return
     */
    public int getFromArrayException(int pos){
        int[] arr = {1,5,4};
        return arr[pos];
    }

    /**
     * do a try catch and print INVALID if error during string conversion to integer
     */
    public void sumFromUserEntry(){
        Scanner in = new Scanner(System.in);
        System.out.println("Kindly enter first number:");
        String a = in.next();
        System.out.println("Kindly enter second number:");
        String b = in.next();
        System.out.print(a+" + "+b+" = ");
        int c = Integer.parseInt(a) + Integer.parseInt(b);
        System.out.println(c);
    }

    /**
     * do a null exception catch print invalid password
     * @param passwordEntry
     */
    private void validatePasswordCheckNullException( String passwordEntry){
        String password = "P@$$w0rd";
        if(passwordEntry.equalsIgnoreCase(password)){
            System.out.println("Successful password validation");
        }

    }

    public void nullableException(){
        validatePasswordCheckNullException(null);
    }
}
