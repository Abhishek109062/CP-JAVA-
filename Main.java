import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int max_val = Arrays.stream(arr).max().getAsInt();
        int min_collisions = n;
        int selected_int = 1;
        for (int i = 0; i < n ; i++) {
            Set<Integer> modulos = new HashSet<>();
            for (int j = 0; j < n; j++) {
                modulos.add(arr[j] % arr[i]);
            }
            int collisions = n - modulos.size();
            if (collisions <= min_collisions) {
				if(collisions == min_collisions && arr[selected_int] > arr[i]){
					selected_int = i;
				}
				else{
                	min_collisions = collisions;
                	selected_int = i;
				}
            }
        }
        System.out.println(arr[selected_int]);
    }
}
