package com.homework.hierarchy;

public class Triangle extends Figure{
    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    double getArea() {
        double p = a + b + c;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    double getPerimeter() {
        return a+b+c;
    }
}
