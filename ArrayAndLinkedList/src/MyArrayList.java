import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List<T>{
	private T[] array;
	private int size;
	
	@SuppressWarnings("unchecked")
	public MyArrayList() {
		array = (T[]) new Object[4];
		size = 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
//		if(size == 0) {
//			return true;
//		}
//		return false;
		
		return size == 0;
	}

	@Override
	public boolean contains(Object o) {
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		return null;
	}

	@Override
	public Object[] toArray() {
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}

	@Override
	public boolean add(T e) {
		if(size >= array.length) {
			@SuppressWarnings("unchecked")
			T[] bigger = (T[]) new Object[array.length * 2];
			for(int i =0; i < array.length; i++) {
				bigger[i] = array[i];
			}
			array = bigger;
		}
		array[size++] = e;
//		size ++;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	@Override
	public void clear() {
		size = 0;
	}

	@Override
	public T get(int index) {
		if(index > 0 || index < size) {
			throw new IndexOutOfBoundsException();
		}
		
		return array[index];
	}

	@Override
	public T set(int index, T element) {
		T old = get(index);
		array[index] = element;
		return old;
	}

	@Override
	public void add(int index, T element) {
		
	}

	@Override
	public T remove(int index) {
		return null;
	}

	@Override
	public int indexOf(Object o) {
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		return null;
	}
	
	
	
	
}
