/*
 * Write a method with following method header.
 * public static int gcd(int num1, int num2)
 * Write a program that prompts the user to enter two integers
 * and compute the gcd of two integers.
 */

import java.util.Scanner;

public class prac3a {
    public static void main(String[] args) {
        System.out.println("Varun Gaur, 210410107077, 21BECEG102, SY CE2B/ 2022-23");
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer:");
        a = sc.nextInt();
        System.out.println("Enter second integer:");
        b = sc.nextInt();
        System.out.println("GCD = " + gcd(a, b));
        sc.close();

    }

    public static int gcd(int num1, int num2) {
        int temp = num1;
        if (num2 > num1) {
            temp = num2;
        }

        while (temp > 0) {
            if (num1 % temp == 0 && num2 % temp == 0) {
                return temp;
            }
            temp--;
        }
        return 0;
    }
}