package ru.gb;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {

        int[] a = shiftArray(new int[] {1, 2, 3, 4, 5}, 3);

    }
    private static int[] shiftArray(int[] a, int offset){
        int len = a.length;
        offset %= len;
        for (int i = 0; i < 0; i++) {
            
        }
        System.out.println(Arrays.toString(a));
        return new int[0];

    }

}
