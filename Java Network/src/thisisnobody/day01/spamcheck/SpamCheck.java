package thisisnobody.day01.spamcheck;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class SpamCheck {
	
	public static final String BLACKHOLE = "sbl.spamhaus.org";
	
	
	
	public static void main(String[] args) {
		
		System.out.println(isSpammer("www.baidu.com"));
		
		
	}
	
	private static boolean isSpammer(String arg)  {
		
		try {
		InetAddress address = InetAddress.getByName(arg);
		byte[] quad = address.getAddress();
		String query = BLACKHOLE;
		
		for(byte octet : quad) {
			int unsignedByte = octet < 0 ? octet + 256 : octet;
			query = unsignedByte + "." + query;
		}
		
		InetAddress.getByName(query);
		return true;
		
		}catch(UnknownHostException e) {
			return false;
		}
		
		
		
	}
	
	
}
