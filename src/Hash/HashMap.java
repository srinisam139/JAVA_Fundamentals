package Hash;

public class HashMap<K,V> implements MapInterface<K,V>{
    Entry<K,V>[] array ;
    int counter = 0;
    public HashMap(){
        array = new Entry[100];
    }

    /**
     * The put method stores the value in the table and using hashing and indexing.
     * @param key
     * @param value
     */
    @Override
    public void put(K key, V value) {
        int hash = index(key);
        int searchIndex = hash;
        while(array[searchIndex] != null){

                if(array[searchIndex].getKey() != key){
                    searchIndex=(searchIndex+1)%(array.length);
                } else {
                    array[searchIndex].setValue(value);
                }
                if(searchIndex==hash) {
                    System.out.println("The Array is full");
                }
        }
        Entry<K,V> entry= new Entry(String.valueOf(hash),value);
        if(array[searchIndex]==null){
            array[searchIndex] =entry;
        }
    }

    /**
     * The get method gets the value from the hashtable by hashing the key again and indexing it to check whether the
     * array is matching or not, if the index is matching it will return the value.
     * @param key
     * @return
     */
    @Override
    public V get(K key) {
            int hash = index(key);
        int searchIndex = hash;
        while(array[searchIndex] != null){
            searchIndex=(searchIndex+1)%(array.length);
            if(array[searchIndex].getKey() != key){
                searchIndex=(searchIndex+1)%(array.length);
            }
            if(searchIndex==hash) {
                System.out.println("The Array is full, no value found");
            }
        }
        return array[searchIndex].getValue();
    }
    @Override
    public int size() {
        return 0;
    }

    /**
     * INdexing is done here by getting the hashcode of the value and returning the index within the array length.
     * @param key
     * @return
     */
    private int index(K key){
        int hashcode=key.hashCode();
        return (Math.abs(hashcode))%array.length;
    }

}
