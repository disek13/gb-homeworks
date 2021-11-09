package ru.gb;

import java.util.Random;
import java.util.Scanner;

public class minesweeper {
    //
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CIAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";

   private static final int WIDTH = 10;
   private static final int HEIGHT = 10;
   private static final int MINES = 10;
   private static final int MINE = 1000;
   private static final int EMPTY = 0;
   private static final int CELL_OPEN = 1;
   private static final int CELL_CLOSE = 0;
    private static final int CELL_FLAG = -1;

    public static void main(String[] args) {
        boolean win = play();
        if (win) {
            System.out.println("Поздравляю вы выиграли!");

        } else {
            System.out.println("Сапер рванулся на мине!");
        }
    }

    private static boolean play() {
        int[][] board = generategBoard();
        int[][] moves = new int[HEIGHT][WIDTH];
        boolean isCorrectMove = false;
        boolean win = false;
        do {
            printboard(board,moves);
            isCorrectMove =  move(board, moves);
            win = isWin(moves);
        } while (!win && isCorrectMove);
        return isCorrectMove;
    }

    private static boolean isWin(int[][] moves) {
        int openCell = 0;
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (moves[i][j] == CELL_OPEN){
                    openCell++;
                }

            }

        }
        return  openCell  == HEIGHT * WIDTH -MINES;
    }

    private static boolean move(int[][] board, int[][] moves) {
        final Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.print("Сделай ход. Укажите координаты в формате столбец-строка: ");
        String s = scanner.nextLine();
        s = s.toUpperCase();
        int row = s.charAt(0) - 'A';
        int line = s.charAt(1) - '0';
        int str = s.charAt(0);

        if (row >= 0 && row < HEIGHT && line >= 0 && line < WIDTH ) {
            if (s.endsWith("*")) {
                moves[line][row] = CELL_FLAG;
                return true;
            }
            if (board[line][row] == MINE) {
                return false;
            }
            moves[line][row] = CELL_OPEN;
            System.out.println("Неправильный ввод!!!");
            return true;
        }
        }


    }

    private static void printboard(int[][] board, int[][] moves) {
        System.out.print("    ");
        for (char i = 'A'; i < 'A' + WIDTH; i++) {
            System.out.print(" "+ i);
        }
        System.out.println("");
        for (int i = 0; i < HEIGHT; i++) {
            System.out.printf("%3d ", i);
            for (int j = 0; j < WIDTH; j++) {
                if(moves[i][j] == CELL_CLOSE){
                    System.out.print("[]");
                    continue;
                }
                if(moves[i][j] == CELL_FLAG){
                    System.out.print(" P");
                    continue;
                }
                String cellColor = getCellColor(board[i][j]);
                System.out.print(cellColor);
                if (board[i][j] == MINE) {
                    System.out.print(" *");
                } else if (board[i][j] == EMPTY){
                    System.out.print(" .");
                } else {
                    System.out.print(" "+ board[i][j]);
                }
                System.out.print(ANSI_RESET);
            }
            System.out.println("");
        }
    }

    private static String getCellColor(int i) {
        switch (i){
            case EMPTY: return ANSI_WHITE;
            case MINE: return ANSI_BLACK;
            case 1: return ANSI_GREEN;
            case 2: return ANSI_BLUE;
            case 3: return ANSI_RED;
            case 4: return ANSI_CIAN;
            default: return ANSI_YELLOW;
        }
    }

    private static int[][] generategBoard() {
        Random random = new Random();
        final int[][] board = new int[HEIGHT][WIDTH];
        int mines = MINES;
        while (mines > 0) {
            int x = random.nextInt(HEIGHT), y = random.nextInt(WIDTH);
            if (board[x][y] == MINE) {
                continue;
            }
            board[x][y] = MINE;
            mines--;
        }
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
              if (board[i][j] == MINE) {
                  continue;
              }
              int minecount = 0;
                for (int k = i - 1; k <= i +1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        if (k < 0 || k >= HEIGHT ||l < 0 || l >= WIDTH) {
                          continue;
                        }
                       if (board[k][l] == MINE) {
                           minecount++;
                       }
                    }
                    
                }
                board[i][j] = minecount;
            }
        }
        return board;
    }
}
