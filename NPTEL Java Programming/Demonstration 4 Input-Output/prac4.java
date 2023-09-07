public class prac4 {
    public static void main (String args[]) {
        // check if length of args array is
        // greater than 0
        if (args.length >0) {
            System.out.println ("The command line" +
                                   "arguments are: ");

            // iterating the args array and printing
            // the command line arguments
            for (String val: args) //whatever the value is true will go on printing
                System.out.println(val); //its an alternative way to go the printing, as compared to prac3
                // where we had done the same by using for loop. 
        }
        else {
            System.out.println("No Command line " + 
                                    "arguments found.");
        }
    }
}
 