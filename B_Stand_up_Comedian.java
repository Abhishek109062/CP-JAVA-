import java.util.*;

class B_Stand_up_Comedian{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
        
        int ar[] = new int[4];
        int total = 0;
        for(int x = 0;x < 4; x++)
        {
            ar[x] = sc.nextInt();
            total += ar[x];
        }   
            int count = 0;
            int ac = 0;
            int bc = 0;
            int joke = 0;
            boolean flag = false;
            if(ar[0] == 0)
            {
                System.out.println(1);
                continue;
            }

            ac = ar[0] + ar[1];
            bc = ar[0] + ar[2];
            int mmn = ac > bc ? bc : ac;

            if(2 * (mmn) + 1 <= total)
                System.out.println(2* mmn + 1);
            else
            System.out.println(total);
        }
    }
}