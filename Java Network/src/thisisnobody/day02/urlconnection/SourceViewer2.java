package thisisnobody.day02.urlconnection;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
/**
 * 
 * @author ZLP
 * 1 URLConnection�ṩHTTP�ײ�����
 * 2 ���÷��͸����������������
 * 3 �����������д������
 */
public class SourceViewer2 {
	public static void main(String[] args) throws IOException {

		URL u = new URL("https://www.youtube.com/feed/subscriptions");
		URLConnection uc = u.openConnection();
		try (InputStream raw = uc.getInputStream()) {
			InputStream buffer = new BufferedInputStream(raw);
			Reader reader = new InputStreamReader(buffer);
			int c;
			while ((c = reader.read()) != -1) {
				System.out.print((char) c);
			}
		}

	}
}
