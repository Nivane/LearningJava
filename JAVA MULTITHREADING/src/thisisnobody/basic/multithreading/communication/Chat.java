package thisisnobody.basic.multithreading.communication;

public class Chat {
	/*
	 * 对一个Chat类型的对象 false时question提问,执行后唤醒waiting的answer线程
	 * true时answer回答，执行后唤醒waiting的question线程
	 */
	boolean flag = false;

	public synchronized void question(String q) {
		// true时进入waiting状态
		if (flag) {
			try {
				wait();// 釋放鎖
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}

		System.out.println(Thread.currentThread().getName() + ": " + q);

		flag = true;
		// 唤醒waiting的answer线程，尚未釋放鎖
		notify();
	}

	public synchronized void answer(String a) {
		// false时进入waiting状态
		if (!flag) {
			try {
				wait();// 釋放鎖
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(Thread.currentThread().getName() + ": " + a);
		flag = false;
		// 唤醒waiting的question线程，尚未釋放鎖
		notify();
	}
}