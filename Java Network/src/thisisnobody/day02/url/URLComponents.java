package thisisnobody.day02.url;

import java.io.IOException;
import java.net.URL;

public class URLComponents {
	public static void main(String[] args) throws IOException {

		URL url = new URL("https://www.youtube.com/feed/subscriptions");
		System.out.println("URL is " + url);
		System.out.println("URL is " + url.getProtocol());
		System.out.println("URL is " + url.getUserInfo());
		System.out.println("URL is " + url.getHost());
		System.out.println("URL is " + url.getPort());
		System.out.println("URL is " + url.getPath());
		System.out.println("URL is " + url.getFile());
		System.out.println("URL is " + url.getRef());
		System.out.println("URL is " + url.getQuery());
		System.out.println("URL is " + url.getAuthority());

	}
}
