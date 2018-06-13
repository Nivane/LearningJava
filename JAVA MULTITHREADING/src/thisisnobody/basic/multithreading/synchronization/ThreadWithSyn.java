package thisisnobody.basic.multithreading.synchronization;
/**
 * 
 * @author ZLP 2018.06.13
 * 实现同步访问的多线程
 * 因为为对象添加了同步块，则同时只能有一个线程访问该对象
 */
public class ThreadWithSyn {

	public static void main(String[] args) {
		/*
		 * 实现了同步访问的测试
		 */
		PrintDemo printer1 = new PrintDemo();
		Thread t1 = new ThreadDemo1("Thread1", printer1);
		Thread t2 = new ThreadDemo1("Thread2", printer1);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}

	}

}

