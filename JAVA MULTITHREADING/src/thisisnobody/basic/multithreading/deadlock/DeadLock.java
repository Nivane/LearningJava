package thisisnobody.basic.multithreading.deadlock;
/**
 * 
 * @author ZLP 2018.06.13
 * 死鎖
 * synchronized同步塊中互相等待資源，永遠阻塞
 * 共享lock1, lock2兩個變量,綫程是同時啓動的，綫程分別占有一個lock，但是誰也沒有釋放
 */
public class DeadLock {

	public static void main(String[] args) {
	
		//形成死鎖
		String s1 = "lock1";
		String s2 = "lock2";
		ThreadDemo1 t1 = new ThreadDemo1(s1, s2);
		ThreadDemo1 t2 = new ThreadDemo1(s2, s1);
		new Thread(t1, "Thread1").start();
		new Thread(t2, "Thread2").start();
		
	}
}

class ThreadDemo1 implements Runnable {

	private String lock1;
	private String lock2;

	ThreadDemo1(String lock1, String lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	@Override
	public void run() {

		synchronized (lock1) {
			System.out.println(Thread.currentThread().getName() + " Holding " + lock1);
			System.out.println(Thread.currentThread().getName() + " Waiting For " + lock2);
			synchronized (lock2) {
				System.out.println(Thread.currentThread().getName() + " Holding " + lock2 + " and " + lock1);
			}
		}

	}

}
