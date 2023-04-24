import java.util.*;

public class HashMapTutorial {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Rajat", 98);
        map.put("Rishabh", 99);
        map.put("Bunty", 100);
        map.put("Rahul", 89);

        System.out.println(map);

//        System.out.println(map.containsKey("rajat"));
//        System.out.println(map.containsKey("Rishabh"));
//
//        System.out.println(map.get("Rajat"));

        int i = 1;
        for(Map.Entry<String, Integer> e: map.entrySet()) {
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
            System.out.println(i+". "+ e);
            i++;
        }
        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key);
            //System.out.println(map.get(key));
        }
    }
}
