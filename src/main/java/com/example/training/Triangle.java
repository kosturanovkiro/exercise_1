package com.example.training;
import java.lang.Math.*;

import static java.lang.Math.sqrt;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;


    public Triangle(TriangleBuilder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
    }

    @Override
    public double calculateArea(){
        double s = (a+b+c)/2;
        return sqrt(s*(s-a)*(s-b)*(s-c));
    }
    @Override
    public double calculateCircumference(){ return a+b+c;}


    public static class TriangleBuilder {
        private double a;
        private double b;
        private double c;

        public TriangleBuilder() {}

        public TriangleBuilder side1(double a) {
            this.a = a;
            return this;
        }

        public TriangleBuilder side2(double b) {
            this.b = b;
            return this;
        }

        public TriangleBuilder side3(double c) {
            this.c = c;
            return this;
        }

        public Triangle build() {
            return new Triangle(this);
        }
    }
}
