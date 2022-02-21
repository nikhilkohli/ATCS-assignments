package threadexample;

class Welcome extends Thread{
	
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println("Printing Slide: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}

public class SleepmethodinthreadEx {

	public static void main(String[] args) {

		Welcome hi = new Welcome();
		hi.start();
		
		

	}

}
