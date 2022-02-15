package collection;

import java.util.ArrayList;

public class GenericsPrintEven {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		for(int i=0;i<10;i++)
		{
			al.add(i);
			
		}
		System.out.println(al);
		
		for(Object o:al)                 //prints even numbers
		{
			Integer i = (Integer) o;
			if(i%2==0)
			{
				System.out.println(i);
			}
			
		}


	}

}
