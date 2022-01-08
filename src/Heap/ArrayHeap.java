package Heap;

import java.util.*;

public class ArrayHeap implements HeapInterface {
    private static Random ran = new Random(5);
    private int[] array;
    private int size;
    private int root;
    public ArrayHeap(){
        this.array = new int[8];
        this.size =0;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Sifts a value up from the specified index in a heap.
     *
     * @param array The heap.
     * @param index The index to begin sifting up.
     */
    static void siftUp(int[] array, int index) {
        int parent = (index - 1) / 2;
        while(array[parent] > array[index]) {
            swap(array, index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    /**
     * Sifts a value down from the root in a heap.
     *
     * @param array The heap.
     * @param size The size of the heap.
     */
    static void siftDown(int[] array, int size) {
        int to = 0;
        int from;
        do {
            from = to;

            int left = 2 * from + 1;
            int right = left + 1;
            if(left < size && array[left] < array[to]) {
                to = left;
            }

            if(right < size && array[right] < array[to]) {
                to = right;
            }

            swap(array, from, to);

        } while(from != to);
    }

    /**
     * Swaps the values at the specified indexes.
     *
     * @param array The array in which the values should be swapped.
     * @param from The first index.
     * @param to The second index.
     */
    static void swap(int[] array, int from, int to) {
        if(from != to) {
            int tmp = array[from];
            array[from] = array[to];
            array[to] = tmp;
        }
    }

    /**
     * Adds the value to the heap
     *
     * @param value The new value in which added to the heap.
     */
    @Override
    public void add(int value) {
        if(array.length == size){
            array =Arrays.copyOf(array,size*2);
        }
        if(size==0){
            array[0] = value;
            size++;
        } else {
            array[size]=value;
            size++;
            for(int i=size-1;i>=0;i--){
                siftUp(array,i);
            }
        }
    }

    /**
     * The method will remove the topmost element from the root
     *
     * @return, It will return the removed element from the heap
     */
    @Override
    public int remove() {
        root = array[0];
        array[0]=array[size-1];
        array[size-1] = 0;
        size--;
        siftDown(array,size);
        return root;
    }

    /**
     *  The size will give the length of the heap
     * @return It will return the size of the heap
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     *  This method will print all the value from the heap object.
     * @return it will return a value in form of String.
     */
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        for (int j=0;j<size-1;j++) {
            str.append(array[j]);
            str.append(", ");
        }
        str.append(array[size-1]);
        return "The value added in the minimum heap are "+str;
    }

    public static void main(String[] args) {
        ArrayHeap arr = new ArrayHeap();
        arr.add(24);
        arr.add(60);
        arr.add(68);
        arr.add(73);
        arr.add(10);
        arr.add(35);
        arr.add(48);
        arr.add(56);
        arr.add(0);
        System.out.println(arr);
        System.out.println("The value removed from the heap is "+arr.remove());
        System.out.println(arr);

        ArrayHeap arr2 = new ArrayHeap();
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<100;i++){
            hs.add(ran.nextInt(1000));
        }
        System.out.println("The hashset value is "+hs);
        for (Integer h : hs) {
            arr2.add(h);
        }
        int[] load = new int[arr2.getSize()];
        //System.out.println("The size of new array used for storing hashset is "+load.length);
        for(int i=0;i<load.length;i++){
            load[i]=arr2.remove();
        }
        System.out.println("The values stored in an array after removing from the hashset are");
        for (int i : load) {
            System.out.print(i + " ");
        }
    }
}