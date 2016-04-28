package com.juson.algorithms;

/**
 * Created by juson on 4/28/16.
 */
public class MaxPriorityQueue {
    private int N = 0;
    private int[] pq;

    private boolean less(int i, int j){
        return (pq[i] < pq[j]);
    }

    private void swap(int i, int j){
        int t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }

    private void swim(int k){
        while(k > 1 && less(k/2, k)){
            swap(k/2, k);
            k /= 2;
        }
    }

    private void sink(int k){

        while(k < N){
            int j = k*2; //next
            if (j < N && less(j, j+1)) j++; //right
            if (!less(k, j)) break; //check
            swap(k, j);
            k = j;

        }
    }

    public MaxPriorityQueue(int max) {
        this.pq = new int[max+1];
    }

    public int size(){
        return N;
    }

    public void insert(int i){
        pq[++N] = i;
        swim(N);
    }

    public int delMax(){
        int max = pq[1];
        swap(1, N--); //第一个和最后一个交换后删除最后一个
        sink(1);//下沉
        return max;
    }

    public void dump(){
        int k = 1;
        int j;
        System.out.println(pq[k] + " ");

        while ((j =2*k) <= N) {
            int n = 2*j;
            for (int l = j; l < n && l <= N; l++) {
                System.out.print(pq[l] + " ");
            }
            k = j;
            System.out.println();
        }
        System.out.println();
    }
}
