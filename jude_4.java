package com.company;
import java.util.Scanner;

public class jude_4 {
    static boolean isMagicSquare(int mat[][]) {
        int n = 3;
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++)
            sum = sum + mat[i][i];

        for (int i = 0; i < n; i++)
            sum2 = sum2 + mat[i][n-1-i];

        if(sum!=sum2)
            return false;

        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += mat[i][j];
            }
            if (rowSum != sum) {
                return false;
            }
        }

        for (int i = 0; i < n; i++) {
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                colSum += mat[j][i];
            }
            if (sum != colSum) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input square size [3-5]:");
        int size = sc.nextInt();
        int[][] square = new int[size][size];
        int squareSize = square.length;
        if (size == 3 || size == 4 || size == 5){
            for (int i = 0; i < squareSize; i++) {
                for (int j = 0; j < squareSize; j++) {
                    System.out.println("Input value for row " + (i + 1) + " column " + (j + 1));
                    square[i][j] = sc.nextInt();
                }
            }
        } else{
            System.out.print("Invalid input");
            System.exit(0);
        }

        if (size == 3) {
            System.out.println("Current square:");
            System.out.println(square[0][0] + " " + square[0][1] + " " + square[0][2]);
            System.out.println(square[1][0] + " " + square[1][1] + " " + square[1][2]);
            System.out.println(square[2][0] + " " + square[2][1] + " " + square[2][2]);
        } else if (size == 4) {
            System.out.println("Current square:");
            System.out.println(square[0][0] + " " + square[0][1] + " " + square[0][2] + " "  + square[0][3]);
            System.out.println(square[1][0] + " " + square[1][1] + " " + square[1][2] + " "  + square[1][3]);
            System.out.println(square[2][0] + " " + square[2][1] + " " + square[2][2] + " "  + square[2][3]);
            System.out.println(square[3][0] + " " + square[3][1] + " " + square[3][2] + " "  + square[3][3]);
        } else if (size == 5) {
            System.out.println("Current square:");
            System.out.println(square[0][0] + " " + square[0][1] + " " + square[0][2] + " "  + square[0][3] + " " +square[0][4]);
            System.out.println(square[1][0] + " " + square[1][1] + " " + square[1][2] + " "  + square[1][3] + " " +square[1][4]);
            System.out.println(square[2][0] + " " + square[2][1] + " " + square[2][2] + " "  + square[2][3] + " " +square[2][4]);
            System.out.println(square[3][0] + " " + square[3][1] + " " + square[3][2] + " "  + square[3][3] + " " +square[3][4]);
            System.out.println(square[4][0] + " " + square[4][1] + " " + square[4][2] + " "  + square[4][3] + " " +square[4][4]);
        }
        if (isMagicSquare(square))
            System.out.println("It is a Magic Square!");
        else
            System.out.println("It is Not a magic Square!");
    }
}