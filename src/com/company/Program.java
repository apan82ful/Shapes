package com.company;

import java.util.Scanner;

public class Program {


    public enum ShapeType {RECTANGLE, ELLIPSE}

    public static int positiveInt(){
        Scanner input = new Scanner(System.in);
        int myInt;
        do{
            myInt = input.nextInt();
            if(myInt < 0)
                System.out.println("invalid input");

        }while(myInt < 0);

        return myInt;
    }


    public static Shape makeShape(ShapeType s){

        Shape shape = createShape(s);
        System.out.println("input value of length");

        shape.setLength(positiveInt());
        System.out.println("input value of width");
        shape.setWidth(positiveInt());

        return shape;

    }


    public static Shape createShape(ShapeType shape) {
        if (shape == ShapeType.RECTANGLE) {
            System.out.println("Rectangel");
            return new Rectangle();
        }
        if (shape == ShapeType.ELLIPSE) {
            System.out.println("Ellipse");
            return new Ellipse();
        }
        return null;
    }

    public static void viewShapeInfo(Shape shape) {
        System.out.println(shape.toString());

    }

    private static ShapeType printMenu() {

        Scanner input = new Scanner(System.in);

        System.out.println("Meny");
        System.out.println("0. Create Rectangel");
        System.out.println("1. Create Ellipse");
        System.out.println("2. End program");

        switch (input.nextInt()) {
            case 0:
                return ShapeType.RECTANGLE;
            case 1:
                return ShapeType.ELLIPSE;
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        // write your code here


        ShapeType shape = printMenu();

        Shape s = makeShape(shape);

        viewShapeInfo(s);



        /*Shape r5 = createShape(ShapeType.RECTANGLE);
        r5.setLength(2);
        r5.setWidth(2);
        System.out.println(r5);

        Shape e4 = createShape(ShapeType.ELLIPSE);
        e4.setWidth(2);
        e4.setLength(2);
        System.out.println(e4);


        Rectangle r3 = new Rectangle(3,5);
        ShapeType sh1 = ShapeType.RECTANGLE;
        //.out.println(sh1.getShapeType());

        System.out.println();
        ShapeType rect = ShapeType.RECTANGLE;
        ShapeType elli = ShapeType.ELLIPSE;
        System.out.println("Value of rect = " + rect);
        System.out.println("Value of elli = " + elli);

        Rectangle r1 = new Rectangle(3,5);
        System.out.println(r1.getArea());
        Rectangle r2 = new Rectangle(3,5);
        System.out.println(r2.getPerimeter());

        Ellipse e1 = new Ellipse(3,5);
        System.out.println(e1.getArea());
        System.out.println(r1);*/


    }


}
