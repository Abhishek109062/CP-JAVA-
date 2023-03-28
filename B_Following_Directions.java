import java.util.Scanner;

public class B_Following_Directions{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t-- > 0){
            int n = sc.nextInt();
            char ch[] = sc.next().toCharArray();
            int x = 0;
            int y = 0;
            boolean flag = false;
            for(char c : ch){
                switch(c){
                    case 'U' :
                    y++;
                    break;
                    case 'D' :
                    y--;
                    break;
                    case 'R' :
                    x++;
                    break;
                    case 'L' :
                    x--;
                    break;
                }
                if(x == 1 && y == 1){
                    flag = true;
                    break;
                }
            }

             if(flag)
            System.out.println("YES");
            else
            System.out.println("NO"); // System.out.println(x + " " + y);
          
       }
        
    }
}