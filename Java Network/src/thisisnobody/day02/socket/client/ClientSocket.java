package thisisnobody.day02.socket.client;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.Socket;

public class ClientSocket {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket("time.nist.gov", 13);
			socket.setSoTimeout(10000);
			InputStream in = socket.getInputStream();
			in = new BufferedInputStream(in);
			Reader reader = new InputStreamReader(in, "ASCII");

			int c;
			// System.out.println(reader.read());
			while ((c = reader.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (IOException e) {
			System.err.println("Something is wrong! " + e);
		}
	}
}
