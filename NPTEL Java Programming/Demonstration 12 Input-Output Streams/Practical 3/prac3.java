/* Java FIleOutpitStreaFile write a stirng into a file */

import java.io.FileOutputStream;

public class prac3 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("F:/Varun/NPTEL Java Programming/Demonstration 12 Input-Output Streams/Practical 3/prac3.txt");
            String s = "Welcome to NPTEL! Hope you are enjoying Java programming";
            byte b[] = s.getBytes();
            //converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("File writing is over....");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}