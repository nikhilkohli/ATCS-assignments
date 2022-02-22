package threadexample;

class Example2 {
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

public class Account {

	public static void main(String[] args) {
		
		Example2 ep = new Example2();

		new Thread() {

			public void run() {
				ep.withdraw(7000);
			}
		}.start();

		new Thread() {

			public void run() {
				ep.deposite(1500);
			}
		}.start();
		

	}

}
