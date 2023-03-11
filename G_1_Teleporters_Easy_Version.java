import java.util.*;

public class G_1_Teleporters_Easy_Version {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();

            long arr[] = new long[n];
            for (int x = 0; x < n; x++)
                arr[x] = sc.nextInt();

            for(int x = 0; x < n; x++)
            arr[x] += x + 1;
            Arrays.sort(arr);

            System.out.println(findtheanswer(0, n, c, arr));
            
        }

    }

    public static int findtheanswer(int temp, int n , int c, long[] arr){
        while(temp < n && c >= arr[temp] ){
            c -= arr[temp++];
        }
        // System.out.println(temp);
        return temp;
    }


}


class StacksUsingArrays {
    public int[] data;
    public int tos;

    public static final int DEFAULT_CAPACITY = 10;

    public StacksUsingArrays() throws Exception {
        // TODO Auto-generated constructor stub
        this(DEFAULT_CAPACITY);
    }

    public StacksUsingArrays(int capacity) throws Exception {
        if (capacity <= 0) {
            System.out.println("Invalid Capacity");
        }
        this.data = new int[capacity];
        this.tos = -1;
    }

    public int size() {
        return this.tos + 1;
    }

    public boolean isEmpty() {
        if (this.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int item) throws Exception {
        if (this.size() == this.data.length) {
            throw new Exception("Stack is Full");
        }
        this.tos++;
        this.data[this.tos] = item;
    }

    public int pop() throws Exception {
        if (this.size() == 0) {
            throw new Exception("Stack is Empty");
        }
        int retVal = this.data[this.tos];
        this.data[this.tos] = 0;
        this.tos--;
        return retVal;
    }

    public int top() throws Exception {
        if (this.size() == 0) {
            throw new Exception("Stack is Empty");
        }
        int retVal = this.data[this.tos];
        return retVal;
    }

    public void display() throws Exception {
        if (this.size() == 0) {
            throw new Exception("Stack is Empty");
        }
        for (int i = this.tos; i >= 0; i--) {
            System.out.println(this.data[i]);
        }

    }

}