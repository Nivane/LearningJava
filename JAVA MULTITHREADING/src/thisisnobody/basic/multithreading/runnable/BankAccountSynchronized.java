package thisisnobody.basic.multithreading.runnable;

/**
 * @author ThisIsNobody 2018.06.11 
 * ʹ��synchronized�ؼ�����ʵ���߳�ͬ��
 */
public class BankAccountSynchronized implements Runnable {

	private int amount = 10;

	@Override
	public synchronized void run() {

		/* forѭ��ÿ�ν����н���ȥ1�������amount */
		for (int i = 0; i < 3; i++) {
			amount -= 1;
			System.out.println(Thread.currentThread().getName() + ": " + amount);
		}

	}

	public static void main(String[] args) {
		// ����ͬ������
		BankAccountSynchronized b1 = new BankAccountSynchronized();

		Thread t1 = new Thread(b1, "User1");
		Thread t2 = new Thread(b1, "User2");
		Thread t3 = new Thread(b1, "User3");
		t1.start();
		t2.start();
		t3.start();
	}

}