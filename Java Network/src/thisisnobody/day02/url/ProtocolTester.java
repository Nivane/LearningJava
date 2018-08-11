package thisisnobody.day02.url;

import java.net.MalformedURLException;
import java.net.URL;

public class ProtocolTester {
	
	public static void main(String[] args) {
		//String´´½¨url
		try {
			
			URL url = new URL("http://spark.apache.org/");
			System.out.println(url.getProtocol());
			System.out.println(url.getPort());
			System.out.println(url.getHost());
		}catch(MalformedURLException e) {
			System.err.println("ex");
		}
		
		
		//protocol + hostname + file
		
		
		
	}
}
