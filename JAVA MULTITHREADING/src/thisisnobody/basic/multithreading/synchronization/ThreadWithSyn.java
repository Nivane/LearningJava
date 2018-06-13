package thisisnobody.basic.multithreading.synchronization;
/**
 * 
 * @author ZLP 2018.06.13
 * ʵ��ͬ�����ʵĶ��߳�
 * ��ΪΪ���������ͬ���飬��ͬʱֻ����һ���̷߳��ʸö���
 */
public class ThreadWithSyn {

	public static void main(String[] args) {
		/*
		 * ʵ����ͬ�����ʵĲ���
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

