package test.java;

import main.java.Algorithms;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlgorithmsTest {

    @Test
    public void sortAnArrayIntoAscendingOrder() {
        int[] arr = {2,6,4,3,5,8,9,1,7};
        int[] expected = {1,2,3,4,5,6,7,8,9};
        int[] actual = Algorithms.sort(arr);
        assertArrayEquals(actual, expected);
    }
}