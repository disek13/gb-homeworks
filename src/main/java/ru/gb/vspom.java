package ru.gb;

import java.util.Scanner;

class vspom {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int s = sc.nextInt();
        //s = s % 86400;
        //int h = s / 3600;
        //int m = s % 3600 / 60;
       // int osts = s % 60;
       // String myVar = String.valueOf(h / 10) + String.valueOf(h % 10) + ":" + String.valueOf(m / 10) + String.valueOf(m % 10) + ":" + String.valueOf(osts / 10) + String.valueOf(osts % 10);
       // System.out.print(myVar);
      //  int a = 5;
        //boolean b;
        //int c = 4;
       // b = c++ == 4 && a++ < 6;
        int x = 5, y = 3;
        int z = ++x;
        y += x--;
        z+= --x + y++;
        System.out.println(x + y + z);
    }
}
