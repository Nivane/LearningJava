

package thisisnobody.basic.multithreading.runnable;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountLockCondition implements Runnable {

	private int amount = 10;
	
	private Lock lock = new ReentrantLock();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		lock.lock();
		try {
			for (int i = 0; i < 3; i++) {
				amount -= 1;
				System.out.println(Thread.currentThread().getName() + ": " + amount);

			}
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
		

	}



	public static void main(String[] args) {
		BankAccountLockCondition b1 = new BankAccountLockCondition();

		Thread t1 = new Thread(b1, "User1");
		Thread t2 = new Thread(b1, "User2");
		Thread t3 = new Thread(b1, "User3");
		t1.start();
		t2.start();
		t3.start();
	}

}

