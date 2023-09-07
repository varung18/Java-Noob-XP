class prac1 {
    public static void main (String args[]) {
        int count = 1;
        System.out.println ("Printing the first 10 odd numbers: ");
        while (count < 11) {
            System.out.print ("  " + ((2*count) -1));
            count++;
        }
    }
}