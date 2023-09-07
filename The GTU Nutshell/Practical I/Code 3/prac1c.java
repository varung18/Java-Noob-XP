/*
Write a program that reads a number in meters, converts it to
feet, and displays the result.
 */

import java.util.Scanner;

public class prac1c {
    public static void main(String[] args) {
        System.out.println("Varun Gaur, 210410107077, 21BECEG102, SY-CE 2B/ 2022-23");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length in meters:");
        double meters = sc.nextDouble();
        System.out.println(meters + " meter = " + meters * 3.28084 + " feet");
        sc.close();

    }
}