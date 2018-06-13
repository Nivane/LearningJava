package thisisnobody.basic.multithreading.communication;
/**
 * 
 * @author ZLP 2018.06.13
 * �����߳�ͬʱ����һ������
 * ʹ��synchronized�ؼ���ʵ�����߳�ͬ����ͬʱֻ����һ���̳߳��иö������
 * ʹ��wait()��ִ���̸߳ĳ�waiting״̬
 * ʹ��notify()�������һ������waiting״̬���߳�
 *
 */
public class Communication {

	public static void main(String[] args) {
		
		//chat����
		Chat chat = new Chat();

		/*
		 * �����̹߳���chat����ͬ������
		 * �ᆖ�Q�̺ͻش�Q��
		 */
		ThreadDemo1 t1 = new ThreadDemo1(chat, "QuestionThread");
		ThreadDemo2 t2 = new ThreadDemo2(chat, "AnswerThread");

		t1.start();
		t2.start();

	}
}
