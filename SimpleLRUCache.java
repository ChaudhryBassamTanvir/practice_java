
import java.util.LinkedHashMap;

public class SimpleLRUCache {
public class LRUCache<k,V> extends LinkedHashMap<K, V>{
    private final int capacity;

    public LRUCache(int capacity){
        super(capacity,0.75f,true);

        this.capacity=capacity;
    }


    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
        return size()>capacity;
    }

}


    public static void main(String[] args) {
        
    }
}
