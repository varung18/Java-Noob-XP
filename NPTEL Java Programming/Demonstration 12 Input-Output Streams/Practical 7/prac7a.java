/*Example of Java BufferedInputStream for reading from a file */

import java.io.*;

public class prac7a {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("F:/Varun/NPTEL Java Programming/Demonstration 12 Input-Output Streams/Practical 7/out.dat");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while ((i=bin.read())!=-1) {
                System.out.print((char)i);
            }
            bin.close();
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
