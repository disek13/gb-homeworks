package ru.gb;

public class Homework03 {
    public static void main(String[] args) {
        arrayInt();
        arrayIntStr();
        array2();
        doubleArray();
        arrayDln(5,7);
        arrayMinMax(10);
        checkbalance(11);
        int[] array = {1, 2, 3, 4, 5};
        array5(array,7);
    }
    //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void arrayInt() {
        int a[] =  {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
            System.out.printf("a[%d] = %d\n", i, a[i]);
        }
    }
    //задача 2 Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void arrayIntStr() {
        int[] b = new int[100];
        for (int i = 0; i < b.length; i++) {
            b[i] = i + 1;
            System.out.println(b[i]);
        }
    }
    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void array2() {
        int[] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < c.length; i++) {
            if (c[i] < 6) {
                c[i] = c[i] * 6;
            }
            System.out.println(c[i]);
        }
    }
    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void doubleArray() {

        int d[][] = new int[4][4];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                if (i == j) {
                    d[i][j] = 1;
                }
                System.out.print(d[i][j]);
            }
            System.out.println();
        }
    }
    //5.Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] arrayDln(int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
            System.out.println(array[i]);
        }
        return array;

    }
    //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static void arrayMinMax(int number){
        int[] array = new int[number];
        int max = array[0];
        int min = array[0] ;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
        }
        System.out.println("Минимальное значение - " + min);
        System.out.println("Максимальное значение - " + max);
    }
    //7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    public static boolean checkbalance(int number){
        int summaLeft = 0;
        int[] array = new int[number];
        for(int i = 0; i < array.length; i++){
            summaLeft += array[i];
            int Summaright = 0;
            for (int j = 0; j < array.length; j++){
                Summaright += (j > i)? array[j] : 0;
            }
            if(summaLeft == Summaright){
                System.out.println("Суммы равны");
                return true;
            }
        }
        System.out.println("Суммы не равны");
        return false;

    }
    //8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ]
    // при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.
    public static void array5(int[] array, int position) {
        if (position > 0) {
            for (int i = 0; i < position; i++) {
                int n = array[array.length - 1];

                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }

                array[0] = n;
            }
        } else {
            for (int i = 0; i > position; i--) {
                int n = array[0];

                for (int j = 1; j < array.length; j++) {
                    array[j - 1] = array[j];
                }

                array[array.length - 1] = n;
            }
        }
    }
}
