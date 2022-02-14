package collection;
import java.util.*;

public class Test {

	public static void main(String[] args) {


		ArrayList al = new ArrayList();
		
		System.out.println("using add method: ");
		
		for(int i=0;i<10;i++)
		{
			al.add(i);
			
		}
		System.out.println(al);
		
		System.out.println("using get method");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("using for each loop: ");
		
		for(Object o:al)
		{
			System.out.println(o);
		}
		
		System.out.println("using iterator");
		
		for(Object o:al)                 //prints odd numbers
		{
			Integer i = (Integer) o;
			if(i%2!=0)
			{
				System.out.println(i);
			}
			
		}

	}

}
