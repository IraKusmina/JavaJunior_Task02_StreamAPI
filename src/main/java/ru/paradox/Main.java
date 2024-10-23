package ru.paradox;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int SIZE_LIST = 10;
        int MIN_NUMBER = 0;
        int MAX_NUMBER = 10;
        for (int i = 0; i < SIZE_LIST; i++) {
            list.add((int)(Math.random()*(MAX_NUMBER-MIN_NUMBER+1)+MIN_NUMBER));
        }
        System.out.println("Исходный массив чисел от " + MIN_NUMBER + " до "+ MAX_NUMBER + ": " + list);
        list = list.stream().filter(el -> el%2==0).toList();
        OptionalDouble average = list.stream().mapToInt(e -> e).average();
        System.out.println("Отфильтрованный массив, только четные числа: " + list);
        System.out.println("Сумма элементов массива: " + average.getAsDouble());
    }
}