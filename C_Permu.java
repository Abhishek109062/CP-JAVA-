import java.util.*;
public class C_Permu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            int ar[][] = new int[n][n];
            for(int x = 0; x < n; x++){
                for(int y = 0;y < n-1; y++){
                    int temp = sc.nextInt();
                    ar[x][temp - 1] = temp;
                }
            }
            
            int ans[] = new int[n];
            int i = 0;
            for(int x = 0; x < n; x++){
                for(int y = 0; y < n; y++){
                    if(ar[x][y] == 0)
                    ans[i++] = y+1;
                }
            }

            for(int x : ans)
            System.out.print(x + " ");

            System.out.println();
        }
        
    }
}