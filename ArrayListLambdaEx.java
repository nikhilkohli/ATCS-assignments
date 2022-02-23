package java8features;

import java.util.ArrayList;

public class ArrayListLambdaEx {
	
	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<>();
		
		ar.add("nikhil");
		ar.add("kohli");
		ar.add("atcs");
		
		ar.forEach(

				(n)->System.out.println(n)
				
				);
		
		
	}

}
