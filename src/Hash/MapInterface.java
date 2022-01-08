package Hash;

import java.util.Map;

/**
 * Map interface is created using the below methods.
 * @param <K>
 * @param <V>
 */
public interface MapInterface<K,V> {
    void put(K key, V value);
    V get(K key);
    int size();
}
