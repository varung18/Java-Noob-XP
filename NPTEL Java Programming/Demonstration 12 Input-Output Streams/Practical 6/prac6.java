/*Copying a file into another file using CharacterStream class */

import java.io.*;
class prac6 {
    public static void main(String[] args) {
        // Declare and create input and output files
        File inFile = new File ("F:/Varun/NPTEL Java Programming/Demonstration 12 Input-Output Streams/Practical 6/input.dat");
        //above file is mandatory to exist.
        File outFile = new File ("F:/Varun/NPTEL Java Programming/Demonstration 12 Input-Output Streams/Practical 6/output.dat");
        FileReader ins = null; //Created for input file purposs
        FileWriter outs = null;
        //Creates file stream outs
        try {
            ins = new FileReader(inFile); // ins serves a connection between you and infile
            //Opens inFile
            outs = new FileWriter(outFile);
            //Opens outfile
            int ch;
            //Read and write till the end
            while ((ch = ins.read()) !=-1) { // this means to read the entire file, this condition reads the file
                outs.write(ch); // and this condition writes in the output file
            }
        } catch (Exception e) {
            System.out.println(e);
            System.exit(-1);
        } finally { //Close files
            try {
                ins.close();
                outs.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}