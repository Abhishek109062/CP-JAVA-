package Codeforces_03_01;

import java.util.*;

public class leastPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int ar[] = new int[n];

            for(int x = 0;x < n;x++)
            ar[x] = sc.nextInt();

            if(n == 1)
            System.out.println(0);
            else{           
            PriorityQueue<Integer> temp = new PriorityQueue<>();
            int ans = 0;
            int total = 0;
            for(int x = m;x < n;x++){
                total += ar[x];

                if(ar[x] < 0)
                temp.add(ar[x]);

                while(total < 0 && !temp.isEmpty()){
                    total += temp.poll()*-2;
                    ans++;
                }   
            }
            
            ans = sec(ar,m,total, ans);
            System.out.println(ans);
            }
        }
        
    }

    public static int sec(int[] ar, int m, int total, int ans){
        if(ar[m-1] <= 0)
            total = ar[m-1];
        else if(m != 1){
                total = -1*ar[m-1];
                ans++;
            }
            // total = 0;
            PriorityQueue<Integer> temp = new PriorityQueue<>();
            for(int x = m-2; x >= 1; x--){
                total += ar[x];

                if(ar[x] > 0)
                temp.add(ar[x]);

                while(total > 0 && !temp.isEmpty()){
                    // if(x == m)
                    // break;
                    ans++;
                    total += -2*temp.poll(); 
                }
            }

            return ans;
    }
}

