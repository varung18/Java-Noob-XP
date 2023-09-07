/* Java FileInputStream: Reading a single character from a file */

import java.io.FileInputStream;

public class prac4 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("F:/Varun/NPTEL Java Programming/Demonstration 12 Input-Output Streams/Practical 4/prac4.txt");
            int i = fin.read(); //Read method always read one char at a time, Points the first character in the file
            System.out.print((char)i); //Returns in the form of ASCII value of the character. So we've done type casting
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}