package collection;

import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		
	LinkedHashSet hs = new LinkedHashSet();
	
	for(int i=0;i<10;i++)
	{
		hs.add(i);
		
	}
	
	hs.add("Linked");
	hs.add("Hash");
	hs.add("set");
	hs.add(55.0f);
	
	System.out.println(hs);

	}

}
