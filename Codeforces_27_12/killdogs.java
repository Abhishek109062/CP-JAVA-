package Codeforces_27_12;

import java.util.Scanner;

public class killdogs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            int mod = 1000000007;
            n = n%mod;

            long a = n;
            long b = n+1; 
            long c = 4*n - 1;
            
            if(a % 2 == 0)
            a /= 2;
            else if(b % 2 == 0)
            b /= 2;
            else if(c % 2 == 0)
            c /= 2;

            if(a % 3 == 0)
            a /= 3;
            else if(b % 3 == 0)
            b /= 3;
            else if(c % 3 == 0)
            c /= 3;
            

            long ans = (a * b) %mod;
            ans = (ans * c) % mod;
            ans = (ans * 2022) % mod;
            
            System.out.println(ans);
        }
    }
}
