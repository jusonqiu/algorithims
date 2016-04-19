package com.juson.algorithims;

/**
 * Created by juson on 4/16/16.
 *
 * 基本排序：
 * 归并（Merge）排序法是将两个（或两个以上）有序表合并成一个新的有序表，
 * 即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并为整
 * 体有序序列。
 */
public class MergeSort {

    private static int[] aux;
    //原地归并排序: 有序数组 a[0 ~ mid] 和 a[mid+1 ~ hi]
    private static void merge(int[] a, int lo, int mid, int hi){
        int i = lo;
        int j = mid+1;
       // System.out.println(String.format("%2d %2d %2d", lo, mid, hi));

        for (int k = i; k < hi; k++){
            if (i > mid)                        a[k] = aux[j++];
            else if(j > hi)                     a[k] = aux[i++];
            else if(aux[j] < aux[i])            a[k] = aux[j++];
            else                                a[k] = aux[i++];
        }
    }

    private static void sort(int[] a, int lo, int hi){


        if (hi <= lo) return;
        int mid = lo + (hi-lo)/2;
        sort(a, lo, mid);          // 将左半部分排序
        sort(a, mid+1, hi);          // 将又半部分排序
        merge(a, lo, mid, hi);     // 归并结果

        System.out.print("-->");
        DumpTest.dumpIntArray(a);
    }


    public static void sort(int[] a){
        aux = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            aux[i] = a[i];
        }

        sort(a, 0, a.length-1);
    }


}
