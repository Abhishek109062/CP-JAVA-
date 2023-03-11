import java.util.Scanner;

// import Codeforces_03_01.leastPrefix;

public class A_Codeforces_Checking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = "codeforces";
            String temp = sc.next();
            if(s.contains(temp))
            System.out.println("YES");
            else
            System.out.println("NO");
        }
        
    }
}