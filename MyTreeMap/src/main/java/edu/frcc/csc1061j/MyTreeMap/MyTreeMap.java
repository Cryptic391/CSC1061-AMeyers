package edu.frcc.csc1061j.MyTreeMap;

import java.util.Map;

public class MyTreeMap implements Map<K,V>{
	private Node root = null;
	private int size = 0;
	
	private class Node {
		protected K key;
		protected V value;
		protected Node lChild;
		protected Node rChild;
		
	}
	
}
