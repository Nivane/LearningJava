package thisisnobody.basic.multithreading.runnable;

/**
 * @author ThisIsNobody 2018.06.11 
 * 使用synchronized关键字来实现线程同步
 */
public class BankAccountSynchronized implements Runnable {

	private int amount = 10;

	@Override
	public synchronized void run() {

		/* for循环每次将银行金额减去1，并输出amount */
		for (int i = 0; i < 3; i++) {
			amount -= 1;
			System.out.println(Thread.currentThread().getName() + ": " + amount);
		}

	}

	public static void main(String[] args) {
		// 创建同步对象
		BankAccountSynchronized b1 = new BankAccountSynchronized();

		Thread t1 = new Thread(b1, "User1");
		Thread t2 = new Thread(b1, "User2");
		Thread t3 = new Thread(b1, "User3");
		t1.start();
		t2.start();
		t3.start();
	}

}