/*
Assume a vehicle plate number consists of three uppercase
letters followed by four digits. Write a program to generate a
plate number.
 */

import java.util.Random; 
public class prac2c {
    public static void main(String[] args) {
        System.out.println("Varun Gaur, 210410107077, 21BECEG102, SY CE2B/ 2022-23");
        Random random = new Random();
        int num = random.nextInt(9999);
        char a = (char) random.nextInt(65, 90);
        char b = (char) random.nextInt(65, 90);
        char c = (char) random.nextInt(65, 90);
        System.out.printf("%c%c%c%d", a, b, c, num);
    }
}