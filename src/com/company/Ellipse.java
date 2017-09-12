package com.company;

public class Ellipse extends Shape{


    public Ellipse(){

    }

    public Ellipse(double length, double width){
        super(length, width);
    }

    @Override
    public double getArea() {
        return Math.PI * getLength()*getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * (Math.PI*getLength()*getWidth());
    }


}
