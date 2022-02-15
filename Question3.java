package collection;

import java.util.*;

import java.util.Iterator;

public class Question3 {
	public static void main(String[] args) {
		
		HashSet hs1 = new HashSet();
		
		hs1.add("nikhil");
		hs1.add("kohli");
		hs1.add(1509);
		hs1.add(41.666f);
		hs1.add("jaipur");
		
		
		
        Iterator itr = hs1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
