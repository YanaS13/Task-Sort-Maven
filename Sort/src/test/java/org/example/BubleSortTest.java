package org.example;
import org.junit.Assert;
//import junit.framework.TestCase;

public class BubleSortTest  {
    @org.junit.Test
    public void BubleTest() {
        int [] a = new int[] {5, 4, 3, 2, 1};
        int [] res = new int[] {1, 2, 3, 4, 5};
        BubleSort Bubsort = new  BubleSort();
        Assert.assertArrayEquals(res, Bubsort. BubleSort(a));
    }

    @org.junit.Test
    public void BubleTest2() {
        int [] a = new int[] {1, 2, 3, 4, 5};
        int [] res2 = new int[] {1, 2, 3, 4, 5};
        BubleSort Bubsort = new  BubleSort();
        Assert.assertArrayEquals(res2, Bubsort. BubleSort(a));
    }

    @org.junit.Test
    public void BubleTest3() {
        int [] a = new int[] {99, 4, 1, 99, 16};
        int [] res3 = new int[] {1, 4, 16, 99, 99};
        BubleSort Bubsort = new  BubleSort();
        Assert.assertArrayEquals(res3, Bubsort. BubleSort(a));
    }

}