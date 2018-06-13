package thisisnobody.basic.multithreading.synchronization;

 /* 
 * @author ZLP 2018.06.13
 * δʵ��ͬ�����ʵĶ��߳�
 * ÿ���������һ������Ϊû�����Ʒ��ʣ��κ�ʱ�̶��󶼿��ܱ���һ���߳���ռ����
 */
public class ThreadWithoutSyn {

	public static void main(String[] args) {

		/*
		 * δʵ��ͬ�����ʵĲ���
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