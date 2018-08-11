package thisisnobody.day02.socket.client;

import java.io.IOException;
import java.net.Socket;

public class LowPortScanner {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		String host = "www.youtube.com";
		for (int i = 23; i < 1024; i++) {
			try {
				Socket socket = new Socket(host, i);
				System.out.println("There is a server on port " + i + " of localhost");
			} catch (IOException e) {
				System.err.println("PORT: " + i + " EXCEPTION: " + e);
			}
		}
	}
}
