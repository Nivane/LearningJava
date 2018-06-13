package thisisnobody.basic.multithreading.synchronization;
/**
 * 
 * @author ZLP 2018.06.13
 * 未实现线程同步
 */
public class ThreadDemo2 extends Thread{
	
	private Thread thread;
	private String name;
	private PrintDemo printer;
	
	
	ThreadDemo2(String name, PrintDemo printer){
		this.name = name;
		this.printer = printer;
	}
	
	public void run() {
		try {
		printer.printCount(name);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Thread " + name + " is exiting...");
	}
	
	public void start() {
		System.out.println("Starting Thread " + name);
		if(thread == null) {
			thread = new Thread(this, name);
		}
		thread.start();
	}
}
