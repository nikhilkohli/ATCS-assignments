package exceptionhandling;
import java.util.*;

public class Multitrycatchex {
	

	public static void main(String[] args) {
		
		try{    
            int a[]=new int[5];    
            a[5]=30/0;    
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Don't enter dominator as zero");  
              }    
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("Please enter a valid index");  
              }    
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs");  
              }             
           System.out.println("printing the remaining code of lines");    

	}

}
