package collection;

import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		for(int i=0;i<10;i++)
		{
			hs.add(i);
			
		}
		
		hs.add("nikhil");
		hs.add("kohli");
		hs.add(55.0f);
		
		System.out.println(hs);
		
		
		
		

	}

}
