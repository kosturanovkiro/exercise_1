package com.example.training;

import com.example.training.Rectangle;
public class Geometry {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle.RectangleBuilder().side1(10).side2(12).build();
        System.out.println("RECTANGLE AREA IS (in cm2)"+rectangle.calculateArea());
        System.out.println("RECTANGLE CIRCUMFERENCE IS (in cm)"+rectangle.calculateCircumference());
        Triangle triangle = new Triangle.TriangleBuilder().side1(10).side2(20).side3(20).build();
        System.out.println("TRIANGLE AREA IS (in cm2)"+triangle.calculateArea());
        System.out.println("TRIANGLE CIRCUMFERENCE IS (in cm)"+triangle.calculateCircumference());
        Square square = new Square.SquareBuilder().side1(2).build();
        System.out.println("SQUARE AREA IS (in cm2)"+square.calculateArea());
        System.out.println("SQUARE CIRCUMFERENCE IS (in cm)"+square.calculateCircumference());
        Circle circle = Circle.getInstance(3);
        System.out.println("CIRCLE AREA IS (in cm2)"+circle.calculateArea());
        System.out.println("CIRCLE CIRCUMFERENCE IS (in cm)"+circle.calculateCircumference());
    }
}