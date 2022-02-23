package java8features;

import java.lang.*;

interface nikhil1{  
    public void cal(int a, int b );  
}  
  
public class AddparamEx {  
    public static void main(String[] args) {  
        int sum=0; 

          
         
        nikhil1 r=(int a, int b)->{  
           
			System.out.println("Additioin of numbers  =  "+(a+b));  
        };  
        r.cal(10,15);  
    }  
}  
