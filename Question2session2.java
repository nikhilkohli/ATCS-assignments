package collection;

import java.security.KeyStore.Entry;
import java.util.*;

public class Question2session2 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm = new TreeMap();
		
		tm.put(01, "nikhil kohli");
		tm.put(02, "nikhil sharma");
		tm.put(03, "nikhil gupta");
		tm.put(04, "nikhil jain");
		
		System.out.println(tm);
		
		Set<java.util.Map.Entry<Integer, String>> result = tm.entrySet();
		
		System.out.println("-------------------------------------------");
		
		System.out.println("entry set: ");
		
        Iterator itr=result.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
