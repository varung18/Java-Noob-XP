https://www.codechef.com/problems/TLG?tab=statement

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
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		int a1=0,b1=0,lead=0,win=-1;
		while(t!=0){
		    //int a=0,b=0,lead=0,win=-1;
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    a1+=a;
		    b1+=b;
		    if(a1-b1>lead){
		        win=1;
		        lead=a1-b1;
		    }if (b1-a1>lead){
		        win=2;
		        lead=b1-a1;
		    }
		    t--;
		    
		}System.out.println(win+" "+lead);
	}
}
