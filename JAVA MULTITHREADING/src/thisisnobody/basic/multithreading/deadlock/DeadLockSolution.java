package thisisnobody.basic.multithreading.deadlock;
/**
 * 
 * @author ZLP 2018.06.13
 * 死鎖
 * synchronized同步塊未占用另一個綫程需要的資源，有序同步
 */
public class DeadLockSolution {

	public static void main(String[] args) {
	
		//未形成死鎖
		String s1 = "lock1";
		String s2 = "lock2";
		ThreadDemo1 t1 = new ThreadDemo1(s1, s2);
		ThreadDemo1 t2 = new ThreadDemo1(s1, s2);
		new Thread(t1, "Thread1").start();
		new Thread(t2, "Thread2").start();

	}
}


