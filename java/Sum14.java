import java.util.*;

public class Sum14 {
    public static void main(String[] args) {
        int [] arr = {2,6,5,8,11,12,9};
        int target = 20;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            if (!hm.containsKey(target - arr[i])) {
                hm.put(arr[i], i);
            } else
                System.out.println(hm.get(target - arr[i]) + ", " + i);
        }
    }
}
