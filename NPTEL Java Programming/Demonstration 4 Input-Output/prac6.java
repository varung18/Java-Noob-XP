//The following program snipper shows how to read and write to the console.

import java.util.*;

public class prac6 {
    public static void main (String args[]) {
        System.out.print("Enter the radius to find out its area: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = 3.14159*radius*radius;
        System.out.print("The area of the circle is: "+ area);
        // This prac shows that if we want to store the double, then we use nextDouble()
        // as in previous prac5, we used nextInt to store int.
    } 
}
