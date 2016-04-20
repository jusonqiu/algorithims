package com.main;

import com.juson.algorithims.*;
import com.juson.utils.DumpTest;

public class Main {

    public static void main(String[] args) {
        MergeSort m = new MergeSort();

        int a[] = {36, 21, 35, 10, 29, 60, 89, 18};

       // GenArray.genIntArray(a, 100);

        DumpTest.dumpIntArray(a);

        MergeSort.sort(a);

//        ShellSort.sort(a);
        DumpTest.dumpIntArray(a);




    }
}
