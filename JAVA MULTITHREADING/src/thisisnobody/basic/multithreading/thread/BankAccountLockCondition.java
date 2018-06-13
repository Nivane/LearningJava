package thisisnobody.basic.multithreading.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountLockCondition extends Thread {

	private int amount = 10;
	private Lock lock = new ReentrantLock();

	public BankAccountLockCondition(String name) {
		this.setName(name);
	}

	public BankAccountLockCondition() {
		super();
	}

	public void run() {
		lock.lock();
		try {
			for (int i = 0; i < 3; i++) {
				amount -= 1;
				System.out.println(Thread.currentThread().getName() + ": " + amount);
			}
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) {

		Thread t = new BankAccountLockCondition();
		Thread t1 = new Thread(t, "User1");
		Thread t2 = new Thread(t, "User2");
		Thread t3 = new Thread(t, "User3");
		t1.start();
		t2.start();
		t3.start();

	}

}
