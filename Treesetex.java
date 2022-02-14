package collection;
import java.util.*;

public class Treesetex {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("vinay");
		ts.add("sathya");
		ts.add("vinay");
		ts.add("anjali");
		ts.add("niharika");
		ts.add("uma");
		ts.add("khushi");
		ts.add("sweety");
		
		System.out.println(ts);
	}
}

class Mycomporator implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		
		String name1 = (String) o1;
		String name2 = (String) o2;
		
		return name1.compareTo(name2);
	}
	
	
}
