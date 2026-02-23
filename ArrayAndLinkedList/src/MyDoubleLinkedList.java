import java.lang.reflect.InaccessibleObjectException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyDoubleLinkedList<E> implements List<E> {
	
	//Data Members
	private Node head = null;
	private Node tail = null;
	private int size = 0;
	
	private class Node {
		public E data;
		public Node next;
		public Node prev;
		
		public Node(E data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E e) {
		Node newNode = new Node(e);
		if(head == null) {
			head = newNode;
//			tail = newNode;
		}
		else {
			Node node = null;
//			for(node = head; node.next != null; node = node.next) {
//				
//			}
			tail.next = newNode;
			newNode.prev = tail;
//			tail = newNode;
			
		}
		tail = newNode;
		size++;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		head = null;
		tail = null;
		size = 0;
		
	}

	private Node getNode(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Bad index into list");
		}
		Node node = head;
		for(int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}
	
	@Override
	public E get(int index) {
		Node node = getNode(index);
		return node.data;
	}

	@Override
	public E set(int index, E element) {
		Node node = getNode(index);
		E old = node.data;
		node.data = element;
		return old;
	}

	@Override
	public void add(int index, E element) {
		Node newNode = new Node(element);
		
		if(index == 0 ) {
			newNode.next = head;
			head.prev = newNode;
			if(tail == null) {
				tail = newNode;
			}
			head = newNode;
		}
		else {
			Node prevNode = getNode(index-1);
			newNode.next = prevNode.next;
			newNode.prev = prevNode;
			prevNode.next = newNode;
			if(newNode.next != null) {
				newNode.next.prev = newNode;
			}
		}
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
