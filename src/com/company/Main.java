package com.company;

import com.juson.algorithims.*;

public class Main {

    public static void main(String[] args) {
        MergeSort m = new MergeSort();

        int a[] = {12, 71, 35, 10, 29, 60, 89, 18};

       // GenArray.genIntArray(a, 100);

        DumpTest.dumpIntArray(a);

        MergeSort.sort(a);

//        ShellSort.sort(a);
        DumpTest.dumpIntArray(a);


    }
}
