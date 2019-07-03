package main.java;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        int arraySize = 1;
        int maxArray  = 50000;

        ArrayList<Long> timestaken   = new ArrayList<Long>();
        ArrayList<Long> coordinates = new ArrayList<Long>();

        while (arraySize <= maxArray) {
            long size = arraySize;
            coordinates.add(size);
            times(arraySize, timestaken);
            coordinates.add(median(timestaken));
            arraySize = arraySize + 10;
        }
        System.out.println(coordinates);
        // return coordinates;
    }

    public static void times(int arraySize, ArrayList timestaken) {
        int i = 1;
        int n = 1000;

        Timing timing = new Timing();

        timing.populate(arraySize);

        while (i <= n) {
            long startTime = System.nanoTime();
            timing.last();
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            timestaken.add(duration);
            i++;
        }
    }

    public static Long median(ArrayList timestaken) {
        Collections.sort(timestaken);
        long median;
        int length = timestaken.size();

        if (length % 2 == 0)
            median = ((long)timestaken.get(length/2) + (long)timestaken.get(length/2 - 1))/2;
        else
            median = (long)timestaken.get(length/2);
        return median;
    }
}
