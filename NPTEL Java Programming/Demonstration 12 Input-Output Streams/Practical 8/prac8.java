/*Java SequenceStreamExample:  Reading sequence of files*/

import java.io.*;
class prac8 {
    public static void main(String[] args) throws Exception {
        FileInputStream input1 = new FileInputStream ("F:/Varun/NPTEL Java Programming/Demonstration 12 Input-Output Streams/Practical 8/input1.txt");
        FileInputStream input2 = new FileInputStream ("F:/Varun/NPTEL Java Programming/Demonstration 12 Input-Output Streams/Practical 8/input2.txt");
        SequenceInputStream inst = new SequenceInputStream(input1, input2); // these two sources will be scanned, one by one, and that will be stored in the
        // inst

        int j;
        while ((j = inst.read())!= -1) {
            System.out.print((char)j);
        }
        inst.close();
        input1.close();
        input2.close();
    }
}