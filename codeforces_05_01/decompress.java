package codeforces_05_01;

import java.util.*;

public class decompress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int  n = sc.nextInt();
            int ar[] = new int[n];

            int count[] = new int[n+1];
            for(int x = 0;x < n; x++)
            {
                ar[x] = sc.nextInt();
                count[ar[x]]++;
            }

        }
        
    }
}
