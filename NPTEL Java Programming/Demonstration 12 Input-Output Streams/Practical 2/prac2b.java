/* Java FileOutputStream: Write a byte into a file  */

import java.io.*;

class prac2b {
    public static void main(String[] args) {
        byte cities[] = {'D', 'E', 'L' , 'H' , 'I' , ' ', 'V' , 'A' , 'D' , 'O' , 'D' , 'A' , 'R' , 'A' , ' ' , 'L' , 'O' , 'N' , 'D' , 'O', 'N'};
        FileOutputStream outfile  =null; // create an output file stream
        try {
            outfile = new FileOutputStream("F:/Varun/NPTEL Java Programming/Demonstration 12 Input-Output Streams/Practical 2/prac2b.txt");
            // Connect the outfile stream to "city.txt"
            outfile.write(cities);
            outfile.close();
        } catch (Exception ioe) {
            System.out.println(ioe);
            System.exit(-1);
        }

    }
}
