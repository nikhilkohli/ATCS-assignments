package java8features;

import java.util.function.Predicate;

public class PredicateEx {
public static void main(String[] args) {
	

	
	Predicate<Integer> p1=i->i%2==0;
	
	System.out.println(p1.test(45));
	System.out.println(p1.test(24));

	
	
}
}