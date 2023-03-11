package Codechef.codechef_28_12;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class petstroe
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	        Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t-->0){
				int n = sc.nextInt();
				int[] ar = new int[n];
				for(int x = 0;x < n;x++)
				ar[x] = sc.nextInt();

				Map<Integer, Integer> temp = new HashMap<>();
				for(int x: ar)
				temp.put(x, temp.getOrDefault(x, 0) + 1);

				boolean flag = true;
				for(int x: temp.keySet()){
					if(temp.get(x) % 2 == 0);
					else{
						flag = false;
						break;
					}
				}
				if(flag)
				System.out.println("YES");
				else
				System.out.println("NO");
	        }    
	    } catch(Exception e) {
	        return;
	    }
	}
}
