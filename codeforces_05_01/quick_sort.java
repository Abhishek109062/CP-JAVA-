package codeforces_05_01;

import java.util.*;

public class quick_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int  n = sc.nextInt();
            int k = sc.nextInt();

            int ar[] = new int[n];
            int count = 0;
            int trio = 1;
            for(int x = 0;x < n; x++){
                ar[x] = sc.nextInt();
                if(ar[x] == trio){
                    count++;
                    trio++;
                }
            }
            int temp = (n - count)%k == 0 ? 0 : 1;
            System.out.println((n - count)/k + temp);

            
        }
        
    }    
}
