/* Java FileOutputStream: Write a byte into a file  */

import java.io.FileOutputStream;

public class prac2a {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("f:/Varun/NPTEL Java Programming/Demonstration 12 Input-Output Streams/Practical 2/prac2a.txt");
            fout.write (65); // After writing the 65, this will turn into the byte form, and in 
            // ASCII code, number 65 means letter 'A'
            fout.close(); // Close the file before leaving
            System.out.println("File Writing is Over");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}