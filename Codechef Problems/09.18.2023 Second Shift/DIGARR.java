https://www.codechef.com/problems/DIGARR

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t>0) {
		    int length = sc.nextInt();
		    String num = sc.next();
		    int flag = 0;
		    for (int i= 0; i<length; i++) {
		        if (num.charAt(i) == '0' || num.charAt(i) == '5') {
		            flag = 1;
		        }
		    }
		    if (flag == 1)
		        System.out.println("YES");
		    else 
		        System.out.println("NO");
		    t--;
		}
	}
}
