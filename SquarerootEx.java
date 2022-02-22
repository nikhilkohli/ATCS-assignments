package java8features;

import java.lang.*;

interface nikhil{  
    public void cal();  
}  
  
public class SquarerootEx {  
    public static void main(String[] args) {  
        int number=10;  
          
         
        nikhil r=()->{  
            System.out.println("Square root =  "+Math.sqrt(number));  
        };  
        r.cal();  
    }  
}  
