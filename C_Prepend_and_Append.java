import java.util.Scanner;

// import org.w3c.dom.css.ElementCSSInlineStyle;

class C_Prepend_and_Append{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            char ch[] = sc.next().toCharArray();

            int i = 0;
            int j = n-1;
            int ans = 0;

            while(i < j){
                if(ch[i] != ch[j])
                {
                    i++; j--;
                }
                else
                break;

                
            }
            if(i-1 == j)
            ans = 0;
            else if (i==j)
            ans = 1;
            else
            ans = j - i + 1;
            System.out.println(ans);
        }
        
    }
}