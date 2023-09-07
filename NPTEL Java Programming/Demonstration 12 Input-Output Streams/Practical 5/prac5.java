/*Using class file to check the file status */

import java.io.*;

class prac5 {
    public static void getPaths (File f) throws IOException {
        System.out.println("Name: " + f.getName());          //Name of the file
        System.out.println("Path : " + f.getPath());         // Path of the file
        System.out.println( "Parent: " + f.getParent());     // Any Parent if it is there
    }

    public static void getInfo (File f) throws IOException {
        if (f.exists()) {
            System.out.print("File Exists");
            System.out.println(f.canRead()? "and is readable" : " ");
            System.out.println(f.canWrite() ? "and is Writable" : "  ");
            System.out.println("File is last modified: " + f.lastModified());
            System.out.println("File is " + f.length() + "bytes");
        }
        else {
            System.err.println(" file doesn't exist. ");
        }
    }
    public static void main(String[] args) throws IOException {
        File fileToCheck;
        if (args.length > 0) { //We can check as many files as we want by separating it with commas.
            for (int i = 0; i< args.length; i++) {
                fileToCheck = new File(args[i]);
                getPaths(fileToCheck);
                getInfo(fileToCheck);
            }
        } else {
            System.out.println(" Usage : Java file test <file name (s) >");
        }
    }
}