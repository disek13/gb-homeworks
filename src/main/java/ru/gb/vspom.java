package ru.gb;

import java.util.Scanner;

class vspom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int summa = x + y;
        int umn = x * y;
        if (summa % 2 == 0 && (umn % 2 > 0)) {
            System.out.print("true");

        } else {
            System.out.print("false");

        }
    }
}
