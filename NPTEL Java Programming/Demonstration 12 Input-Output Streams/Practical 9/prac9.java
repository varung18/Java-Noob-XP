/*Handling a random access file */

import java.io.*;
class prac9 {
    public static void main(String[] args) {
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile("rand.dat", "rw"); //it can be opened on the both mode

            //Writing to the file
            file.writeChar ('X');
            file.writeInt(618);
            file.writeDouble(7.91046);

            file.seek(0); // Go to the beginning

            //Reading from the file
            System.out.println(file.readChar());
            System.out.println(file.readInt());
            System.out.println(file.readDouble());

            file.seek(2); // Go to the second item
            System.out.println(file.readInt());

            // Go to the end and append false to the file
            file.seek(file.length()); // returns the size of the file
            file.writeBoolean(false);
            file.seek(4);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}