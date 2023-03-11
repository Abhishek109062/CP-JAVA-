import java.util.*;
class A_GamingForces{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
        
        int n = sc.nextInt();
        int ar[] = new int[n];
        int cr = 0;
        for(int x = 0;x < n; x++) {
            ar[x] = sc.nextInt();
            if(ar[x] == 1)
            cr++;
        }

        if(cr % 2 == 1)
        System.out.println(n - cr/2);
        else
        System.out.println(n - cr/2);
    }
    }
}