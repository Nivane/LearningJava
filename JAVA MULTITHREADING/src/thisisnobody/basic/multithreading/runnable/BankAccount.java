package thisisnobody.basic.multithreading.runnable;

public class BankAccount implements Runnable {

	private int amount = 10;

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 3; i++) {
			amount -= 1;
			System.out.println(Thread.currentThread().getName() + ": " + amount);
		}
		
	}


	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();

		Thread t1 = new Thread(b1, "User1");
		Thread t2 = new Thread(b1, "User2");
		Thread t3 = new Thread(b1, "User3");
		t1.start();
		t2.start();
		t3.start();
	}

}
