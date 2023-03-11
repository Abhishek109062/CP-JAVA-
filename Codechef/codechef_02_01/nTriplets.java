package Codechef.codechef_02_01;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class nTriplets
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	        Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t-->0){
	            int n = sc.nextInt();
	            
	        //    List<Integer> temp = new 
                int[] ar = new int[2];
	            int i = 0;
	            for(int x = 2; x*x <= n && i <= 1; x++){
	                if(n % x == 0)
	                ar[i++] = x;
	            }
	            
	            if(i == 2)
	            System.out.println(n +" "+ar[0]+" "+ar[1]);
	            else
	            System.out.println(-1);
	        }    
	    } catch(Exception e) {
	        return;
	    }
	}
}
