package collection;
import java.lang.*;
import java.util.*;

public class Linkedlistwithgenerics {

	public static void main(String[] args) {
		
		LinkedList<String> ls = new LinkedList<String>();
		
		ls.add("nikhil");
		ls.add("kohli");
		ls.add("is");
		ls.add("a");
		ls.add("bilionare");
 //		ls.add(45);             //showing error
		
		System.out.println(ls);
		

	}

}
