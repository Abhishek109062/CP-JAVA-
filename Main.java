import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int ar[] = new int[n];
        Map<Integer, Integer> map = new HashMap<>();

        for (int x = 0; x < n; x++) {
            int temp = sc.nextInt();
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        Map<Integer, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        int ans[] = new int[k];

        for (int x = sortedMap.size()-1; x > sortedMap.size() - k; x--) {
            
        }
    }
}