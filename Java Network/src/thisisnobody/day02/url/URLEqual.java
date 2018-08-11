package thisisnobody.day02.url;

import java.net.MalformedURLException;
import java.net.URL;

public class URLEqual {
	public static void main(String[] args) throws MalformedURLException {

		URL www = new URL("https://www.youtube.com");
		URL youtube = new URL("https://www.youtube.com");

		System.out.println(www.equals(youtube));

		System.out.println(www.hashCode());

		System.out.println(youtube.hashCode());

	}
}
