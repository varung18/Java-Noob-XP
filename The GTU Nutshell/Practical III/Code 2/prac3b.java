/*
Write a test program that prompts the user to enter ten
numbers, invoke a method to reverse the numbers, display
the numbers.
 */

import java.util.Scanner;

public class prac3b {
    public static void main(String[] args) {
        System.out.println("Varun Gaur, 210410107077, 21BECEG102, SY CE2B/ 2022-23");
        int size = 10;
        int[] arr = new int[size];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter integer no. " + i + ":");
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        display(arr);
        sc.close();
    }

    public static void reverse(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}