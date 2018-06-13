package thisisnobody.basic.multithreading.synchronization;

public class PrintDemo {
	public void printCount(String name) {
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(name + " Counter: " + i);
				Thread.sleep(200);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
