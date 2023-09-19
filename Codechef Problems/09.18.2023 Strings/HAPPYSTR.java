https://www.codechef.com/problems/HAPPYSTR

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
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t>0) {
		    char [] hell = sc.next().toCharArray();
		    int count = 0;
		    int flag = 0;
		    for (int i = 0; i<hell.length; i++) {
		        if (hell[i] == 'a'|| hell[i] == 'e'|| hell[i] == 'i'|| hell[i] == 'o'|| hell[i] == 'u'){
		            count++;
		               if (count>2) {
		                flag = 1;
		                break;
		            }
		           }
		           else
		            count = 0;
		    }
		    if (flag == 1)
		        System.out.println("Happy");
		  
		    else
		        System.out.println("Sad");
		    t--;
		}
	}
}
