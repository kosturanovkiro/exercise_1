package com.example.training;

public class Rectangle extends Shape{
    private double a;
    private double b;

    public Rectangle(RectangleBuilder builder) {
        this.a = builder.a;
        this.b = builder.b;
    }

    @Override
    public double calculateArea(){
        return a*b;
    }
    @Override
    public double calculateCircumference(){
        return 2*a+2*b;
    }


    public static class RectangleBuilder {
        private double a;
        private double b;

        public RectangleBuilder() {}

        public RectangleBuilder side1(double a) {
            this.a = a;
            return this;
        }

        public RectangleBuilder side2(double b) {
            this.b = b;
            return this;
        }

        public Rectangle build() {
            return new Rectangle(this);
        }
    }
}
