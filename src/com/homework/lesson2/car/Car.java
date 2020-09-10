package com.homework.lesson2.car;

public class Car {

    private final String model;
    private final String type;

    public Car(String model, String type) {
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Model: " + model +
                "\nType: " + type;
    }
}
