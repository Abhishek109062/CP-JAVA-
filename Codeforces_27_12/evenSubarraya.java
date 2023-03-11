package Codeforces_27_12;
import java.util.*;

public class evenSubarraya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int s[] = new int[n+1];
            int count[] = new int[400000];
        
            // long ans = 0;
            for(int x = 1;x <= n; x++){
                s[x] = s[x - 1] ^ sc.nextInt();
            }
            int log = (int)(Math.log(n)/Math.log(2));
            count[0] = 1;

            long ans = 0;
            for(int x = 1; x <= n; x++){
                for(int y = 0; y*y < (2<<log); y++)
                ans += count[s[x]^(y*y)];

                count[s[x]]++;
            }
            System.out.println(n*(n+1)/2 - ans);
        }
    }   
}
