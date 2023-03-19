package org.example;

public class Quicksort {

    public int[] QuickSort(int[] a, int low, int high) {
        int middle = low + (high - low) / 2;
        int border = a[middle];
        int i = low, j = high;

        while (i <= j) {
            while (a[i] < border) i++;
            while (a[j] > border) j--;
            if (i <= j) {
                int swap = a[i];
                a[i] = a[j];
                a[j] = swap;
                i++;
                j--;
            }
        }
        if (low < j) QuickSort (a, low, j);
        if (high > i) QuickSort (a, i, high);
        return a;
    }
}
