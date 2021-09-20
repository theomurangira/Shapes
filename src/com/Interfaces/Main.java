package com.Interfaces;

public class Main {

    public static void main(String[] args) {
        Shape s =new Rectangle(2.4,1.2);
        System.out.println("The area of s ="+s.area());
        Shape t=new Triangle(4,5);
        System.out.println("The area of t ="+ t.area());
	// write your code here
    }
}
