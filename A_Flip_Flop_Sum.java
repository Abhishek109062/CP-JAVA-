import java.util.Scanner;

class A_Flip_Flop_Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            
            int sum = 0;
            int ar[] = new int[n];
            boolean flag = false;
            boolean onlyone = true;
            for(int x = 0; x < n; x++){
                ar[x] = sc.nextInt();
                sum += ar[x];

                if(x != 0 && ar[x-1] == -1 && ar[x] == -1){
                    flag = true;
                }
                if(ar[x] == -1)
                onlyone = false;

            }

            if(flag)
            System.out.println(sum + 4);
            else if(onlyone)
            System.out.println(sum - 4);
            else
            System.out.println(sum);
        }
        
    }
}