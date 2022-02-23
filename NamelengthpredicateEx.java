package java8features;

import java.util.function.Predicate;

public class NamelengthpredicateEx {
	
	public static void main(String[] args) {
		
		String s[] = {"nikhilkohli","nikhil"};
		
		Predicate<String> p = a->a.length()>6;
		
		for(String s1:s)
		{
			if(p.test(s1));
			System.out.println(p.test(s1));
		}
	}

}
