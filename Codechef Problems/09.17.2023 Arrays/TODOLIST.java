https://www.codechef.com/viewsolution/1021260617
https://www.codechef.com/problems/TODOLIST

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
		    int b = sc.nextInt();
		    int count = 0;
		    int [] nums = new int[b];
		    for (int i = 0; i <b; i++)
		    {
		        nums[i] = sc.nextInt();
		        if (nums[i] >=1000)
		            count++;
		    }
		    System.out.println (count);
		    t--;
		}
	}
}
