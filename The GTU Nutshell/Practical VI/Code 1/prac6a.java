/*
Write a program to create a file name 123.txt, if it does not
exist. Append a new data to it if it already exist. write 150
integers created randomly into the file using Text I/O.
Integers are separated by space.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class prac6a {
    public static void main(String[] args) {
        System.out.println("Varun Gaur, 210410107077, 21BECEG102, SY CE2B/ 2022-23");
        try {
            FileWriter fr = new FileWriter(new File("123.txt"), true);
            BufferedWriter br = new BufferedWriter(fr);
            Random random = new Random();
            for (int i = 0; i < 150; i++) {
                br.write(random.nextInt() + " ");
            }
            br.close();
            fr.close();

        } catch (IOException E) {
            System.out.println("There exist adirectory with this name");
        }
    }
}