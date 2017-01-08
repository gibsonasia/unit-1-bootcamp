import com.sun.tools.javac.util.List;
import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {

    public static void main(String args[]) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat("Garfield"));
        cats.add(new Cat("Bobby"));
        cats.add(new Cat("Snowball"));
        cats.add(new Cat("Smokey"));
        cats.add(new Cat("Alex"));

        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i).getName());
        }

        Map<String, Integer> podMap = new HashMap<>();
        podMap.put("Danny", 22);
        podMap.put("Hyun", 25);
        podMap.put("Mel", 26);
        podMap.put("Rusi", 27);
        podMap.put("Asia", 24);

        Iterator<String> mapIterator = podMap.keySet().iterator();
        while (mapIterator.hasNext()) {
            String name = mapIterator.next();
            System.out.println(name + ": " + podMap.get(name));
        }

    }

    //not sure if I'm going in the right direction
    //Doesnt crash
    public static void mostFrequentElement(ArrayList<Integer> list) {
        Map<Integer, Integer> thisMap = new HashMap<>();
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
    }

    private static boolean canRentACar(Map<String, Integer> podMap) {
        Iterator<String> mapIterator = podMap.keySet().iterator();
        String name = mapIterator.next();
        if (podMap.get(name) > 25) {
            return true;
        } else {

            return false;
        }
    }
}
