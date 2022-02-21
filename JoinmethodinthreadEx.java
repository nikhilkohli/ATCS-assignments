package threadexample;

class Hello extends Thread{
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread is Running"); 
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
}

public class JoinmethodinthreadEx {
	public static void main(String[] args) throws InterruptedException {
		
		Hello hl= new Hello();
		
		hl.start();
		hl.join(10000);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread is Running"); 
			
			Thread.yield();
		}
		
	}

}
