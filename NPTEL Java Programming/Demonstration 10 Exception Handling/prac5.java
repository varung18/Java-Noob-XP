/* The folllowing program with exception
handling mechanism should */ 

class prac5 {
    public static void main(String[] args) {
        int number, invalidCount = 0, validCount = 0;
        for (int i = 0; i <args.length; i++) {
            try {
                number = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                invalidCount++;
                System.out.println("Invalid number at " + i);
            }
            validCount++;
            System.out.println("Valid Number at " + i + "  " + args);
        }
        System.out.println("Invalid entries: " + invalidCount);
        System.out.println("Valid entries: " + validCount);
    }
}

/* Note:
 * Run this program with the following input:
 * java prac5 1 2 3
 * java prac5 10 20 30 40
 * java prac5 1.0 2 3.0 40
 * java prac5 4.5 5
 */
