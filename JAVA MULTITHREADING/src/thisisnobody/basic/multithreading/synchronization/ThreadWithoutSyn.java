package thisisnobody.basic.multithreading.synchronization;

 /* 
 * @author ZLP 2018.06.13
 * 未实现同步访问的多线程
 * 每次输出都不一样，因为没有限制访问，任何时刻对象都可能被另一个线程抢占访问
 */
public class ThreadWithoutSyn {

	public static void main(String[] args) {

		/*
		 * 未实现同步访问的测试
		 */
		PrintDemo printer2 = new PrintDemo();
		Thread t3 = new ThreadDemo2("Thread3", printer2);
		Thread t4 = new ThreadDemo2("Thread4", printer2);
		t3.start();
		t4.start();
		try {
			t3.join();
			t4.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}

}