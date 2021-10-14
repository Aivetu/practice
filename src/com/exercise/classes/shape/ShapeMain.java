package com.exercise.classes.shape;

public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Square(5);
        //shapes[1] = new Circle
        //shapes[2] = new Rectangle
        //shapes[3] = new Triangle
        for(Shape s : shapes){
            System.out.println("Area of "+s.name()+" = "+s.area());
        }
    }
}
