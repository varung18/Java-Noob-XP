https://www.codechef.com/problems/NUM239

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
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int count = 0;
	        for (int i = a; i<=b; i++) {
	            if (i%10 == 2 || i%10 == 3 ||i%10 == 9)
	                count++;
	        }
	        System.out.println (count);
	        t--;
	    }
	}
}
