// Java program to demostrate working of print() and println() together.
 
class prac1a {
    public static void main (String args[]) {
        int x = 942;
        System.out.println("1. println ");
        System.out.println("2. println ");

        System.out.print("1. print ");
        System.out.print("\n");
        System.out.print("2. print " + "3. print" + x);
// Above line shows the concatenation. In the above, we cannot use "this" keyword
// as there's no collision or constructors
    }
}