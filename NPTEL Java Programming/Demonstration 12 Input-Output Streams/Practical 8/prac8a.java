/*Java SequenceStreamExample:  Reading sequence of files*/

import java.io.*;
import java.util.zip.Inflater;
class prac8a {
    public static void main(String[] args) throws Exception {

        //Declare file streams

        FileInputStream file1 = null;
        FileInputStream file2 = null;
        SequenceInputStream file3 = null; // these two sources will be scanned, one by one, and that will be stored in this file
        // inst

        // Open the files to be concatenated
        file1 = new FileInputStream("F:/Varun/NPTEL Java Programming/Demonstration 12 Input-Output Streams/Practical 8/input1.txt");
        file2 = new FileInputStream("F:/Varun/NPTEL Java Programming/Demonstration 12 Input-Output Streams/Practical 8/input2.txt");

        file3 = new SequenceInputStream(file1, file2); // Concatenates file1 and file2

        BufferedInputStream inBuffer = new BufferedInputStream(file3);
        BufferedOutputStream outBuffer = new BufferedOutputStream(System.out);
        
        //Read and write till the end of buffers
        int ch;
        while ((ch = inBuffer.read())!= -1) {
            outBuffer.write((char)ch);
        }
        inBuffer.close();
        outBuffer.close();
        file1.close();
        file2.close();
    }
}
        // 
        // F:/Varun/NPTEL Java Programming/Demonstration 12 Input-Output Streams/Practical 8/input2.txt
