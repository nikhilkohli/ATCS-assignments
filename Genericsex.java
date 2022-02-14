package collection;

import java.util.*;

public class Genericsex {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList();
		
		al.add("Sweety");
		al.add("mayank");
		al.add("mahul");
		al.add("uma");
		al.add("arun");
		
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
