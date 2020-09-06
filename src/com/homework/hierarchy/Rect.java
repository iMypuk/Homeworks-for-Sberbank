package com.homework.hierarchy;

public class Rect extends Figure {
    private final double length;
    private final double width;

    public Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    double getArea() {
        return length * width;
    }

    @Override
    double getPerimeter() {
        return 2 * (length + width);
    }
}
