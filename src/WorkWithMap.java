import java.security.Key;
import java.util.HashMap;
import java.util.Map;

// the key in map con not duplicate
// each key can map to at most one value
public class WorkWithMap {
    public static void main(String[] args) {
        Map<Integer,Student> map = new HashMap<>() ;
        map.put(902118,new Student("Yamen Amjad"));
        map.put(902114,new Student("Malek Ahmed"));
        map.put(902117,new Student("Mariam Marwan"));
        // map.put(902117,new Student("Mariam Marwan"));//does not give me error but no change on map done
        // if we have different two value to the same key the key will take the last value //
        System.out.println(map);
        System.out.println(map.size());
        map.remove(902117);
        System.out.println(map.get(902118));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());// print the keys
        System.out.println(map.entrySet());// print the values
        System.out.println("the for each on values :");
        map.entrySet().forEach(System.out::println);
        System.out.println();
        map.entrySet().forEach(x-> System.out.println(x.getKey() + " " + x.getValue()));
        System.out.println();
        map.forEach((Integer , Student)->{ // i can put Key rather than Integer
            System.out.println(Integer + " " + Student) ;
        });
        System.out.println(map.getOrDefault(902117 , new Student("default")));
        System.out.println(map.values());
    }
    record Student(String name){};
}
