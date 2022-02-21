package javapractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Runner {

	public static void main(String[] args) {
		
		int empid=100;
		 
		 HashMap<Integer, Employee> hs = new HashMap<>();
		 
		 while(true) {
				
				System.out.println("Welcome to ATCS! ");
				System.out.println("1.Add Employee");
				System.out.println("2.Update Employee Details");
				System.out.println("3.Get Employee Data");
				System.out.println("4.Get All Employees Data");
				System.out.println("5.Delete Employee");
				
				Scanner sc= new Scanner(System.in);
				
				int choice=sc.nextInt();
				
				
				switch(choice)
				{
				case 1:
					
					System.out.println("Enter Employee name");
					String empname=sc.next();
					
					System.out.println("Enter Employee code");
					int empcode=sc.nextInt();
					
					System.out.println("Enter Employee Salary");
					int empsalary=sc.nextInt();
					
					System.out.println("Enter Employee address");
					String empaddress=sc.next();
					
					System.out.println("Enter Employee pincode");
					int emppincode=sc.nextInt();
					  
					Employee em = new Employee(empname, empsalary, empcode, empaddress, emppincode);
					 
					hs.put(++empid,em);
					 
					 System.out.println("Employee addedd successfully :"+empid);
					     
					break;
					
					
				case 2:
							
					   System.out.println("Enter to Update the Employee Details");
			    	   
			    	   System.out.println("ENTER ID TO UPDATE");
			    	   int empid1=sc.nextInt();
			    	   
			   
			    	   System.out.println("Enter Employee name");
					   String empname1=sc.next();
					   
					   System.out.println("Enter Employee code");
					   int empcode1=sc.nextInt();
					    
					   System.out.println("Enter Employee Salary");
					   int empsalary1=sc.nextInt();
						
					   System.out.println("Enter Employee address");
					   String empaddress1=sc.next();
					   
					   System.out.println("Enter Employee pincode");
					   int emppincode1=sc.nextInt();
			    	   
					   Employee em1 = new Employee(empname1, empcode1, empsalary1, empaddress1, emppincode1);
					   
					   hs.put(empid1, em1);
						     
					   System.out.println("Employee Details updated suscfully :"+empid1);
					   break;
					   
					   
			       case 3:
			    	   
			    	   System.out.println("Enter id to get the Employee details");
			    	   int empid2=sc.nextInt();
			 
			    	   Employee em2=hs.get(empid2);
			    	   System.out.println(em2);
			    	   break;
						
						
			       case 4:
			    	   
			    	   Set<java.util.Map.Entry<Integer, Employee>> result = hs.entrySet();
			    	   Iterator<java.util.Map.Entry<Integer, Employee>> itr = result.iterator();
			    	   
			    	   while(itr.hasNext()) {
			    		   java.util.Map.Entry<Integer, Employee> finalres = itr.next();
			    		   System.out.println(finalres.getKey()+"  "+finalres.getValue());
			    		   
			    		   
			    	   }
			    	   break;
						
						
			       case 5:
			    	   
			    	   System.out.println("Enter id to delete Employee");
			    	   int empid3= sc.nextInt();
			    	   
			    	   Employee em3=hs.remove(empid3);
			    	   System.out.println("product deleted :"+empid3);
			    	   break;
					
					
					default:
						System.out.println("Wrong selection.....");
				}
				
		 }
		 
	}

	}

