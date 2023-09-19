https://www.codechef.com/problems/RECENTCONT?tab=statement

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
		    int prob = sc.nextInt();
		    int start=0;
		    int time = 0;
		    for (int i=0; i <prob; i++) {
		        String he = sc.next();
		        if (he.equals("START38"))
		            start++;
		            
		        if (he.equals("LTIME108"))
		            time++;
		    }
		    System.out.println(start + " " + time);
		    t--;
		}
	}
}
