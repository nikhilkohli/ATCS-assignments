package java8features;

interface Demo{
	public void d();
}

public class Lambda {
	public static void main(String[] args) {
		int a=10;
		Demo dt=()-> System.out.println("value of a using Lambda: "+a);
		dt.d();
		
		
		System.out.println("Values using Lambda Block ---");
		Demo dt1=()->{
			for(int i=0;i<=a;i++) {
				
				System.out.println(i);
			}
		};
		dt1.d();
	}

}