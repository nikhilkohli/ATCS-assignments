package com.ia.employeecrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("nikhil");
		
		EntityManager entity = factory.createEntityManager();
		
		Employee emp = new Employee(1509, "nikhil", 500000, "delhi");
		
		entity.getTransaction().begin();
		
		entity.persist(emp);
		
		Employee emp1=entity.find(Employee.class, 1509);
		System.out.println(emp1); 
		
		emp.setEmpAdd("gurugram");
		emp.setEmpname("vikrant");
		emp.setEmpsal(35000);
	
		entity.getTransaction().commit();
		
		
		
	}
	

	
}

////persist()-->save or insert, merge()-->update, remove()-->delte, find()==>selct fetch
//entity.merge(emp);
//entity.remove(emp);


