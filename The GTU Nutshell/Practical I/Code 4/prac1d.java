/*
Body Mass Index (BMI) is a measure of health on weight. It can
be calculated by taking your weight in kilograms and dividing
by the square of your height in meters. Write a program that
prompts the user to enter a weight in pounds and height in
inches and displays the BMI.
Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters.
 */

import java.util.Scanner;

public class prac1d {
    public static void main(String[] args) {
        System.out.println("Varun Gaur, 210410107077, 21BECEG102, SY CE-2B/ 2022-23");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight in pounds(lbs):");
        double weight = sc.nextDouble();
        System.out.println("Enter your height in inches:");
        double height = sc.nextDouble();
        System.out.println("Your BMI = " + (weight * .45359237) / Math.pow(height * .0254, 2));
        sc.close();

    }
}