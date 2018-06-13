package thisisnobody.basic.multithreading.communication;

public class ThreadDemo2 implements Runnable {

	private Thread thread;
	private String name;
	private Chat chat;
	private String[] answers = { "HashiMoto", "26", "Nothing" };

	ThreadDemo2(Chat chat, String name) {
		this.chat = chat;
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < answers.length; i++) {
			chat.answer(answers[i]);
		}
	}

	public void start() {
		if (thread == null) {
			thread = new Thread(this, name);
		}
		System.out.println(name + " started...");
		thread.start();
	}

}
