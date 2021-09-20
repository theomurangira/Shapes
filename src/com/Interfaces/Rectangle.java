package com.Interfaces;

public class Rectangle implements Shape{
    private double length;
    private double width;

    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    Rectangle(double l, double w)
    {
        length=l;
        width=w;
    }
    public double area()
    {
        return length*width;
    }

}
