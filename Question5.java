package collection;

import java.util.*;

public class Question5 {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("nikhil");
		hs.add("kohli");
		hs.add("atcs");
		hs.add("java");
		hs.add("java");

		System.out.println(hs);
		
		
        HashSet<String> hs1 = new HashSet<String>();
        
		hs1.add("developer");
		hs1.add("computers");
		
		
		
		hs.addAll(hs1);
		System.out.println(hs);
		
		hs.remove(hs1);
		System.out.println(hs1);

		
		
		
		

	}

}
