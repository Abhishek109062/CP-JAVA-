import java.util.*;

// import codeforces_05_01.quick_sort;

class E_Negatives_and_Positives{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int ar[] = new int[n];
            for(int x = 0; x < n; x++){
                ar[x] = sc.nextInt();
            }
            long total  = 0;
            long kitnebane = 0;
            for(int x = 0; x < ar.length; x++){
                if(ar[x] < 0)
                kitnebane++;
                
                ar[x] = Math.abs(ar[x]);
                total += ar[x];

            }
            Arrays.sort(ar);
            if(kitnebane % 2 == 0){
                System.out.println(total);
            }
            else
            System.out.println(total - 2*ar[0]);
        
    }
}
}