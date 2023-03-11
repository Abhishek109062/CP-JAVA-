package Codechef.codechef_02_01;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class noSequences
{
    public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	        Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t-->0){
	            boolean flag = false;
	            int n = sc.nextInt();
	            int k = sc.nextInt();
	            long s = sc.nextInt();
	           // cal(new int[n], k,s,0,n)
	            // if(!cal(new int[n], k,s,0,n))
	            // System.out.print(-2);
	            
	            long cpoys = s;
	            // System.out.println();
                if(s % k != 0 && s % k != 1 && s % k != k-1)
                    {
                        System.out.print(-2);
                        continue;
                    }
                List<Long> ttrr = new ArrayList<>();
                for(int x = 0; x < n; x++){
                    long temp = s % k;
                    
                    if(k != 2 && temp == k - 1){
                        temp = -1;
                    }
                    ttrr.add(temp);
                    s = (s - temp)/k;
                }

                 s = 0;
                 for(int x = 0; x < n; x++){
                    s += ttrr.get(x) * Math.pow(k,x);
                 }

                 if(cpoys != s)
                 System.out.print(-2);
                 else{
                    for(long x : ttrr)
                    System.out.print(x + " ");
                 }
                 System.out.println();
	        }
	    } catch(Exception e) {
	        return;
	    }
	}
	
	// public static boolean cal(int ar[], long k, long s, int ind, long n){
	//     if(s == 0 && ind == n){
	//        // flag = true;
	//         for(int x = 0; x < ar.length - 1; x++) 
	//         System.out.print(ar[x] +" ");
	//         System.out.print(ar[ar.length - 1]);
	//         return true;
	//     }
	    
	//     if(ind == n || s < 0)
	//     return false;
	    
    //     // int temp[] = {-1,1,0};
    //     // for(int x = 0; x < temp.length; x++){
    //     //     ar[ind] = temp[x];
    //     //     if(cal(ar, k,s - temp[x]*(long)Math.pow(k,ind), ind+1, n))
	//     //     return true;
    //     //     ar[ind] = 0;
	        
    //     // }
	//     ar[ind] = 1;
	//     if(cal(ar, k,s - (long)Math.pow(k,ind), ind+1, n))
	//     return true;
	//     ar[ind] = 0;
	//     if(cal(ar, k,s, ind+1, n))
	//     return true;
	//     ar[ind] = -1;
	//     if(cal(ar, k,s + (long)Math.pow(k,ind), ind+1, n))
	//     return true;
	//     ar[ind] = 0;
	    
	//     return false;
	// }
}
