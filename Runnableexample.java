package threadexample;

class Test implements Runnable{

	@Override
	public void run() {
		System.out.println("printing using runnable interface");
		
	}
	
}

public class Runnableexample {
	
	public static void main(String[] args) {
		
		Test t = new Test();
		Thread th = new Thread(t);
		th.start();
		
	}

}
