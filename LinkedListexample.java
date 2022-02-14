package collection;

import java.util.*;

public class LinkedListexample {

	public static void main(String[] args) {
		
		LinkedList li = new LinkedList();
		
		li.add(1000);
		li.add("nikhil");
		li.add(45.75f);
		li.add(false);
		li.add(null);
		
		
		
		System.out.println(li);
		System.out.println(li.size());
		System.out.println(li.contains("nikhil"));
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		System.out.println(li.isEmpty());
		System.out.println(li.remove());
		System.out.println(li.size());
		

	}

}
