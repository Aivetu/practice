package com.exercise.arrays;

public class ArrayExercise {

    /**
     * complete all other methods, do not change anything in the main method, run your code
     * @param args main method argument
     */
    public static void main(String[] args) {
        intArray = initializeArray();
        displayArray();// display - 3,6,2,4,8
        replace3rdItem(5);
        displayArray();//display - 3,6,5,4,8
        multiplyBy(2);
        displayArray();//display - 6,12,10,8,16
    }


    private static int[] intArray;

    /**
     * Initialize the array with 3,6,2,4,8
     * @return integer array
     */
    private static int[] initializeArray(){
        return new int[]{3,6,2,4,8};
    }

    /**
     * Code should display the numbers in the array seperated with comma e.g 3,6,2,4,8
     */
    private static void displayArray(){
        StringBuilder s = new StringBuilder();
        for(int i=0;i<intArray.length; i++){
            if(i!=0){
                s.append(",");
            }
            s.append(intArray[i]);
        }
        System.out.println(s);
    }

    /**
     * Enter code to replace the item 3 with whatever is in the method argument
     */
    private static void replace3rdItem(int newValue){
        intArray[2] = newValue;
    }

    /**
     * Enter code to multiply all items in the array by the argument
     */
    private static void multiplyBy(int multiplier){
        for(int i=0;i<intArray.length;i++){
            intArray[i] = intArray[i]*multiplier;
        }
    }
}
