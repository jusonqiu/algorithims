package com.juson.algorithms;

/**
 * Created by juson on 4/18/16.
 *
 * 快速排序（英语：Quicksort），又称划分交换排序（partition-exchange sort）,
 * 步骤为：
 *   从数列中挑出一个元素，称为"基准"（pivot），
 *   重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分区结束之后，该基准就处于数列的中间位置。这个称为分区（partition）操作。
 *   递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序。
 */
public class QuickSort {

    private static int partition(int a[], int lo, int hi){
        int l = lo, r = hi+1;   //左右扫描指针
        int pv = a[lo];         //切分基准元素
        int tmp = 0;
        while (true){
            while (a[++l] < pv) if (l == hi) break;
            while(pv < a[--r] ) if (r == lo) break;
            if (l >= r) break;
            //交换位置
            tmp = a[r];
            a[r] = a[l];
            a[l] = a[r];
        }
        // 将 pv 放入正确位置
        a[lo] = a[r];
        a[r] = pv;
        // a[lo..r-1] <= a[r] => a[r+1..hi] 达成
        return r;
    }

    private static void sort(int[] a, int lo, int hi){
        if (hi <= lo) return;
        int r = partition(a, lo, hi); //切分
        sort(a, lo, r-1);             //左边排序
        sort(a, r+1, hi);             //右边排序
    }

    public static void sort(int[] a){
        sort(a, 0, a.length-1);
    }
}
