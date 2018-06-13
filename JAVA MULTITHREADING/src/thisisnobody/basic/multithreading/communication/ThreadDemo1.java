package thisisnobody.basic.multithreading.communication;

public class ThreadDemo1 implements Runnable {

	private Chat chat;
	private Thread thread;
	private String name;
	private String[] questions = { "Whats ur name?", "How old are u?", "What do you mean?" };

	ThreadDemo1(Chat chat, String name) {
		this.chat = chat;
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < questions.length; i++) {
			chat.question(questions[i]);
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
