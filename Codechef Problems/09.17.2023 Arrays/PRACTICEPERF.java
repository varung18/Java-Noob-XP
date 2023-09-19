https://www.codechef.com/problems/PRACTICEPERF

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] x =  new int [4];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for (int j = 0; j< 4; j++) {
		    x[j] = sc.nextInt();
		    if (x[j] >= 10)
		        count++;
		}
		System.out.println (count);
	}
}
