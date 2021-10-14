package com.exercise.classes.shape;

/**
 * Do same for the following
 * 1. Triangle
 * 2. Rectangle
 * 3. Circle
 * Remember to create the fields that match the shape e.g. circle should have radius
 */
public class Square extends Shape{


    public Square(int length) {
        this.length = length;
    }

    private int length;

    @Override
    public double area() {
        return this.length*length;
    }
}
