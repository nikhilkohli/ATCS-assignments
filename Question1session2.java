package collection;
import java.util.*;

public class Question1session2 {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm= new TreeMap();
		
		tm.put(111, "jatt");
		tm.put(112, "diya");
		tm.put(114, "breka");
		tm.put(116, "fail");
		tm.put(119, "ni");
		System.out.println(tm);
		
		
		Set<Integer> keys = tm.keySet();
		
		Iterator itr=keys.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
