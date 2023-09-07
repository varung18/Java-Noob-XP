// Program which demonstrates how to take Input using scanner class
import java.util.Scanner;

public class prac5 {
    public static void main (String args[]) {
        Scanner scnr = new Scanner(System.in);
        // Calcualting the maximum two numbers in Java
        System.out.println ("Please enter two numbers to find out which is greater: ");
        int a = scnr.nextInt(); //it just acts as cin for integers for Java
        int b = scnr.nextInt();

        if (a > b) {
            System.out.printf("Between %d and %d, %d is greater", a, b, a);
        }
        else {
            System.out.printf("Between %d and %d, %d is greater", a, b, b);           
        }
    }
}
