package Codeforces_03_01;

import java.util.*;

public class MKnezs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(n == 3)
            System.out.println("NO");
            else{
                System.out.println("YES");
                if(n % 2 == 0){
                    int i = 1;
                    while(i <= n){
                        if(i % 2 == 0)
                        System.out.print(-4 + " ");
                        else
                        System.out.print(4 + " ");


                        i++;
                    }
                }
                else{
                    int i = n/2;
                    int j = 0;
                    while(j < n){
                        if(j % 2 == 1)
                        System.out.print(-i + " ");
                        else
                        System.out.print(i - 1 + " ");

                        j++;
                    }
                }
                System.out.println();
                
            }

        }
        
    }
}
