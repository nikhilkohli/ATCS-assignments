package exceptionhandling;
import java.util.*;

public class Scannerclassdividenumbers {

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
