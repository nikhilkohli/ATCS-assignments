package exceptionhandling;

import java.util.Scanner;

public class Trycatchex {
	
	public static void main(String[] args) {
		
		int a,b;
		float div;
		
		System.out.println("Enter first number");
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		System.out.println("Enter second number");
		
		b = sc.nextInt();
		
		try
		{
			div = a/b;
			
			System.out.println("Division of two numbers is " +div);
		}
		
		catch (Exception e) {
			System.out.println("please enter valid numbers");
		}
		
		
		
	}
	
	

}
