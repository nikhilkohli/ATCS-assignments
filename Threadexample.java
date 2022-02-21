package threadexample;


class Test2 extends Thread{
	
	public void run()
	{
		System.out.println("printing main method");
	}
	
}

public class Threadexample {
	
	public static void main(String[] args) {
		
		Test2 t = new Test2();
		t.start();
	}

}
