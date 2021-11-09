package ru.gb;

import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) {

        int[] a = shiftArray(new int[] {1, 2, 3, 4, 5}, 3);

    }
    private static int[] shiftArray(int[] a, int offset){
        int len = a.length;
        offset = offset % len;
        if (offset > 0) {
            for (int i = 0; i < offset; i++) {
                for (int j = (len - 1); j > 0 ; j--) {
                    int c = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = c;
                }

            }

        }
        System.out.println(Arrays.toString(a));
        return new int[0];

    }
}
