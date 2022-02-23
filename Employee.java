package java8features;

import java.util.ArrayList;
import java.util.function.Predicate;


class Emp{
	
	String name;
	int salary;
	
	
	public Emp(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "emp [name=" + name + ", Salary=" + salary + "]";
	}
	
	
}

public class Employee {

	public static void main(String[] args) {
		
		ArrayList<Emp> ar = new ArrayList<Emp>();
		
		ar.add(new Emp("Nikhil",50000));
		ar.add(new Emp("Subash",5000));
		ar.add(new Emp("Sudesh",20000));
		ar.add(new Emp("ankush",3000));
		
		Predicate<Emp> p =a->a.salary>7000;
		
		
		for(Emp e:ar)
		
		{
			if(p.test(e));
			System.out.println(p.test(e));
		}
		
	
		
		
	}
}
