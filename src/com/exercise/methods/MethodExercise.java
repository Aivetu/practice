package com.exercise.methods;

public class MethodExercise {

    public static void main(String[] args) {
       int[] intArray={2,5,2,8,6,5,6};
       System.out.println(summation(intArray));
    }

    /**
     * int summation(int[])
     */

    public static int  summation(int[] args) {
        int sum=0;
        for( int i : args){
            sum += i;
        }
        return sum;
    }

}
