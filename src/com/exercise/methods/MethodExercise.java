package com.exercise.methods;

import java.util.Arrays;

public class MethodExercise {

    public static void main(String[] args) {
       int[] intArray={2,5,2,8,6,5,6};
       System.out.println(summation(intArray));
       System.out.println(biggerOne(5,7));
       System.out.println(smallestArray(intArray));
       System.out.println(averageNum(intArray));
       System.out.println(numDigits(32736));
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
    public static int biggerOne(int item,int no){
        if (item> no){
            return item;
        }
        else return no;
    }
    public static int smallestArray(int[] args){
        Arrays.sort(args);
        for(int x:args){
            return args[0];

        }
        return args[0];
    }
    public static int averageNum(int[] args){
        int total=0;
        for (int y:args){
            total += y;
        }
        int mean =total / args.length;
        return mean;
    }
    public static int numDigits(int digits){
        int count=0;
        while(digits!=0){
            digits=digits/10;
            count++;
        }
        return count;
    }

}
