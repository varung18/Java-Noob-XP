import java.io.*;
class prac1 {
    public static void main(String[] args) {
        double principalAmount  = 0.0;
        double rateofInterest  = 0.0;
        int numberofYears = 0;
        // these all three values will be collected from the keyboard.
        try {
            DataInputStream in = new DataInputStream(System.in);   //Using this class we can read something from the sources.
            // It can read from memory, network channels, or from Standard input devices.
            String tempString;
            System.out.println("Enter Principal Amount: ");
            System.out.flush(); // Since keyboard has its own buffer, therefore we need to clean it
            tempString = in.readLine(); // Java will read the buffer as a stream and 'in' class will store it
            principalAmount = Float.valueOf(tempString); // String value is converted into the double value.

            System.out.println("Enter Rate of interest: ");
            System.out.flush();
            tempString = in.readLine();
            rateofInterest = Float.valueOf(tempString);

            System.out.println("Enter Number of Years: ");
            System.out.flush();
            tempString = in.readLine();
            numberofYears = Integer.parseInt(tempString);
        } catch (Exception e) {
            System.out.println("Exception:  " + e.getMessage());
        }
        // Input is over: calculate the interest
        double interesTotal = principalAmount * rateofInterest*numberofYears * 0.01;
        System.out.println("Total Interest = " + interesTotal);
    }
}
// USing the DataInputStream, we can create a stream object which connects your
// program to your keyboard. SO, the stream can be propogated from the input source to the program.