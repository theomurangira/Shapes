package com.Interfaces;

public class Triangle implements Shape{
    private double height;
    private double base;
    Triangle(double h, double b)
    {
        height=h;
        base=b;
    }
    public double getHeight()
    {
        return height;
    }
    public double getBase()
    {
        return base;
    }
    public double area()
    {
        return (height*base)/2;
    }
}
