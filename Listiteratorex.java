package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Listiteratorex {
	public static void main(String[] args) {
		
        ArrayList<String> al = new ArrayList();
		
		al.add("Sweety");
		al.add("mayank");
		al.add("mahul");
		al.add("uma");
		al.add("arun");
		
		
		ListIterator itr = al.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("reverse direction");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
	}

}
