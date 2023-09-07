/* Example of BufferedOutputStream class for writing into a file */

import java.io.*;
import java.text.FieldPosition;
public class prac7 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("F:/Varun/NPTEL Java Programming/Demonstration 12 Input-Output Streams/Practical 7/testou1.txt");
        // Above states the target location to save
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Welcome to NPTEL!"; // Thats what we want to write
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Success!");
    }
}