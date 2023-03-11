import java.util.*;
public class B_Number_Factorization{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int maxt = 1;
             Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
            int aja = n;
            for(int x = 2; x*x <= n; x++){
                if(aja % x == 0){
                    int kitna = 0;
                    while(aja % x == 0){
                        kitna++;
                        aja /= x;
                    }

                    temp.put(x, kitna);
                    maxt = maxt > kitna ? maxt : kitna;
                }
            }
            if(aja != 1)
                temp.put(aja, 1);
            // System.out.println(temp);
            // if(n != 1)
            // temp.put(n, 1);
            // int multi = 0;

            // System.out.println(temp);
            // for(int x : temp.values()){
            //     if(x > maxt){
            //         maxt = x;
            //     }
            // }

            // System.out.println(temp);
            int ans = 0;
            for(int x = 0; x < maxt; x++){
                int temp1 = 1;
                for(int  y : temp.keySet()){
                    int comm = temp.get(y);
                    if(comm > 0){
                        temp.put(y, comm - 1);
                        temp1 = temp1 * y;
                    }
                }

                ans += temp1;
            }
            System.out.println(ans);
        }
        

        
    }

    
}