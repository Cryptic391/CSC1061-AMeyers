package edu.frcc.csc1061j.MyTreeMap;

public class MyTreeMapTest {
	
	public static void main(String[] args) {
		MyTreeMap<Integer,Integer> map = new MyTreeMap();
		
		map.put(1,5);
		map.put(2,4);
		map.put(3,3);
		map.put(4,2);
		map.put(5,1);
		
		for(Integer num : map) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.println(map.get(1));
		
		System.out.println(map.values());
	
	}

}
