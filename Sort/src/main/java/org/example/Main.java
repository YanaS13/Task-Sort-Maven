package org.example;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{5,3,9,2,2,4};
        BubleSort Bubsort = new  BubleSort();
        int[] res = Bubsort. BubleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(res[i]);
        }
        System.out.println(" ");
        Quicksort Qusort = new  Quicksort();
        int[] res1 = Qusort.QuickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(res1[i]);
        }
    }
}