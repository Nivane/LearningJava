package thisisnobody.basic.multithreading.communication;

public class Chat {
	/*
	 * ��һ��Chat���͵Ķ��� falseʱquestion����,ִ�к���waiting��answer�߳�
	 * trueʱanswer�ش�ִ�к���waiting��question�߳�
	 */
	boolean flag = false;

	public synchronized void question(String q) {
		// trueʱ����waiting״̬
		if (flag) {
			try {
				wait();// ጷ��i
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}

		System.out.println(Thread.currentThread().getName() + ": " + q);

		flag = true;
		// ����waiting��answer�̣߳���δጷ��i
		notify();
	}

	public synchronized void answer(String a) {
		// falseʱ����waiting״̬
		if (!flag) {
			try {
				wait();// ጷ��i
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(Thread.currentThread().getName() + ": " + a);
		flag = false;
		// ����waiting��question�̣߳���δጷ��i
		notify();
	}
}