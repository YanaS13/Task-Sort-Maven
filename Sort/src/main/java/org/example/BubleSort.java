package org.example;
public class BubleSort {
    public int[] BubleSort(int[] a) {
            for (int i = 0; i < a.length - 1; i++) {
                for(int j = 0; j < a.length - i - 1; j++) {
                    if(a[j + 1] < a[j]) {
                        int b = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = b;
                    }
                }
            }
            return a;
    }
}
