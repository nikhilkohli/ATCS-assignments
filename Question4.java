package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Question4 {

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
		
       Iterator itr = lhs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
