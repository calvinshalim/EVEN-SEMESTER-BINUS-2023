package com.company;
import java.util.Scanner;

class Array_method_Exec {
    //create funct here for no.3
    public static int[][] transpose (int[][] c) {
        if (c == null || c.length == 0)//if the array empty or null
            return c;

        int width = c.length;
        int height = c[0].length;

        int[][] array_trans = new int[height][width];

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                array_trans[y][x] = c[x][y];
            }
        }
        return array_trans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("No.1");
        int[] array8 = {4, 8, 6, 3, 2};
        int[] a = new int[array8.length + 1];
        System.out.println("Original array :");
        for (int i_8 = 0; i_8 < array8.length; i_8++) {
            a[i_8] = array8[i_8];
            System.out.print(a[i_8] + " ");
        }
        int max8 = a[0];
        int min8 = a[0];
        for (int i_8 = 0; i_8 < array8.length; i_8++) {
            if (a[i_8] > max8) {
                max8 = a[i_8];
            }
            if (a[i_8] < min8) {
                min8 = a[i_8];
            }
        }
        int next_max8 = 0;
        for (int k_8 = 0; k_8 < array8.length; k_8++) {
            if (a[k_8] < max8) {
                next_max8 = a[k_8];
                break;
            }
        }
        for (int i_8 = 0; i_8 < array8.length; i_8++) {
            if (a[i_8] > next_max8 && a[i_8] < max8) {
                next_max8 = a[i_8];


                int y = max8 - next_max8;
                int z = next_max8;
                System.out.println("\nAfter modified: ");
                for (int i_82 = 0; i_82 < array8.length + 1; i_82++) {
                    int new_z = array8.length;
                    if (a[i_82] != max8) {
                        System.out.print(a[i_82] + " ");
                    } else {
                        a[i_82] = z;
                        System.out.print(a[i_82] + " ");
                        while (new_z > i_82) {
                            a[new_z] = a[new_z - 1];
                            new_z--;
                        }
                        a[i_82 + 1] = y;
                        System.out.print(a[i_82 + 1] + " ");
                        i_82++;
                    }
                }
            }
        }
        System.out.println("\nNo.2");
        int temp[];
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original array :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nROT :");
        int rot = sc.nextInt();
        temp = new int[array.length];
        int j = 0;
        rot = rot % array.length;
        for (int i = 0; i < array.length; i++) {
            if (array.length - rot + i >= array.length) {
                temp[i] = array[j];
                j = j + 1;
            } else {
                temp[i] = array[array.length - rot + i];
            }
        }
        System.out.println("\nAfter shift to the right :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(temp[i] + " \n");
        }

        //no.3
        System.out.println("\nNo.3");
        System.out.print("Original array\n");
        int[][] c = { //make 3x3 array
                {1, 2, 3}, {4, 5, 6}, {7,8,9}
        };
        //print the 3x3 array
        for (int x = 0; x < c.length; x++) {
            System.out.print("[");
            for (int y = 0; y < c[0].length; y++) {
                System.out.print(c[x][y] + ",");
            }
            System.out.print("]\n");
        }
        //call the function to transpose it
        c = transpose(c);
        System.out.println("\nTransposed array");

        for (int i = 0; i < c.length; i++) {
            System.out.print("[");
            for (int y = 0; y < c[0].length; y++) {
                System.out.print(c[i][y] + ",");
            }
            System.out.print("]\n");
        }
        if (c == transpose(c)) {
            System.out.print("Matrix is symmetric!");
        } else {
            System.out.print("Matrix is NOT symmetric!");
        }
    }
}

