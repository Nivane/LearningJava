package thisisnobody.day02.url;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class SourceViewer {

	public static void main(String[] args) throws IOException {

		// URL
		URL url = new URL("http://spark.apache.org");
		InputStream in = url.openStream();
		in = new BufferedInputStream(in);
		Reader r = new InputStreamReader(in);
		int c;
		while ((c = r.read()) != -1) {
			System.out.print((char) c);
		}

		// URLConnection
		// getContent()

	}
}
