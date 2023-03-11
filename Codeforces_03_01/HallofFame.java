package Codeforces_03_01;

import java.util.Scanner;

public class HallofFame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

                int rind = -1;
                int lind = -1;

                for(int x = 0;x < n; x++){
                    if(s.charAt(x) == 'R')
                    {
                        rind = x;
                        break;
                    }
                }

                for(int x = 0;x < n; x++){
                    if(s.charAt(x) == 'L')
                    {
                        lind = x;
                        break;
                    }
                }
                
                if(rind == -1 || lind == -1)
                System.out.println(-1);
                else if(rind < lind)
                System.out.println(0);
                else
                System.out.println(Math.abs(rind - lind)) ;


            
        }
        
    }
}
