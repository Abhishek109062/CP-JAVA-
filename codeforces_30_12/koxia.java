package codeforces_30_12;

import java.util.*;

public class koxia {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
        int m = sc.nextInt(), n = sc.nextInt();
        Queue<Integer> temp = new PriorityQueue<>();
        int ar2[] = new int[n];

        for(int x = 0; x < m; x++)
            temp.add(sc.nextInt());

            for(int x = 0; x < n; x++){
                temp.poll();
                temp.add(sc.nextInt());
            }
            long sum = 0;
            while(!temp.isEmpty()){
                sum += temp.poll();
            }
        System.out.println(sum);
        
        
    }
    
    }   
}
