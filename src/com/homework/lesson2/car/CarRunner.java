package com.homework.lesson2.car;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class CarRunner {

    private static final int COUNT = 10;

    public static void main(String[] args) {

        CarRunner carRunner = new CarRunner();
        ArrayList<Car> cars;
        cars = carRunner.carsGenerate(COUNT);

        Map<String, List<Car>> carsMap = cars
                .stream()
                .collect(Collectors.groupingBy(Car::getType));
        System.out.println("Сгруппированный список:");
        for (Map.Entry<String, List<Car>> item : carsMap.entrySet()) {
            System.out.println(item.getKey() + ": " +
                    item.getValue()
                            .stream()
                            .map(Car::getModel)
                            .collect(Collectors.joining(", "))
            );
        }
    }

    private ArrayList<Car> carsGenerate(int count) {

        String[] models = {"Audi", "BMW", "Chevrolet", "Lada", "Hyundai", "KIA", "Mercedes-Benz"};
        String[] types = {"седан", "хэтчбэк", "универсал", "внедорожник"};
        Random rand = new Random();
        ArrayList<Car> cars = new ArrayList<Car>();
        System.out.println("Исходный список:");
        for (int i = 0; i < count; i++) {
            String model = models[rand.nextInt(models.length)];
            String type = types[rand.nextInt(types.length)];
            Car car = new Car(model, type);
            cars.add(car);
            System.out.println(car + "\n");
        }
        return cars;
    }
}
