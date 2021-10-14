package com.exercise.classes.shape;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public abstract class Shape {
    public double area() {
        throw new NotImplementedException();
    }

    public String name(){
        return "Shape";
    }
}
