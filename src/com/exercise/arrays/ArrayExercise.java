package com.exercise.arrays;

public class ArrayExercise {

    /**
     * complete all other methods, do not change anything in the main method, run your code
     * @param args
     */
    public static void main(String[] args) {
        intArray = initializeArray();
        displayArray();// display - 3,6,2,4,8
        replace3rdItem(5);
        displayArray();//display - 3,6,5,4,8
        multiplyBy(2);
        displayArray();//display - 6,12,10,8,16
        System.out.println("Array Sum -> "+sumArray());
    }


    private static int[] intArray;

    /**
     * Initialize the array with 3,6,2,4,8
     * @return
     */

    private static int[] initializeArray(){
        //replace code below to initialize array here with value and return it
        return new int[]{3,6,2,4,8};
    }

    /**
     * Code should display the numbers in the array seperated with comma e.g 3,6,2,4,8
     */
    private static void displayArray(){
        //enter code here
        StringBuilder input= new StringBuilder();
        for(int x=0;x<intArray.length;x++)
        {
            if (x != 0) {
                input.append(",");
            }
            input.append(intArray[x]);

        }
        System.out.println(input);



    }

    /**
     * Enter code to replace the item 3 with whatever is in the method argument
     */
    private static void replace3rdItem(int newValue){
        //enter code here
        intArray[2]= newValue;
    }





    /**
     * Enter code to multiply all items in the array by the argument
     */
    private static void multiplyBy(int multiplier){
        //enter code here

        for (int x=0;x<intArray.length;x++){
            intArray[x] =intArray[x] * multiplier;
        }
    }

    /**
     * Return the sum of the numbers in the array
     */
    private static int sumArray(){
        int result =0;
        for (int arr:intArray){
            result += arr;
        }

        return result;//replace this with your solution
    }
}
