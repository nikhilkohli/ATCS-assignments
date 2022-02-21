package threadexample;

class Example extends Thread{
	
	public void run() {
		
		System.out.println("child thread = "+Thread.currentThread().getName());
		
	}
}

public class Getnamethreadex {
	
	public static void main(String[] args) {
		
		Example eg = new Example();
		Example eg1 = new Example();
		
		eg.start();
		
		System.out.println("main thread before = "+Thread.currentThread().getName()); //main
		
		Thread.currentThread().setName("nikhil");
		System.out.println(Thread.currentThread().getName());
	}

}
