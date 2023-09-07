/*
Write a program that prompts the user to enter a letter and
check whether a letter is a vowel or constant.
 */
import java.util.Scanner;

public class prac2b {
    public static void main(String[] args) {
        System.out.println("Varun Gaur, 210410107077, 21BECEG102, SY CE2B/ 2022-23");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a charactor: ");
        char data = sc.next().charAt(0);

        if (data == 'a' || data == 'A' || data == 'e' || data == 'E' || data == 'i' || data == 'I' || data == 'o'
                || data == 'O' || data == 'u' || data == 'U') {
            System.out.println("VOWEL");
        } else {
            System.out.println("CONSONANT");
        }
        sc.close();
    }
}