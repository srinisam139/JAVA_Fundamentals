package List;

public class MyArrayList<E> extends MyAbstractList<E>
{
	  public static final int INITIAL_CAPACITY = 2;
	  private E[] data = (E[])new Object[INITIAL_CAPACITY];

	  /** Create a default list */
	  public MyArrayList() {

	  }

	  /** Create a list from an array of objects */
	  public MyArrayList(E[] objects) {
	    for (int i = 0; i < objects.length; i++)
	      add(objects[i]); // Warning: don�t use super(objects)!
	  }

	  @Override /** Add a new element at the specified index */
	  public void add(int index, E e) 
	  {
	    checkIndex(index);
	    
	    ensureCapacity();

	    // Move the elements to the right after the specified index
	    for (int i = size - 1; i >= index; i--)
	      data[i + 1] = data[i];

	    // Insert new element to data[index]
	    data[index] = e;

	    // Increase size by 1
	    size++;
	  }

	  /** Create a new larger array, double the current size + 1 */
	  private void ensureCapacity() {
	    if (size >= data.length) {
			System.out.println("Max Capacity detected! Doubling the size before inserting a new element");
	      E[] newData = (E[])(new Object[size * 2]);
	      System.arraycopy(data, 0, newData, 0, size);
	      data = newData;
	    }
	  }

	  @Override /** Clear the list */
	  public void clear() {
	    for(int i=0;i<=size -1;i++){
			data[i]=null;
		}
	    size =0;
	  }

	  @Override /** Return true if this list contains the element */
	  public boolean contains(E e) {
	  	for(int i=0;i<size-1;i++){
	  		if (data[i] == e){
	  			return true;
			}
		}
	  	return false;
	  }

	  @Override /** Return the element at the specified index */
	  public E get(int index) {
		  for(int i=0;i<size-1;i++){
		  	if(index == i){
		  		return data[index];
			}
		  }
		  return null;
	  }

	  private void checkIndex(int index) {
		  if(index>=0 && index<data.length){
			  System.out.println("Index is not our of bounds");
		  } else {
			  System.out.println("Index is out of bounds");
		  }
	  }
	  
	  @Override /** Return the index of the first matching element 
	   *  in this list. Return -1 if no match. */
	  public int indexOf(E e) {
	  		for(int i=0;i<data.length;i++){
	  			if(data[i]==e){
	  				return i;
				}
			}
	  		return -1;
	  }

	  @Override /** Return the index of the last matching element 
	   *  in this list. Return -1 if no match. */
	  public int lastIndexOf(E e) {
	  	for(int i=data.length-1;i>=0;i--){
	  		if(data[i]==e){
	  			return i;
			}
		}
	  	return -1;
	  }

	  @Override /** Remove the element at the specified position 
	   *  in this list. Shift any subsequent elements to the left.
	   *  Return the element that was removed from the list. */
	  public E remove(int index) {
	  	E removed= data[index];
	  	data[index]=null;
			  for(int i=index;i<data.length-1;i++){
			  	E temp = data[i+1];
			  	data[i+1] = data[i];
			  	data[i]= temp;
			  }
			  size--;
			  return removed;
	  }

	  @Override /** Replace the element at the specified position 
	   *  in this list with the specified element. */
	  public E set(int index, E e) {
		if(index<=data.length-1){
			data[index]=e;
		}
		return e;
	  }

	  @Override
	  public String toString() {
  		StringBuilder str = new StringBuilder("[");
  		for(int i=0;i<data.length;i++){
  			str.append(data[i]);
  			if(i == data.length-1){
				str.append("]");
			}
  			else{
  				str.append(", ");
			}
		}
		return String.valueOf(str);

	  }

	  /** Trims the capacity to current size */
	  public void trimToSize() {
	  	size= data.length;
	  }

	  @Override /** Override iterator() defined in Iterable */
	  public java.util.Iterator<E> iterator() {
	    return new ArrayListIterator();
	  }
	 
	  private class ArrayListIterator 
	      implements java.util.Iterator<E> {
	    private int current = 0; // Current index 

	    @Override
	    public boolean hasNext() {
	      return (current < size);
	    }

	    @Override
	    public E next() {
	      return data[current++];
	    }

	    @Override
	    public void remove() {
	      MyArrayList.this.remove(current);
	    }
	  }
	}
