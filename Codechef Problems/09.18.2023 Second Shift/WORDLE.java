https://www.codechef.com/problems/WORDLE

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while (t>0) {
		    String hidden = sc.next();
		    String guess = sc.next();
		    
		    for (int i = 0; i<5; i++) {
		        if (hidden.charAt(i) == guess.charAt(i))
		            System.out.print ("G");
		        else  
		            System.out.print("B");
		    }
		    System.out.println();
		    t--;
		}
	}
}
