/*
Write a program that prompts the user to enter three integers
and display the integers in decreasing order.
*/

import java.util.Scanner;

public class prac2a {
    public static void main(String[] args) {
        System.out.println("Varun Gaur, 21041017077, 21BECEG102, SY CE 2B/ 2022-23");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter integer no. " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

        sc.close();
    }
}