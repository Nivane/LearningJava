package thisisnobody.day02.url;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEncoderTest {

	private StringBuilder query = new StringBuilder();

	public static void main(String[] args) throws UnsupportedEncodingException {

		URLEncoderTest t = new URLEncoderTest();
		t.add("hl", "?en");
		t.add("ad", "/java");
		t.add("as", "///I/O");
		String url = "http://www.google.com/search?" + t;
		System.out.println(url);

		String decode = URLDecoder.decode(url, "UTF-8");
		System.out.println(decode);

	}

	public synchronized void add(String name, String value) {

		query.append("&");
		encode(name, value);

	}

	private synchronized void encode(String name, String value) {

		try {
			query.append(URLEncoder.encode(name, "UTF-8"));
			query.append("=");
			query.append(URLEncoder.encode(value, "UTF-8"));
		} catch (UnsupportedEncodingException ex) {
			throw new RuntimeException("Broken VM does not support UTF-8");

		}
	}

	public synchronized String getQuery() {
		return query.toString();

	}

	public String toString() {
		return getQuery();
	}

}
