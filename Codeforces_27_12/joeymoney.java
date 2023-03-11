package Codeforces_27_12;

import java.util.Scanner;

public class joeymoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            // int ar[] = new int[n];
            long mul = 1;
            for(int x = 0; x < n; x++){
                mul *= sc.nextInt();
            }
            mul = (mul + n- 1)*2022;
            System.out.println(mul);
        }
    }
}
