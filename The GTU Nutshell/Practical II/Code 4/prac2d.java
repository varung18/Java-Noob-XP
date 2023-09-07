/*
 Write a program that reads an integer and displays all its
smallest factors in increasing order. For example if input
number is 120, the output should be as follows:2,2,2,3,5.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class prac2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Varun Gaur, 210410107077, 21BECEG102, SY CE2B, 2022-23");
        System.out.println("Enter a integer:");
        Integer data = sc.nextInt();
        Integer temp = 2;
        ArrayList<Integer> arr = new ArrayList<>();
        while (data > 1) {
            if (data % temp == 0) {
                data = data / temp;
                arr.add(temp);

            } else {
                temp++;
            }

        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        sc.close();

    }
}