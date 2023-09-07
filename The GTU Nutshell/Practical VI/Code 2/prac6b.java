/*
 Write a recursive method that returns the smallest integer in an
array. Write a test program that prompts the user to enter an
integer and display its product.
 */
import java.util.Arrays;
import java.util.Scanner;

public class prac6b {
    public static int minimumInteger(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        } else {
            return Math.min(arr[0], minimumInteger(Arrays.copyOfRange(arr, 1, arr.length)));
        }
    }

    public static void main(String[] args) {
        System.out.println("Varun Gaur, 210410107077, 21BECEG102, SY CE2B/ 2022-23");
        int product = 1, temp;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Integer No: " + (i + 1));
            temp = sc.nextInt();
            product *= temp;
        }
        System.out.println("Product is " + product + ".");
        sc.close();
    }
}