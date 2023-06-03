package org.example;

import java.util.Arrays;

public class Task27 {
    /*
    Реализовать класс ArrayUtils

В данном классе сделать методы для сортировки массива
 и поиска в нем значений методом бинарного поиска.

 Оба метода должны быть статическими.

 В Main показать работоспособностью
     */
    public static void main(String[] args) {

        int[] numbers = {12, 8, 10, 15, 4, 1, 120, 7, 30, 18};

        ArrayUtils.selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
        ArrayUtils.binarySearch(numbers, 8);
        ArrayUtils.binarySearch(numbers, 77);
    }
}