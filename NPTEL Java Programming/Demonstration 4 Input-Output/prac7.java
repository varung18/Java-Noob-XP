// Input with DataInputStream InterestCalculator Program

import java.io.*;

public class prac7 {
    public static void main (String args[]) /*throws Exception */ {
        float principalAmount = new Float(0);
        float rateofInterest = new Float(0);
        int numberofYears = 0;
        try {
            DataInputStream in = new DataInputStream(System.in);

            String tempString;
            System.out.print("Enter the Principal Amount: ");
            System.out.flush(); //Clears the buffer and garbage value
            tempString = in.readLine(); //stores the buffer entered from the keyboard
            principalAmount = Float.valueOf(tempString);

            System.out.print("Enter the value of your interest: ");
            System.out.flush();
            tempString = in.readLine();
            rateofInterest = Float.valueOf(tempString);

            System.out.print("Enter the number of Years: ");
            System.out.flush();
            tempString = in.readLine();
            numberofYears = Integer.valueOf(tempString);
            // Input section is over, time to calculate!!
            float interestTotal = (principalAmount*rateofInterest*numberofYears)/100;
            System.out.println("Total Interest is: "+ interestTotal);
        }
        catch (Exception ex) 
        {}
        // Its an example of Exception Handling.
        // Exception Handling is used in special cases when the compiler is not creating the bytecode.
        // Alternate way: remove the try-catch method and uncomment the parts on Line 6.
    }
}
