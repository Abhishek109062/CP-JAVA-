package codeforces_30_12;

import java.util.*;

public class koxia2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int ar[] = new int[n];            
            int i = 1;
            int j = n;
            int ind = 0;
              while(i <= j && ind < n-1){
                ar[ind++] = j--;
                ar[ind++] = i++;
            }

            if(n % 2 != 0)
            ar[ind] = n/2 + 1;
            for(int x : ar)
            System.out.print(x + " ");
        
            
        System.out.println();
    }
        
    }
}
