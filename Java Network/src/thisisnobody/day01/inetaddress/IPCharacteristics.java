package thisisnobody.day01.inetaddress;

import java.io.IOException;
import java.net.InetAddress;

public class IPCharacteristics {
	public static void main(String[] args) throws IOException {
		
		InetAddress address = InetAddress.getByName("www.baidu.com");
		if(address.isAnyLocalAddress()) {
			System.out.println(address + " is a wildcard address.");
		}else {
			System.out.println(address + " is not a wildcard address.");
		}
		
		if(address.isReachable(100)) {
			System.out.print( address + " can be accessed in 100ms");
		}
	}
}
