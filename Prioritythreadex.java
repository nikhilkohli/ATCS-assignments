package threadexample;

class Demo extends Thread {
	
	public void run() {
	
		System.out.println("child thread Priority :"+Thread.currentThread().getPriority()); 
	}
	
}

public class Prioritythreadex {
	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		
		d1.start();
		
		
		System.out.println("main thread Priority :"+Thread.currentThread().getPriority()); 

		
	}

}
