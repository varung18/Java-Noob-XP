/*Copying a file into another file using ByteStream class */
//In the last practical, 6, the program was able to read text through a char, but in this one, it will read via bytes
//When heterogenous stream is concerned, then bytestream is recommended, for eg from Windows to MacOS
import java.io.*;
class prac6a {
    public static void main(String[] args) {
        // Declare and create input and output files
        FileInputStream inFile = null;      // Input Stream
        FileOutputStream outFile = null;    // Output Stream
        
        byte byteRead; // Declare a variable to a hold a byte

        try {
            //Connect infile to in.dat
            inFile = new FileInputStream("F:/Varun/NPTEL Java Programming/Demonstration 12 Input-Output Streams/Practical 6/in.dat");
            //Connect outfile to out.dat
            outFile = new FileOutputStream("F:/Varun/NPTEL Java Programming/Demonstration 12 Input-Output Streams/Practical 6/out.dat");

            //Reading bytes from in.dat frim writing to out.dat
            byteRead = (byte) infile.read();

            while (byteRead !=-1) { // this means to read the entire file, this condition reads the file
                outFile.write(byteRead); // and this condition writes in the output file
                byteRead = (byte)infile.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("file Not Found ");
        }
        catch (IOException e) {
            System.out.println(e);
        }
        finally { //Close files
            try {
                ins.close();
                outs.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}