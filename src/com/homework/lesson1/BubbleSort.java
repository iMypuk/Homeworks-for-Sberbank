package com.homework.lesson1;

import java.util.Random;

public class BubbleSort {

    public static void main(String args[]) {
        int n = 10;
        BubbleSort ob = new BubbleSort();
        int[] arr = new int[n];
        Random rand = new Random();
        System.out.println("Исходный массив:");
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(89) + 10;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        ob.bubbleSort(arr);
        System.out.println("Отсортированный массив:");
        ob.printArray(arr);
    }

    private void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    private void printArray(int arr[]) {
        int n = arr.length;
        for (int value : arr) System.out.print(value + " ");
        System.out.println();
    }
}
