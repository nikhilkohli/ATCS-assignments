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
		
		div = a/b;
		
		System.out.println("Division of two numbers is " +div);
		
	}
	
}


	Enter first number
        15
        Enter second number
        0
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	       at exceptionhandling.Scannerclassdividenumbers.main(Scannerclassdividenumbers.java:21)
