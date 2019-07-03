package main.java;

public class Algorithms {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int x = array[i];
                    int y = array[j];
                    array[i] = y;
                    array[j] = x;
                }
            }
        }
        return array;
    }
}

