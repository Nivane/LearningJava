package thisisnobody.basic.multithreading.communication;
/**
 * 
 * @author ZLP 2018.06.13
 * 两个线程同时访问一个对象
 * 使用synchronized关键字实现了线程同步，同时只能有一个线程持有该对象的锁
 * 使用wait()将执行线程改成waiting状态
 * 使用notify()随机唤醒一个处于waiting状态的线程
 *
 */
public class Communication {

	public static void main(String[] args) {
		
		//chat对象
		Chat chat = new Chat();

		/*
		 * 两个线程共享chat对象，同步访问
		 * 提問綫程和回答綫程
		 */
		ThreadDemo1 t1 = new ThreadDemo1(chat, "QuestionThread");
		ThreadDemo2 t2 = new ThreadDemo2(chat, "AnswerThread");

		t1.start();
		t2.start();

	}
}
