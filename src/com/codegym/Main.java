package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[5][];
        System.out.println("This matrix have 5 rows");
        for (int row = 0; row < matrix.length; row++) {
            System.out.println("Enter row " + row + " amount");
            matrix[row] = new int[input.nextInt()];
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int collum = 0; collum < matrix[row].length; collum++) {
                System.out.println("Enter row " + row + ", collum " + collum + " element");
                matrix[row][collum] = input.nextInt();
            }
        }
        int max = matrix[0][0];
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
//        for (int row = 0; row < matrix.length; row++) {
//            for (int collum = 0; collum < matrix[row].length; collum++) {
//                if (matrix[row][collum] > max) {
//                    max = matrix[row][collum];
//                }
//            }
//        }
        System.out.println("The biggest number in matrix is: " + max);
    }
}
