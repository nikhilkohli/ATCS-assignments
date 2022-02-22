package java8features;

interface Runnable{  
    public void draw();  
}  
  
public class LambdaEx {  
    public static void main(String[] args) {  
        int width=10;  
          
        //with lambda  
        Runnable r=()->{  
            System.out.println("Width =  "+width);  
        };  
        r.draw();  
    }  
}  
