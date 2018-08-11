package thisisnobody.day02.socket.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

public class DictLatin {

	public static final String SERVER = "dict.org";
	public static final int PORT = 2628;
	public static final int TIMEOUT = 150000;

	public static void main(String[] args) {

		String[] args1 = { "hello", "bye" };
		Socket socket = null;
		try {

			socket = new Socket(SERVER, PORT);
			socket.setSoTimeout(TIMEOUT);
			OutputStream out = socket.getOutputStream();
			Writer writer = new OutputStreamWriter(out);
			writer = new BufferedWriter(writer);

			InputStream in = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
			for (String word : args1) {
				define(word, writer, reader);
			}

			writer.write("quit\r\n");
			writer.flush();

		} catch (IOException e) {
			System.err.println(e);
		}

	}

	static void define(String word, Writer writer, BufferedReader reader) throws IOException {
		writer.write("DEFINE eng-lat " + word + "\r\n");
		writer.flush();

		String line;
		while ((line = reader.readLine()) != null) {
			if (line.startsWith("250 ")) {
				return;
			} else if (line.startsWith("552 ")) {
				System.out.println("No definition found for " + word);
				return;
			} else if (line.matches("\\d\\d\\d .*"))
				continue;
			else if (line.trim().equals("."))
				continue;
			else
				System.out.println(line);
		}

	}
}
