package com.example.training;

public class Circle extends Shape{
    private static Circle single_instance = null;
    private double r;
    private Circle(double r)
    {
        this.r=r;
        System.out.println("Singleton class is created!");
    }

    public static Circle getInstance(double r)
    {
        if (single_instance == null)
            single_instance = new Circle(r);

        return single_instance;
    }

    @Override
    public double calculateArea(){
        return 3.14*r*r;
    }
    @Override
    public double calculateCircumference(){
        return 2*3.14*r;
    }

}
