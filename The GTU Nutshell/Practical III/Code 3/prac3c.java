/*
Write a program that generate 6*6 two-dimensional matrix,
filled with 0’s and 1’s , display the matrix, check every raw
and column have an odd number’s of 1’s.
 */

import java.util.Random;

public class prac3c {
    public static void main(String[] args) {
        System.out.println("Varun Gaur, 210410107077, 21BECEG102, SY CE2B/ 2022-23");
        int rowFlag = 0, colFlag = 0;
        Random rn = new Random();
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (rn.nextBoolean() ? 1 : 0);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    temp++;
                }
            }
            if (temp % 2 == 0) {
                rowFlag = 1;

            }
        }

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[j][i] == 1) {
                    temp++;
                }
            }
            if (temp % 2 == 0) {
                rowFlag = 1;

            }
        }

        if (rowFlag == 0 && colFlag == 0) {
            System.out.println("Each row and col has odd number of 1's");
        } else {
            System.out.println("Each row and col doesn't have odd number of 1's");
        }
    }
}