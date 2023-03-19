package org.example;
import org.junit.Assert;
//import static org.junit.jupiter.api.Assertions.*;

public class QuicksortTest {

    @org.junit.Test
    public void QuicksortTest() {
        int [] a = new int[] {5, 4, 3, 2, 1};
        int [] res = new int[] {1, 2, 3, 4, 5};
        Quicksort Qusort = new  Quicksort();
        Assert.assertArrayEquals(res, Qusort.QuickSort(a, 0, a.length - 1));
    }

    @org.junit.Test
    public void QuicksortTest2() {
        int [] a = new int[] {1, 2, 3, 4, 5};
        int [] res = new int[] {1, 2, 3, 4, 5};
        Quicksort Qusort = new  Quicksort();
        Assert.assertArrayEquals(res, Qusort.QuickSort(a, 0, a.length - 1));
    }

    @org.junit.Test
    public void QuicksortTest3() {
        int [] a = new int[] {2, 48, 7, 2, 0};
        int [] res = new int[] {0, 2, 2, 7, 48};
        Quicksort Qusort = new  Quicksort();
        Assert.assertArrayEquals(res, Qusort.QuickSort(a, 0, a.length - 1));
    }
}