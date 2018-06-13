package thisisnobody.basic.multithreading.thread;

public class BankAccount extends Thread {

	private int amount = 10;

	public void run() {

		for (int i = 0; i < 3; i++) {
			amount -= 1;
			System.out.println(Thread.currentThread().getName() + ": " + amount);
		}
	}

	public static void main(String[] args) {
		Thread t = new BankAccount();

		Thread t1 = new Thread(t, "User1");
		Thread t2 = new Thread(t, "User2");
		Thread t3 = new Thread(t, "User3");
		t1.start();
		t2.start();
		t3.start();

	}

}
