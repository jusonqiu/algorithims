package com.juson.algorithims;

/**
 * Created by juson on 4/18/16.
 */
public class QuickSort {
    public static void sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {

                if (a[j] < a[i]){
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }

            }
        }
    }
}
