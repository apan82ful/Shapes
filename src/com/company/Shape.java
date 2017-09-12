package com.company;

public abstract class Shape {
    private double length;
    private double width;

    public Shape() {
    }

    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public abstract double getArea();

    public abstract double getPerimeter();


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length >= 0)

        this.length = length;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public String toString() {
        return "Length: " + length + " Width " + width + " Perimeter " + getPerimeter() + " Area: " + getArea();
    }

}

    /*public abstract void setLength();

    public abstract void setWidth();
}*/
