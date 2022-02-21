package threadexample;

class Runner extends Thread{
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Calling Child Thread"); 
			
			Thread.yield();
		}
	}
	
}

public class YieldmethodEax {

	public static void main(String[] args) {
		Runner r1 = new Runner();
		r1.start();
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Calling main Thread"); 
		}
	}

}
