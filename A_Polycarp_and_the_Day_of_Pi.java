import java.util.*;

public class A_Polycarp_and_the_Day_of_Pi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();

            String temp = "3141592653589793238462643383279";
            int count = 0;
            for(int x = 0; x < s.length(); x++){
                if(s.charAt(x) == temp.charAt(x))
                count++;
                else
                break;
            }
            System.out.println(count);
        }
        
    }
}