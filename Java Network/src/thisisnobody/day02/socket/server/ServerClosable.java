package thisisnobody.day02.socket.server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerClosable {

	public static final int PORT = 13;

	public static void main(String[] args) {

		try (ServerSocket server = new ServerSocket(PORT)) {

			while (true) {
				try (Socket connection = server.accept()) {
					OutputStream out = connection.getOutputStream();
					Writer writer = new OutputStreamWriter(out);
					writer = new BufferedWriter(writer);

					Date date = new Date();
					writer.write(date.toString() + "\r\n");
					writer.flush();
					writer.close();
					connection.close();
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
