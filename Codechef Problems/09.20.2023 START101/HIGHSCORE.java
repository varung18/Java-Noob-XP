https://www.codechef.com/problems/HIGHSCORE

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
	        int n=sc.nextInt();
		        int a=sc.nextInt();
		        int b=sc.nextInt();
		        int c=sc.nextInt();
		        int d=sc.nextInt();
		        System.out.println(Math.max(a,Math.max(b,Math.max(c,d))));
	        t--;
	    }
	}
}
