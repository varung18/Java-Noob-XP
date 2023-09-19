https://www.codechef.com/problems/PALL01

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
		    int num = sc.nextInt();
		    int opp = 0;
		    int goat = num;
		    while (goat >0) {
		        int temp = goat%10;
		        opp = (opp*10) + temp;
		        goat = goat/10;
		    }
		    if (num == opp) {
		        System.out.println("wins");
		    }
		    else
		        System.out.println("loses");
		    t--;
		}
	}
}
