import java.util.Scanner;

class D_Distinct_Split{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            char[] ch = sc.next().toCharArray();

            int temp[][] = new int[n][26];
            temp[0][ch[0] - 'a'] = 1;

            for(int x = 1; x < n; x++){
                for(int y = 0; y < 26; y++){
                    temp[x][y] = temp[x-1][y];
                    if(y == ch[x] - 'a')
                    temp[x][y]++;
                }
            }

            long ans = calculate(n, temp, 0);
            
            System.out.println(ans);

        }

        
        
    }

    public static int calculate(int n, int temp[][], int ans){
        for(int x = 1; x < n; x++){
            int kaha1 = 0;
            int kaha2 = 0;
            for(int y = 0;y < 26; y++){
                if(temp[x-1][y] != 0)
                kaha1++;
                if(temp[n-1][y] - temp[x-1][y] != 0)
                kaha2++;
            }

            if(ans < kaha1 + kaha2)
            ans = kaha1 + kaha2;
    
        }
        return ans;
    }


    public static void come(String[] args) {
        int t = 0;
        while(t-- > 0){
            String s = "codeforces";
            String temp = "";
            // if(s.contains(temp))
            // System.out.println("YES");
            // else
            // System.out.println("NO");
        }
        
    }


    class Node{
        int val;
        Node right;
        Node left;
    }

    private Node root;
    Scanner sc = new Scanner(System.in);
    class Binary_Tree{

    }

    public static boolean isBalanced(String str, StacksUsingArrays obj) throws Exception {
        int len = str.length();
        
        for(int x = 0; x < len; x++){
            // stack.push(1);
            char ch=str.charAt(x);
            System.out.println(ch);
            if(ch=='(' || ch=='{' || ch=='[')
                obj.push(ch);
            else{
                if(obj.isEmpty())
                    return false;
                
                else if((obj.top()=='(' && ch!=')') || (obj.top()=='{' && ch!='}') || (obj.top()=='[' && ch!=']'))
                    return false;
                else 
                    obj.pop();
            }
        }

        return obj.isEmpty();
}
}