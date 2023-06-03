package org.example;

public class ArrayUtils {
    public static void selectionSort(int[] array) {

        int currentMin;
        int indexOfCurrentMin;
        int temp;

        for (int i = 0; i < array.length; i++) {
            currentMin = array[i];
            indexOfCurrentMin = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < currentMin) {
                    currentMin = array[j];
                    indexOfCurrentMin = j;
                }
            }

            temp = array[i];
            array[i] = array[indexOfCurrentMin];
            array[indexOfCurrentMin] = temp;
        }
    }

    public static boolean binarySearch(int[] array, int element) {

        boolean contains = false;
        int left = 0;
        int right = array.length - 1;
        int middle = left + (right - left) / 2;
        while (left <= right) {

            if (element < array[middle]) {
                right = middle - 1;
            } else if (element > array[middle]) {
                left = middle + 1;
            } else {
                contains = true;
                System.out.println("Число " + element + " найдено под индексом " + middle);
                break;
            }
            // если мы так и не нашли число, значит у нас изменились границы и
            // следовательно, у нас будет новый центр
            middle = left + (right - left) / 2;
        }
        if (!contains) {
            System.out.println("Число " + element + " не найдено");
        }
        return contains;
    }

}
