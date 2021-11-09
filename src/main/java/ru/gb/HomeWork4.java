package ru.gb;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        play();
    }

    private static void play() {

        int[] guesssum = generatenumber();
        System.out.println(Arrays.toString(guesssum));
        Scanner scanner = new Scanner(System.in);
        int bulls, cows,  step = 0; //количество быков

        do {
            bulls = 0;
            cows = 0;
            System.out.print("Введите четырехзначное число: ");
            String plaerNum = scanner.nextLine();
            for (int i = 0; i < 4; i++) {
                boolean strcows;
                strcows = plaerNum.contains(String.valueOf(guesssum[i]));
                if (guesssum[i] == plaerNum.charAt(i) - '0'){
                   bulls++;
               } else if(strcows) {
                   cows++;
               }
            }

            if (plaerNum.length() > 4) {
                System.out.print("ERROR!! длина ввода больше 4 символов");
                System.out.println();
                play();
            }
            step++;
            System.out.printf("Ход %d. Введено число %s, быков %d, коров %d", step, plaerNum, bulls, cows);
            System.out.println();
        }while (bulls < 4);
        System.out.println(Arrays.toString(guesssum));
        System.out.println("Поздравляю вы выйграли!");
    }

    private static int[] generatenumber() {
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int i1 = random.nextInt(10);
            int i2 = random.nextInt(10);
            int c = a[i2];
            a[i2] = a[i1];
            a[i1] = c;
        }

        return new int []{ a[0], a[1], a[2], a[3]};
    }

}
