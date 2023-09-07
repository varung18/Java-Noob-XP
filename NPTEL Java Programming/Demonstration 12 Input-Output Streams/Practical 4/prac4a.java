/* Java FileInputStream: Reading a single character from a file */

import java.io.FileInputStream;

public class prac4a {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("F:/Varun/NPTEL Java Programming/Demonstration 12 Input-Output Streams/Practical 4/prac4.txt");
            int i = 0;
            while ((i=fin.read())!=-1) { // -1 means the end of file
                System.out.print((char)i);//Returns in the form of ASCII value of the character. So we've done type casting
            }
            // this loop will help to read the entire text. It will read the file sequentially          
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}