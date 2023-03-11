import java.util.Scanner;

public class B_The_Forbidden_Permutation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int p = sc.nextInt();

            // int permute[] = new int[n];
            int ar[] = new int[m];
            int permute2[] = new int[n+1];
            for(int x = 0; x < n; x++)
            {
                // permute[x] = sc.nextInt();
                permute2[sc.nextInt()] = x+1;
            }
            
            int ans = Integer.MAX_VALUE;
            for(int x = 0; x < m; x++)
            ar[x] = sc.nextInt();
            

            // for(int x : permute2)
            // System.out.println(x);
            for(int x = 0; x < m-1; x++){
                int temp1 = permute2[ar[x]];
                int temp2 = permute2[ar[x+1]];
                
                if(temp2 < temp1 || temp2 > temp1 + p){
                    ans = 0;
                    break;
                }
                
                int val = temp1 + p - temp2 + 1;
                if(temp1 - 1 >= val || n - temp2 >= val || (temp1 - 1 + n - temp2) >= val){
                    ans = Math.min(ans, val);
                }

                if(ans > temp2 - temp1){
                    ans = temp2 - temp1;
                }
            }
            System.out.println(ans);
        }
        
    }

    // public static void swap(int[] ar, int p, int q)
}