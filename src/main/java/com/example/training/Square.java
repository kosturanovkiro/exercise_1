package com.example.training;

public class Square extends Shape{
    private double a;

    public Square(SquareBuilder builder) {
        this.a = builder.a;
    }

    @Override
    public double calculateArea(){
        return a*a;
    }
    @Override
    public double calculateCircumference(){
        return 4*a;
    }


    public static class SquareBuilder {
        private double a;


        public SquareBuilder() {}

        public SquareBuilder side1(double a) {
            this.a = a;
            return this;
        }

        public Square build() {
            return new Square(this);
        }
    }
}
