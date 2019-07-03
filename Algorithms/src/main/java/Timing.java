package main.java;

import java.util.ArrayList;
import java.util.Collections;

public class Timing {

    public Timing() {}

    ArrayList<Integer> arraylist = new ArrayList<Integer>();

    public ArrayList populate(int n) {
        int i = 0;
        while (i < n) {
            arraylist.add(i);
            i++;
        }
        Collections.shuffle(arraylist);
        return arraylist;
    }

    public int last() {
        return arraylist.get(arraylist.size() - 1);
    }

    public ArrayList reverse() {
        Collections.reverse(arraylist);
        return arraylist;
    }

    public ArrayList shuffle() {
        Collections.shuffle(arraylist);
        return arraylist;
    }

    public ArrayList sort() {
        Collections.sort(arraylist);
        return arraylist;
    }
}