package com.homework.lesson1.hierarchy;

public class Square extends Figure {
    private final double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    double getArea() {
        return a * a;
    }

    @Override
    double getPerimeter() {
        return 4 * a;
    }
}
