package thisisnobody.basic.multithreading.synchronization;
/**
 * 
 * @author ZLP 2018.06.13
 * ʹ��ͬ�����ȡprinter���������ʵ��ͬ������
 */
public class ThreadDemo1 extends Thread {

	private Thread thread;
	private String name;
	private PrintDemo printer;

	ThreadDemo1(String name, PrintDemo printer) {
		this.name = name;
		this.printer = printer;
	}

	public void run() {
		synchronized (printer) {
			printer.printCount(name);
		}
		System.out.println("Thread " + name + " is exiting...");

	}

	public void start() {
		System.out.println("Starting Thread " + name);
		if (thread == null) {
			thread = new Thread(this, name);
		}
		thread.start();
	}

}