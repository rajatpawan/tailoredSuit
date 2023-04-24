import java.util.HashSet;
import java.util.Iterator;

//HashSet
public class HashTutorial {

    public static void main(String args[]){

        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(5);
        set.add(100);
        set.add(21);
        set.add(50);
        set.add(66);
        set.add(10);

        System.out.println(set);

        set.remove(100);

        System.out.println(set);

        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
