package collection;

import java.util.*;
public class Linkedhashset {

	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("sathya");
		lhs.add("vinay");
		lhs.add("anjali");
		lhs.add("vinay");
		lhs.add(45);
		lhs.add(45.08f);
		lhs.add(true);
		lhs.add(null);
		
		System.out.println(lhs);
		
		
	}
}
