
import java.util.*;
import java.util.stream.Collectors;
public class SortMapByValues {
    public static void main(String[] args) {
        HashMap<String,Integer>hashmap=new HashMap<>();
        hashmap.put("Ali", 92);
        hashmap.put("Bassam", 99);
        hashmap.put("umer", 89);

      Map<String, Integer> sortedMap= hashmap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(
        Map.Entry::getKey,
        Map.Entry::getValue,
        (e1,e2)->e1,
        LinkedHashMap::new
        
        ));
        System.out.println(sortedMap);
    }
}
