https://www.codechef.com/problems/DOLL

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while (t>0) {
		    int play = sc.nextInt();
		    int height = sc.nextInt();
		    int kill = 0;
		    for (int i = 0; i< play; i++) {
		        int x = sc.nextInt();
		        if (x > height)
		            kill++;
		    }
		    System.out.println (kill);
		    t--;
		}
	}
}
