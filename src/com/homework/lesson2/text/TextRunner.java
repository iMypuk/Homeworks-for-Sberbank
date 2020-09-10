package com.homework.lesson2.text;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextRunner {

    private static final String PATH = ".\\src\\com\\homework\\lesson2\\text\\resources\\example.txt";

    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
//        ex4_5();
        ex6();
    }

    private static void ex1() {
        TextHelper textHelper = new TextHelper(PATH);
        try {
            System.out.println(
                    "Количество слов: " + textHelper.getWordCount()
            );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void ex2() {
        TextHelper textHelper = new TextHelper(PATH);
        List<String> sortedList = new ArrayList<>();
        try {
            sortedList = textHelper.getSortedList();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        sortedList.forEach(System.out::println);
    }

    private static void ex3() {
        TextHelper textHelper = new TextHelper(PATH);
        try {
            textHelper.countHowManyEachWords();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void ex4_5() {
        TextHelper textHelper = new TextHelper(PATH);
        try {
            textHelper.reverseIteration();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void ex6() {
        TextHelper textHelper = new TextHelper(PATH);
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        while (number != 0) {
            System.out.println("Введите номер строки(0 для отмены):");
            number = scanner.nextInt();
            if (number != 0)
                System.out.println(textHelper.getStringByNumber(number));
        }
        System.out.println("Завершено");
    }
}
