package threadexample;

class Demo2 {
	int amount = 5000;

	synchronized void withdraw(int amount) {
		System.out.println("Money Withdraw will start in a minute ");

		if (this.amount < amount) {
			System.out.println("Less Balance ...Please Deposit Some");

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.amount -= amount;
			System.out.println("Withdrawal is Completed");
		}
	}

	synchronized void deposite(int amount) {
		System.out.println("Going to Deposite");
		this.amount += amount;
		System.out.println("Money Deposited Succesfully");
		notify();
	}

}

public class InterthreadEx {

	public static void main(String[] args) {
		
		Demo2 d = new Demo2();

		new Thread() {

			public void run() {
				d.withdraw(7000);
			}
		}.start();

		new Thread() {

			public void run() {
				d.deposite(1500);
			}
		}.start();
		

	}

}
