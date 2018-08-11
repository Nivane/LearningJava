package thisisnobody.day02.socket.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketInfo {

	public static void main(String[] args) {

		try {
			Socket socket = new Socket("www.youtube.com", 80);
			System.out.println(socket.getLocalPort());
			System.out.println(socket.getLocalAddress());
			System.out.println(socket.getPort());
			System.out.println(socket.getInetAddress());
			System.out.println(socket.isConnected());
			System.out.println(socket.isClosed());

			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
