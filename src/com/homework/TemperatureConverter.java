package com.homework;

//значения будут поступать по шкале Цельсия
public class TemperatureConverter {
    public double convertCelsiumToFahrenheit(int celsium) {
        return (celsium * 9 / 5) + 32;
    }

    public double convertCelsiumToKelvin(int celsium) {
        return celsium + 273.15;
    }

    public double convertKelvinToCelsium(int kelvin) {
        return kelvin - 273.15;
    }

    public static void main(String[] args) {
        TemperatureConverter tempConverter = new TemperatureConverter();
        System.out.println(
                tempConverter.convertCelsiumToFahrenheit(20)
        );
        System.out.println(
                tempConverter.convertCelsiumToKelvin(20)
        );
        System.out.println(
                tempConverter.convertKelvinToCelsium(20)
        );
    }
}
