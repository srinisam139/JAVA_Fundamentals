package List;

public class MyLinkedList<E> extends MyAbstractList<E> {
	  private Node<E> head,tail;

	  /** Create a default list */
	  public MyLinkedList() {
	  }

	  /** Create a list from an array of objects */
	  public MyLinkedList(E[] objects) {
	    super(objects);
	  }

	  /** Return the head element in the list */
	  public E getFirst() {
		  return head.element;
	  }

	  /** Return the last element in the list */
	  public E getLast() {
			return tail.element;
	  }

	  /** Add an element to the beginning of the list */
	  public void addFirst(E e) {
	  	Node<E> newNode = new Node<E>(e);
	  		newNode.element=e;
	  		newNode.next=head;
	  		head=newNode;
	  		size++;
	  		if(tail == null){
	  			tail=head;
			}
	  }

	  /** Add an element to the end of the list */
	  public void addLast(E e) {
	  	if(tail==null){
	  		head=tail=new Node<E>(e);
		} else {
			Node<E> lastNode = new Node<E>(e);
			tail.next=lastNode;
			tail=tail.next;
		}
		  size++;
	  }


	  @Override /** Add a new element at the specified index 
	   * in this list. The index of the head element is 0 */
	  public void add(int index, E e) {
		  if(index==0){
		  	addFirst(e);
		  } else if(index>=size){
		  	addLast(e);
		  } else {
		  	Node<E> current = head;
		  	for(int i=0;i<index;i++) current = current.next;
		  		Node<E> temp = current.next;
		  		current.next = new Node<E>(e);
			  	(current.next).next =temp;
			  	size++;
		  }
	  }

	  /** Remove the head node and
	   *  return the object that is contained in the removed node. */
	  public E removeFirst() {
		  if(size==0){
		  	return null;
		  } else {
		  	Node<E> temp =head;
		  	head=head.next;
		  	size--;
		  	if(head==null)tail=null;
		  	return temp.element;
		  }
	  }

	  /** Remove the last node and
	   * return the object that is contained in the removed node. */
	  public E removeLast() {
		  if(size==0){
		  	return null;
		  } else if(size==1){
		  	Node<E> temp=head;
		  	head=tail=null;
		  	size=0;
		  	return temp.element;
		  } else {
		  	Node<E> current=head;
		  	for(int i=0;i<size-2;i++)current=current.next;
		  	Node<E> temp=tail;
		  	tail=current;
		  	tail.next=null;
		  	size--;
		  	return temp.element;
		  }
	  }

	  @Override /** Remove the element at the specified position in this 
	   *  list. Return the element that was removed from the list. */
	  public E remove(int index) {
	  	if(index<0 && index>=size){
	  		return null;
		} else if(index==0){
	  		removeFirst();
		} else if (index==size-1){
	  		removeLast();
		} else {
			Node<E> current = head;
			for (int i = 0; i < index; i++) current = current.next;
			Node<E> temp = current.next;
			Node<E> temp2 = temp.next;
			current.next = temp2;
			size--;
			return temp2.element;
		}
	  	return null;
	  }

	  @Override /** Override toString() to return elements in the list */
	  public String toString() {
	    StringBuilder result = new StringBuilder("[");

	    Node<E> current = head;
	    for (int i = 0; i < size; i++) {
	      result.append(current.element);
	      current = current.next;
	      if (current != null) {
	        result.append(", "); // Separate two elements with a comma
	      }
	      else {
	        result.append("]"); // Insert the closing ] in the string
	      }
	    }

	    return result.toString();
	  }

	  @Override /** Clear the list */
	  public void clear() {
	    size = 0;
	    head = tail = null;
	  }

	  @Override /** Return true if this list contains the element e */
	  public boolean contains(E e) {
	  	Node<E> current = head;
		  for(int i=0;i<size;i++){
		  	if(current.element==e){
		  		return true;
			} else {
		  		current = current.next;
			}
		  }
		  return false;
	  }

	  @Override /** Return the element at the specified index */
	  public E get(int index) {
	  	Node<E> current = head;
	  	for(int i=0;i<size;i++){
	  		if(i==index){
				return current.element;
			}
			current = current.next;
		}
	  	return null;
	  }

	  @Override /** Return the index of the head matching element in 
	   *  this list. Return -1 if no match. */
	  public int indexOf(E e) {
	  	Node<E> current = head;
		  for(int i=0;i<size;i++){
		  	if(current.element==e){
		  		return i;
			}
		  	current=current.next;
		  }
		  return -1;
	  }

	  @Override /** Return the index of the last matching element in 
	   *  this list. Return -1 if no match. */
	  public int lastIndexOf(E e) {
	  	int index = 0;
		  Node<E> current = head;
		  for(int i=0;i<size;i++){
			  if(current.element==e){
				  index+=i;
			  }
			  current=current.next;
		  }
		  if(index==0){
		  	return -1;
		  } else {
			  return index;
		  }
	  }

	  @Override /** Replace the element at the specified position 
	   *  in this list with the specified element. */
	  public E set(int index, E e) {
	  	Node<E> current=head;
		  for(int i=0;i<size;i++){
		  	if(i==index){
		  		current.element=e;
		  		return e;
			}
		  	current=current.next;
		  }
		  return null;
	  }

	  @Override /** Override iterator() defined in Iterable */
	  public java.util.Iterator<E> iterator() {
	    return new LinkedListIterator();
	  }

	  private void checkIndex(int index) {
	    if (index < 0 || index > size)
	      throw new IndexOutOfBoundsException
	        ("Index: " + index + ", Size: " + size);
	  }
	  
	  private class LinkedListIterator 
	      implements java.util.Iterator<E> {
	    private Node<E> current = head; // Current index 
	    
	    @Override
	    public boolean hasNext() {
	      return (current != null);
	    }

	    @Override
	    public E next() {
	      E e = current.element;
	      current = current.next;
	      return e;
	    }

	    @Override
	    public void remove() {

	    }
	  }
	  
	  private static class Node<E> {
	    E element;
	    Node next;

	    public Node(E element) {
	      this.element = element;
	    }
	  }
	}
