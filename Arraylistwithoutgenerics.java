package collection;

import java.util.ArrayList;

public class Arraylistwithoutgenerics {

	public static void main(String[] args) {


		ArrayList al = new ArrayList();
		
		for(int i=0;i<10;i++)
		{
			al.add(i);
			
		}
		
		al.add("nikhil");
		
		System.out.println(al);

	}

}
