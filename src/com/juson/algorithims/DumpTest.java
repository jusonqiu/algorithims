package com.juson.algorithims;

/**
 * Created by juson on 4/18/16.
 */
public class DumpTest {
    public static void dumpIntArray(int[] a){
        System.out.print("{");
        for (int i = 0; i < a.length; i++){

            if (i !=0 && i%8 == 0){
                System.out.println();
            }
            System.out.print(String.format("%2d, ", a[i]));

        }
        System.out.println("}");
    }
}
